import java.util.HashMap;
import java.util.*;
import java.util.Set;

public class hashmap {
    public boolean isAnagram(String s, String t) {
        HashMap<String ,String> map = new HashMap<>();
        char[] chars = s.toCharArray();     // Convert to char array
        Arrays.sort(chars);                     // Sort alphabetically
        String sorted = new String(chars);
        char[] chars1 = t.toCharArray();     // Convert to char array
        Arrays.sort(chars1);                     // Sort alphabetically
        String sorted2 = new String(chars1);
        for(int i = 0 ;i<s.length();i++){
            if(map.get(s.charAt(i)).equals(t.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        HashMap<Integer , String > rollmumber = new HashMap<>();
        //insertion
        rollmumber.put(1,"balram");
        rollmumber.put(2,"deep");
        //print
        System.out.println(rollmumber);
        //serching
        System.out.println(rollmumber.containsKey(1));
        System.out.println();
        //update
        rollmumber.put(2,"vishnu");
        //remove
        rollmumber.remove(2);

        //interation
        for(Map.Entry<Integer , String> e : rollmumber.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}
