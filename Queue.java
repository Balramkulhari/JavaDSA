public class Queue {
    static class QueueB {
        static int arr[] , size , rear,front;
        QueueB(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front =-1;
        }
        public static boolean isEmpty() {
            return rear == -1 && front==-1;
        }
        //for circularQueue
        public static boolean isFull() {
            return (rear+1)%size == front;
        }
        //add(enque)
        public static void add(int data) {
            //for circularQueue
            if (isFull()){
                System.out.println("Queue Full");
                return;
            }
            if(front==-1){
                front =0;
            }
//            rear = (rear + 1) ;
            //for circularQueue
            rear = (rear + 1)%size ;
            arr[rear] = data;
        }

        //remove(dequeue)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }
            int result = arr[front];
            //last element
            if(front==rear){
                front=rear=-1;
            }
            else {
                front = (front+1)%size;
            }
            return result;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }
            return arr[front];
        }



    }
    public static void main(String[] args) {
        QueueB qe = new QueueB( 3);
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
