import javax.swing.*;
import java.util.*;
public class arrayIist {
    public static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
                 //add elements
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        System.out.println(list);
            //GEt element
        int elment = list.get(3);
//        System.out.println(elment);
            //remove element
//        list.remove(2);
//        System.out.println(list);
            //set element at index
//        list.set(2,10);
            //contains element
//        System.out.println(list.contains(1));
            //size of array list
//        System.out.println(list.size());
        //print arraylist
        for(int i = 0 ; i<list.size();i++){
//            System.out.print(" "+list.get(i));
        }
        System.out.println();
        //reverse of list
//        for(int i =list.size()-1;i>=0;i--){
//            System.out.print(" "+list.get(i));
//        }
        //find maximum
        int max = Integer.MIN_VALUE;
        for (int i = 0 ;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
//        System.out.println("maximum = "+ max);
        // swap numbers
        int idx = 1 , idx2 = 3;
        Swap(list,idx,idx2);
//        System.out.println(list);
        Collections.sort(list);
//        System.out.println(list);
//        Collections.sort(list,Collections.reverseOrder()); // decending order
//        System.out.println(list);
        System.out.println();

        //2D array list
        ArrayList<ArrayList<Integer>> mainList =new ArrayList<>();
        ArrayList<Integer> mList = new ArrayList<>();
        ArrayList<Integer> oList = new ArrayList<>();
        ArrayList<Integer> nList = new ArrayList<>();
        for(int i = 1;i<6;i++) {
            nList.add(i);
            mList.add(2*i);
            oList.add(3*i);
        }
        mainList.add(nList);
        mainList.add(mList);
        mainList.add(oList);
//       for(int i =0; i<mainList.size();i++){
//           ArrayList<Integer> currlist = mainList.get(i);
//           for(int j = 0 ; j<currlist.size();j++){
//               System.out.print(currlist.get(j) +" ");
//           }
//           System.out.println();
//       }
//        System.out.println(mainList);
        System.out.println(mainList);
        int t = 3;
        System.out.println(list);
        System.out.println(PairSum(list,t));
    }
    //Pair sum
    public static boolean PairSum(ArrayList<Integer> list,int target){
        int r = list.size()-1;
        int l = 0 ;
        while (l!=r){
            if(list.get(l)+list.get(r)==target){
                return true;
            }
            else if(list.get(l)+list.get(r)<target){
                l++;
            }
            else{
                r--;
            }
        }
        return false;
    }

    public static void Swap(ArrayList<Integer> list,int index1 , int index2){
        int temp = list.get(index1);
        list.set(index1 , list.get(index2));
        list.set(index2 , temp);


    }
}