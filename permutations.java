import java.util.*;

class permutatios{

}

public List<List<Integer>> subsets(int[]nums){
        List<List<Integer>> Result  = new ArrayList<>();
        backtrack(Result,new ArrayList<>() , nums,0);
        return Result;
}
public static void backtrack(List<List<Integer>> resultSet , List<Integer> tempset , int[] nums , int start){
        resultSet.add(new ArrayList<>(tempset));
        for (int i = start; i < nums.length; i++){
            //case for including number
            tempset.add(nums[i]);
            //backtracking the new subst
            backtrack(resultSet,tempset,nums,i+1);
            //case of not including
            tempset.remove(tempset.size()-1);
        }
}

public static void main() {
}
