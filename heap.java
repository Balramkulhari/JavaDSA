import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
public class heap {
    static class heap1{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);

        int x = arr.size()-1;
        int par = (x-1)/2;
        while (arr.get(x)<arr.get(par)){
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par,temp);
        }
        }
    }

    public static void main(String [] args){
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.add(2);
//        pq.add(4);
//        pq.add(1);
//        pq.add(7);
//        while (!pq.isEmpty()){
//            System.out.println(pq.peek());
//            pq.remove();
//        }
    }

}
