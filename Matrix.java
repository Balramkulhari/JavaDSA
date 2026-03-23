import java.math.BigInteger;
import java.sql.SQLOutput;

public class Matrix {
    public static void SpiralMatrix(int MAtrix[][]){
        int startrow =0,startcol = 0,endrow = MAtrix.length-1 ;
        int endcol = MAtrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int i=startcol;i<=endcol ;i++){
                System.out.print(MAtrix[startrow][i]+" ");
            }
            for(int i = startrow+1;i<=endrow;i++){
                System.out.print(MAtrix[i][endcol]+" ");
            }
            for(int i=endcol-1 ;i>=startcol;i--){
                if(startcol==endcol){
                    break;
                }System.out.print(MAtrix[endrow][i]+" ");
            }
            for(int i = endrow-1;i>=startrow+1;i--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(MAtrix[startrow][i]+" ");
            }
            startcol++;startrow++;endcol--;endrow--;
        }
        System.out.println();
    }


    public static int DiagonalSum(int arr[][] ){
        int sum =0;
        for(int i =0;i<= arr.length-1;i++){
            sum += arr[i][i];
            if(i != arr.length-1-i){
                sum+= arr[i][arr.length-i-1];
            }
        }
        return sum;
    }


    public static boolean SearchInSortedMatrix(int[][] mat , int key){
        int n = mat.length;
        int raw =0,col = mat.length-1;
        while(raw <= mat.length && col>=0){
            if(key==mat[raw][col]){
                System.out.println("found at (" + raw + "," +col+ ")");
                return true;
            }
            else if(key<mat[raw][col]){
                col--;
            }
            else {
                raw++;
            }
        }
        return false;
    }
        public static int trailingZeroes(int n) {
            int count = 0;
            for(int i = 5;n/i >=1;i*=5){
                count += n/i;
            }
            return count;

        }


//        public static int trailingZeroes(int n) {
//            BigIntegerInteger fact = 1;
//            for(int i = 0;i<n;i++){
//                fact = fact.
//            }
//            int count =0;
//            String str = fact.toString();
//            for( int i = str.length()-1;i>=0;i--){
//                if (str.charAt(i) == 0){
//                    count++;
//
//                }
//                else break;
//            }
//            return count;
//        }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
//        SpiralMatrix(matrix);
//        System.out.println(DiagonalSum(matrix));
        int key = 5;
        System.out.println(trailingZeroes(key));
//        SearchInSortedMatrix(matrix,key);
    }
}