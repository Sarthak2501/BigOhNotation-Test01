import java.lang.reflect.Array;
import java.util.ArrayList;

public class QoneTest {
    public static void allCharacter(String str1,int i , String str2,int j ,String ans){
        //String ans = " ";
        int ls1 = str1.length();
        int ls2 = str2.length();

        if (i == ls1 && j == ls2) {
            System.out.println(ans);
        }
        double NoOfCombinition = Math.pow((double) 2 ,(double) (ls1 + ls2));

        if (i < ls1) {
            allCharacter(str1, i + 1, str2, j, ans + str1.charAt(i));
        }
        if (j < ls1) {
            allCharacter(str1,i,str2,j+1,ans+ str2.charAt(j));
        }

    }
    public static void main(String[] args) {
    //Input: str1 = "AB",  str2 = "CD"
        // Output:
        //    ABCD
        //    ACBD
        //    ACDB
        //    CABD
        //    CADB
        //    CDAB
        //
        //Input: str1 = "AB",  str2 = "C"
        //Output:
        //    ABC
        //    ACB
        //    CAB
        allCharacter("AB",0,"CD",0," ");

    }
}