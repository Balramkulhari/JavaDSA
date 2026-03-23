import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;
//spiral matrix
public class string{
    public static boolean Palindrome(String str){
        for(int i =0;i<=str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                return true;
            }
        }
        return false;
    }

    public static float ShorteshPath(String path){
        int n = path.length();
        int y =0,x=0;
        for(int i =0 ; i<n;i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;

            }
        }
        int x2 = x*x,y2 = y*y;
        return (float)Math.sqrt(x2-y2);

    }

    public static void largestString(String Fruits[]){
        String largest = Fruits[0];
        for(int i =0; i< Fruits.length;i++) {
            if (largest.compareTo(Fruits[i]) < 0) {
                largest = Fruits[i];
                System.out.println(largest);
            }
        }
    }
    public static String LongestCommonPrefix(String [] strs){
        Arrays.sort(strs);
        String str1 = strs[0], str2 = strs[strs.length-1];
        int i = 0;
        while (i< str1.length()){
            if(str1 .charAt(i) == str2.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        return i==0?" ":str1.substring(0,i);
    }


    public static String FirstWOrdToUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&&i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String StringCompression( String str){
        String newstr = "";
        for(int i =0;i<str.length()-1;i++){
            Integer count = 1;
            while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr+= str.charAt(i);
            if(count>1){
                newstr = newstr+count.toString();
            }

        }
        return newstr;
    }

    public static void main(String[] args) {
        String str = "racecar";
//        System.out.println(Palindrome(str));
        String path = "NS";
//        System.out.println(ShorteshPath(path));
        String fruits[] = {"apple","mango","banana"};
        largestString(fruits);
//        String Fruits[] = { "  flower " , "fsdfow " , "flsdfex"};
//        System.out.println(LongestCommonPrefix(Fruits));
        String string = "never give up , try again fail again fail better";
//        System.out.println(FirstWOrdToUpperCase(string));




    }

}