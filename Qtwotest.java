import java.util.Arrays;

public class Qtwotest {
    public static int FindMedian(int[] num1 , int n , int[] num2 , int m ) {
        //{5 , 7 , 8 ,11 , 14 }   { 9 , 11 , 12 , 13 }
        // merge two array
        // option 1  if n = odd  ====  Median = ( n + 1 ) / 2  term
        // option 2  if n = even ====  Median = ((n/2) term +  (n + 1 ) / 2 term ) / 2

        int[] arr = merger(num1,num2,n,m);
        System.out.println("Two sorted Array After Merging : " + Arrays.toString(arr));
        int ans = 0;
        int tl = n + m;
        if(n % 2 == 0){
//            System.out.println(n / 2);
//            System.out.println(arr[n/2]);
            ans = (arr[tl / 2] + arr[tl/2 - 1])/2;
//            System.out.println("kuch bhi");
        }
        else{
            ans = arr[tl/2];
        }
        return ans;
    }
    public static int[] merger(int []num1 , int [] num2 , int n , int m  ){
        int [] merged = new int[n + m];
        int idx1 = 0;
        int idx2 = 0;
        int flag = 0;
        while (idx1 < n && idx2 < m ){
            if(num1[idx1] <= num2[idx2]){
                merged[flag] = num1[idx1];
                flag++;idx1++;
            }
            else {
                merged[flag] = num2[idx2];
                flag++;idx2++;
            }
        }

        while (idx1< n){
            merged[flag] = num1[idx1];
            flag++;idx1++;
        }
        while (idx2 < m){
            merged[flag] = num2[idx2];
            flag++;idx2++;
        }

//        System.out.println(merged.length);
        return merged;
    }
    public static void main(String[] args) {
        int [] num1 = { 2 , 3 , 5 , 8 };
        int [] num2 = { 10 , 12 , 14 , 16 , 18 , 20};
        int n = num1.length;
        int m = num2.length;
        System.out.println("The Median of Given two Sorted Array is : " +  FindMedian(num1,n,num2,m));

    }
}
