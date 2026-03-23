import java.util.*;
public class TrappedWater {
//    public static void PrintPairs(int arr[]){
//        for(int i=0;i< arr.length;i++){
//            int curr = arr[i];
//            for(int j=i+1;j< arr.length;j++){
//                System.out.print("("+curr+","+arr[j]+")");
//            }
//            System.out.println();
//        }
//    }
     public static int TrappedWater(int [] height){
     int n = height.length;
     int leftmax[] = new int[n];
     leftmax[0] = height[0];
     for (int i =1;i<n;i++){
         leftmax[i] = Math.max(leftmax[i-1],height[i]);
     }
     int rightmax[] = new int[n];
     rightmax[n-1] = height[n-1];
     for(int i=n-2;i>=0;i--){
         rightmax[i] = Math.max(rightmax[i+1],height[i]);
     }
     int TrappedWater = 0;
     for (int i =0;i<n;i++){
         int waterlevel = Math.min(rightmax[i],leftmax[i]);
         TrappedWater += waterlevel-height[i];
     }
     return TrappedWater;

     }
    public static void main(String[] args) {
        int numbers[] = {4,2,0,6,3,2,5};
        System.out.println(TrappedWater(numbers));
    }
}