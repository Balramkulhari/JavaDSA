class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int st = nums[0];
        int end = nums[nums.length-1];
        int index = 0;
        for(int i = st;i<=end;i++){
            if(index<nums.length && i==nums[index]){
                index++;
            }
            else{
                ans.add(i);
            }
        }
        return ans;
    }
}