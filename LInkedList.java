import javax.management.remote.JMXServerErrorException;
import javax.xml.crypto.NodeSetData;
import java.util.List;
import java.util.regex.Pattern;

public class LInkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    //methods
    //add first
    public void addFirst(int data){
    //s-1 create new node
    Node newNode = new Node(data);
    size++;
    if(head==null){
        head =tail=newNode;
        return;
    }
        //s-2 newNode Next = head
        newNode.next = head;
        //s-3 head = newNode
        head = newNode;
    }

    //print linked list
    public static void print(){
        if(size==0) System.out.println("linked list is empty");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    //add last
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }


    //add anywhere rr
     public void add(int index , int data){
         if(index==0){
             addFirst(data);
             return;
         }
        Node newNode = new Node(data);
        Node temp = head;
        int i= 0 ;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    //remove first
    public int removeFirst(){
        if(size==0) return 0;
        else if(size==1){
            int val = head.data;
            head = tail= null;size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    //remove last
    public int removeLast(){
        if(size == 0) System.out.println("list is empty");
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        Node prev = head;
        for(int i = 0 ;i<size-2;i++){
            prev = prev.next;
        }
        int va_l= prev.next.data;prev.next =null;
        tail=prev;
        size--;
        return va_l;
    }

    //seach in linkedlist
    public int IterativeSearch(int key){
        Node temp = head;
        int i =0 ;
        while (temp!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }


//recursive search
    public int helper(Node head , int key){
        if(head==null){
            return -1;
        }
        if(head.data ==key){
            return 0;
        }
        int idx = helper(head.next ,key );
        if(idx == -1) return -1;
        return idx+1;

    }
    public int RecSearch(int key ){
        return helper(head, key);
    }
    //reverse a linked List
    public static void reverseLL(){
        Node prev = null;
        Node curr = head = tail;
        Node next;
        while (curr!=null){
            next  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public Node FindMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null || fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public boolean PalindromLL(){
        if(head == null || head.next!= null){
            return true;
        }
        //find mid
        Node mid = FindMid(head);
        //reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next ;
        while(curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right= prev;
        Node left = head;
        //check lefthalf == righthalf
       while (right!=null){
           if(left.data!=right.data){
               return false;
           }
           left = left.next;
           right = right.next;
       }
       return true;
    }

//Find and remove Nth node from end
    public void RemoveFromEnd(int n ){
        //calculate size
        int size = 0;
        Node temp  =head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        //remove first if n == size
        if(size==n) {head = head.next; return;
        }//for nth from last
        int i = 1;
        int iToFind =size-n;
        Node prev = head;
        while (i<iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //reverse linked list 2nd
//    public Node reverseBetween(Node head, int left, int right) {
//
//
//    }


    // detect cycle
    public static boolean isCycle(){
        Node fast =head ; Node  slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }
    // remove cycle
    //1 detect cycle
    public static void RemoveCycle(){
        Node slow = head ;
        Node fast = head;
        boolean cycle = false;
        while (fast!=null&& fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                cycle = true;
                break;
            }

        }
        if(cycle==false) return;
        slow = head;
        Node prev = null;
        while (slow!=fast){
            slow = slow.next;
            fast= fast.next;
            prev = fast;
        }
        prev.next = null;
    }
    private static Node GetMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast==null && fast.next!= null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;//mmid
    }
    private static Node merge(Node head , Node head2){
        Node mergedLL = new Node(-1);
        Node dummy = mergedLL;
        while (head!= null &&head2!=null){
             if(head.data<=head2.data){
                 dummy.next = head;
                 head = head.next;
                 dummy=dummy.next;
             }
             else{
                 dummy.next = head2;
                 head2 = head2.next;
                 dummy=dummy.next;
             }

        }
        while (head!=null){
            dummy.next = head;
            head = head.next;
            dummy=dummy.next;

        }
        while (head2!=null){
            dummy.next = head2;
            head2 = head2.next;
            dummy=dummy.next;
        }
        return mergedLL.next;
    }
    public static Node MergeSort(Node head){
        //base case
        if(head==null|| head.next==null){
            return head;
        }
        //find mid
        Node mid = GetMid(head);
        //diffrenciate left half and right half
        Node RightHead = mid.next;
        mid.next = null;
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(RightHead);
        //merge
        return merge(newLeft , newRight);
    }

    public static void main(String[] args) {
//        LInkedList ll = new LInkedList();
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.addLast(4);
//        ll.addLast(5);
//        ll.add(2,3);
//        ll.print();
//        ll.removeFirst();
//        ll.removeLast();
//        ll.print();
//        System.out.println("found at index : "  +ll.IterativeSearch(2));
//        System.out.println(ll.RecSearch(2));
//        System.out.println(size);
//        ll.RemoveFromEnd(3);
//        ll.print();

//        head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(2);
//        head.next.next.next = head.next;
        System.out.println(isCycle());
        RemoveCycle();
        System.out.println(isCycle());

        LInkedList ll2 = new LInkedList();
        ll2.addFirst(1);
        ll2.addFirst(2);
        ll2.addFirst(3);
        ll2.addFirst(4);
        ll2.addFirst(5);
        ll2.print();
        ll2.head = ll2.MergeSort(ll2.head);
        ll2.print();


//        System.out.println(ll.);
    }
}
