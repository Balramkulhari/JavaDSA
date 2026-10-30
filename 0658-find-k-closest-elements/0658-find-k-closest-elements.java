class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int l = 0 , r = nums.length-k;
        while(l<r){
            int m = (l+r)/2;
            if(x-nums[m] > nums[m+k]-x){
                l = m+1;
            }
            else{
                r=m;
            }
        }
        for(int i = l;i<l+k;i++){
            ans.add(nums[i]);
        }
        return ans;
    }
}