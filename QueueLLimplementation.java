import java.lang.classfile.TypeAnnotation;
import java.lang.classfile.attribute.StackMapTableAttribute;
import java.util.Stack;

public class QueueLLimplementation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        //add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = head.data;
            //single element
            if(tail==head){
                tail=head=null;
            }
            else{
                head = head.next;
            }
            return front;
        }
        //peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue qe = new Queue();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        System.out.println(qe.remove());
        qe.add(4);
        System.out.println(qe.remove());
        qe.add(5);
        while(!qe.isEmpty()){
            System.out.println(qe.peek());
            qe.remove();
        }

    }
}
