public class Qthreetest {
    //bruteforce
    public static void maxSlidingWindow(int [] arr , int k){
        int n = arr.length;
//         int maxof3 = 0;
        for(int i = 0 ; i <= n - k; i++){
//            maxof3 = arr[i];
            int maxof3 = 0;
            for(int j = i ; j < i + k  ; j++){
                if (maxof3 < arr[j]){
                    maxof3 = arr[j];
                }
            }
            System.out.print(maxof3 + " ");
            //3 3 4 5 5 5 6
            //10 10 10 15 15 90 90
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int [] arr1 = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};

        maxSlidingWindow(arr1,4);
    }
}
