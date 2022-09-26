public class patternprinting {
    public static void main(String[] args) {
        int n = 11;

        pattern3(n);


//        pattern2();
    }

    public static void pattern() {
//        int n = 3;
//        int pattern = n * 6;
//        int mid = pattern / 2 + 1;
        int n = 1;
        for (int k = 0 ; k < n ; k++ ) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= 5; j++) {
                    if (i == 0 && (j == 4 || j == 5)) {//{1,2,3,4} 5 6 {7,8,9,10} 11 12 {13,14,15,16} 17 18 {19 20 21 22} 23 24 {25 26 27 28} 29 30 { 31 32 33 34 }
                        System.out.print("  ");
                    } else if ((i == 1 || i == 2) && (j == 1 || j == 2 || j == 4 || j == 5)) { //{1} 2 3 {4} 5 6 {7} 8 9 {10} 11 12 {13} 14 15 {16} 17 18 {19} 20 21 {22}  23 24 {25}
                        System.out.print("  ");
                    } else if (i == 3 && (j == 1 || j == 2)) { // {1} 2 3 4
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        } //System.out.print(" ");
    }

//                if(i == 0 )
//
//                if (i == 4 && j == 2){
//                   System.out.print("*");
//               }
////
//
////                else if(i == 3 && i < 4){
////                    System.out.print(" ");
////                }
////                else{
////                    System.out.print("*");
////                }
//
////                if (j == 1){
////                    System.out.print("*");
////                }
//////                int traker5 = 1 ;
////                if( j % 5 == 0 || j % 5 == 1 ){
////                    System.out.print(" ");
////                    continue;
////                }
////                if (j % 6 == 0){
////                    System.out.print(" ");
////                }
////                System.out.print("*");
//            }
////            System.out.println();
//        }
//    }

//
//        for (i = 1; i <= n; i++) {
//            for (j = 0; j <= n; j++) {
//                if (j == 1) {//|| ){
//                    System.out.print("* ");
//                } else if (j == mid) {
//                    System.out.print("* ");
//                } else if (j == n) {
//                    System.out.print("* ");
//                } else if ((i == 1 && j > mid) || (i == n && j < mid)) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print(" ");
//                }
//                System.out.println();
//            }
//        }
//
//        int n = 5;
//        int mid = n / 2 + 1;
//        int i, j;
//

    public static void pattern2(int n){
        int col = 4;
        int row = 6;
        int mid = row / 2;
        int count = 0;
        while(n > 0) {

            for (int i = 1; i <= col; i++) {
                for (int j = 1; j <= row ; j++) {
                    if (j == mid + 1 || j == 1 || (i == 1 && j < col) || (i == col && j > col)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            n--;
        }
    }


    public static void pattern3(int n){
//        int r = 1;
//        int x = 1;
        for (int i = 1 ; i <= 4 ; i++){
            for (int j = 1 ; j <= n * 6 ; j++){
                if ( i == 1 && (j % 6 == 0 || ( j + 1 ) % 6 == 0)){
                    System.out.print("  ");
                }
                else if ((i == 2 || i == 3) && ((j + 1) % 3 == 0 || (j % 3 == 0))){
                    System.out.print("  ");
                }
                else if(i == 4 && (j % 6 == 2 || j % 6 == 3 )){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println(); // 2 3 8 9 14 15 20 21
        }
    }
}
//        * * * *
//        *     *
//
//
//
//
//