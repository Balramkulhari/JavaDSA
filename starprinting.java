public class starprinting {
//    static void inverted_half_piramid(int n){
//        for(int i =1;i<=n;i++){
//            for(int  j =1; j<=n-i;j++) {
//                System.out.print(" ");
//
//            }
//            for(int l=1;l<=i;l++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    public static void hollow_rec(int totalrow,int totalcolunm){
        for(int i =1;i<=totalrow;i++){
            for(int j =1;j<=totalcolunm;j++){
                if(i==1||i==totalrow||j==1||j==totalcolunm){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();}
    }
//butterfly pattern
    public static void butterfly(int n ) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//solid rombous
//  n;j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//    }

//
//
//
    public static void zero_one_triangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j) %2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
//        inverted_half_piramid(3);
        System.out.println();
        butterfly(4);
        zero_one_triangle(5);
        hollow_rec(5,5);
//        s_rhombous(5);




        //Starpattern//
//        for(int i = 1;i<=4;i++){
//            for(int stAR=1;stAR<=i;stAR++){
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//inverted star pattern
//        for(int i = 1;i<=4;i++){
//            for(int stAR=1;stAR<=4-i+1;stAR++){
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }


//        for(int i = 1;i<=4;i++){
//            for(int stAR=1;stAR<=i;stAR++){
//                System.out.print(i);
//
//            }
//            System.out.println();
//        }


//        int n = 5;
//        int ch = 1;
//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(ch + " ");
//                ch++;
//            }
//            System.out.println();
//        }
//        zero_one_triangle(5);

//        public static void s_rhombous(int n){
//        for(int i=1 ;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=
//       int n =5;
//        for(int i = n ; i>=1;i--){
//            for(int j = 1 ;j<=i;j++){
//                System.out.print(j +" ");
//            }
//            System.out.println();}
    }}
