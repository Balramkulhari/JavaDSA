import java.util.LinkedList;
import java.util.Stack;

public class aTc {
//    public static void main(String[] args) {
////            int intValue = 10;
////            double doubleValue = 5.5;
////            double result = intValue + doubleValue;
////            System.out.println("Result: " + result);
//        }
//public class ListNode {
//     int val;
//     ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
//
//public static void swap(int arr[] ,int idx1, int idx2){
//    int temp = arr[idx1];
//    arr[idx1] = arr[idx2];
//    arr[idx2] = temp;
//}
public static void main(String[] args) {
//    int n = 51;
//    int div = 2;
//    if (n < div) {
//        System.out.println("it's prime");
//    } else {
//        for (div = 2; div <= n; div++)
//            if (n%div == 0) {
//                System.out.println("it not prime");
//                break;
//            }
//        }
////    }
//}}
    String s = "(()())(())";
    String str = "";
    Stack<Character> ans = new Stack<>();
    for(int i = 0 ;i<s.length()-1;i++){
        if(s.charAt(i)=='('){
            ans.add(s.charAt(i));
        }
        if(s.charAt(i+1)==')'){
            ans.push(s.charAt(i+1));
        }
        else{
            ans.pop();
        }
    }
    int idx =0;
    while (idx<s.length()) {
        System.out.print(ans.get(idx));
        idx++;
    }
}
}