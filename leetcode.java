import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class leetcode {

//two sum
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    nums[0]=i;
                    nums[1]=j;
                    break;

                }
            }

        }
        return arr;
    }
//meand of two merged arreys
    public double findMedianSortedArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);
        int len = c.length;
        if (len % 2 == 0)
            return (c[len / 2] + c[len / 2 - 1]) / 2.0;
        else
            return c[len / 2];
    }
//problem no 27.
public static int removeElement(int[] nums, int val) {
    int i=0;
    for(int j=0;j<nums.length-1;j++){
        if(nums[i]!=val){
            i++;
            nums[i] = nums[j];
        }

    }
    return i;
}
    public int divide(int dividend, int divisor) {
        if(dividend==divisor) return 1;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;
        while (a>=b){
            int count  =0;
            while (a>=(b<<count+1)){
                count++;
            }
            result += (1<<count+1);
            a -= (b<<count);
        }
        return negative ? -result : result;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startrow = 0 , startcol =0 , endrow = matrix.length ,endcol = matrix[0].length;
        while (startrow<endrow && startcol<endcol){
            for(int i=startcol;i<endcol;i++){
                result.add(matrix[startrow][i]);
            }
            for(int i = startrow+1;i<endrow;i++){
                result.add(matrix[i][endcol]);
            }
            for(int i = endcol-1;i>=startcol;i--){
                if(startcol==endcol){
                    break;
                }
                result.add(matrix[endrow][i]);
            }
            for (int i = endrow-1;i>=startrow+1;i--){
                if(startrow==endrow){
                    break;
                }
                result.add(matrix[startrow][i]);
            }
            startcol++ ;startrow++;endcol--;endrow--;
        }
        return result;
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int i = 0 ;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(nums.length!=set.size()){
            return true;
        }
        return false;
    }
    public int[] sumZero(int n) {
        List<Integer> result = new ArrayList<>(n);
        for(int i = 1;i<n/2;i++){
            result.add(i);
            result.add(-i);
        }
        if(n%2!=0){
            result.add(0);
        }
        int res[] = new int[n];
        for(int i = 0 ;i< result.size();i++){
            res[i]= result.get(i);
        }
        return res;
    }


    public static void main(String[] args) {
//        int arr[]={1,3,5,6,7,7};
//        int target = 3;
//        System.out.println(removeElement(arr,target));
//        PrintArray(arr);
        char[] alphabet = {'a','a','b','b','c'};
//        System.out.println(StringCompression(alphabet));
        int num = 1232;

    }

}
