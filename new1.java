public class new1 {
    static void main() {
        int nums[] = {1,2,3,4};
        int count = 0;
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]+count;
            System.out.println(count);
        }
    }
}
