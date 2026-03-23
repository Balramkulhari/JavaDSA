import java.awt.*;
import java.lang.classfile.instruction.StackInstruction;
import java.lang.reflect.Type;

public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node Tail;
    public static int size;
                                            //add
     public void add_first(int data){
         Node newNode = new Node(data);
         size++;
         if(head==null) {
             head =Tail= newNode;
         }
         newNode.next = head;
         head.prev =  newNode;
         head = newNode;
     }
     public void add_last(int data){
         Node newNode = new Node(data);
         size++;
         if(head==null) {
             Tail =head= newNode;
         }
         Tail.next = newNode;
         newNode.prev = Tail;
         Tail= newNode;
     }
     //print
    public void print(){
         Node temp = head;
         while (temp!=null){
             System.out.print(temp.data+"<->");
             temp = temp.next;
         }
        System.out.println("null");
    }
     //removeFirst
    public void remove_first(){
         if(head==null){
             System.out.println("DLL is empty");
             return;
         }
         if(size ==1){
             head = Tail= null;
             return;
         }
         size--;
             head = head.next;
             head.prev = null;
    }
    //removeLast
    public void remove_last(){
         if(Tail==null){
             System.out.println("Emptty DLL");
             return;
         }
         size--;
         if(head==Tail){
             head=Tail=null;
             return;
         }
        Tail = Tail.prev;
         Tail.prev = null;
    }
    //reverse DLL
    public void reverse(){
         Node curr = head;
         Node prev = null;
         Node next;
         while (curr!=null){
             next = curr.next;
             curr.next = prev;
             curr.prev = next;

             prev = curr;
             curr = next;
         }
         head = prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add_first(2);
        dll.add_first(1);
        dll.add_last(3);
        dll.add_last(4);
        dll.print();
        dll.reverse();
        dll.print();
    }
}
