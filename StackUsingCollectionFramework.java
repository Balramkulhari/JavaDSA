import java.beans.Introspector;
import java.util.*;
public class StackUsingCollectionFramework {
    //push at the bottom of stack
    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    //reverse stack
    public static void ReverseStack(Stack<Integer> s ){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        ReverseStack(s);
        pushAtBottom(s,top);
    }
    //print Stack
    public static void printstack(Stack<Integer> s ){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    //reverse string
    public static String ReverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
////        printstack(s);
//        ReverseStack(s);
//        printstack(s);
        // Next greater element
        int arr[] = {6,8,0,1,3};
        Stack<Integer>  s1= new Stack<>();
        int nextGreater[] = new int[arr.length];
        for(int i =arr.length-1; i>=0;i--){
            //1 While
            while (!s1.empty() && arr[s1.peek()]<=arr[i]){
                s1.pop();
            }
            //2 if else
            if(s1.isEmpty()){
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i]= arr[s1.peek()];
            }
            //push
            s1.push(i);
        }
        for(int i =0;i<=nextGreater.length-1;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
//        while(!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//        String s1 = "abc";
//        String result = ReverseString(s1);
//        System.out.println(result);
    }
}
