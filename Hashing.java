import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        int nums[] = {1,3,4,4,4,5,45,3};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ;i<nums.length;i++){
            set.add(nums[i]);
        }
        //use of itrator(traverse in hashset)
        Iterator it = set.iterator();
//        System.out.print("[");
        while(it.hasNext()){
//            System.out.print(it.next()+", ");
        }
//        System.out.print("]");
        System.out.println();
        //insert
        set.add(3);
        System.out.println(set);

        //{ //hashmap

    }
//    public boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> set = new HashSet();
//        for(int i = 0 ;i<nums.length;i++){
//            set.add(nums[i]);
//        }
//        if(nums.length!=set.size()){
//            return true;
//        }
//        return false;
    }
