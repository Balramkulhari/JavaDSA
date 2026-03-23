import java.sql.SQLOutput;
import java.text.CollationKey;
import java.util.*;

public class greedy {
    public static void main() {

        //fractional knapsack
        int val[] = {60 , 100, 120};
        int weight[] = {10 , 20, 30};
        int w = 50;
        double ratio[][] = new double[val.length][2];
        //oth col => index \\ 1th col => ratio
        for(int i = 0;i< val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        //sort ration in the accending order of ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int capacity = w;
        int finalVal = 0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){ //include complete item
                finalVal+=val[idx];
                capacity-=weight[idx];
            }
            else{
                //include fraction item
                finalVal += (ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final value = " + finalVal );


        //minimum absolute difference
//        int arr1[] ={4,1,8,7};
//        int arr2[] ={2,3,6,5};
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        int i = 0 ;
//        int j = 0;
//        int minabs =0;
//        while(i<arr1.length && j<arr2.length){
//            minabs += Math.abs(arr1[i]-arr2[j]);
//            i++;
//            j++;
//        }
//        System.out.println(minabs);


//        maximum length chain of pairs(done in leetcode)
        //indian coins

        Integer coins[] = {1,2,5,10,20,50,100,500,1000,2000};
//        Arrays.sort(coins,Comparator.reverseOrder());
        int count =0 ;
        int amount = 591;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =coins.length-1;i>=0;i--){
        if(coins[i]<=amount) {
            while (coins[i] <= amount) {
                count++;
                ans.add(coins[i]);
                amount -= coins[i];
            }
        }
        }
//        System.out.println("used coins : "+count);
//        for(int i= 0;i<ans.size();i++){
//            System.out.println(ans.get(i));

       // job sequncing problem

//        int arr[][] = {{4,20} , {1,10} , {1,40} , {1,30}};
//        ArrayList<job> jobs = new ArrayList<>();
//        for(int i= 0;i<arr.length;i++){
//            jobs.add(new job(i,arr[i][0],arr[i][1]));
//        }
//        Collections.sort(jobs,(a, b)->b.profit-a.profit);
//        ArrayList<Integer> seq = new ArrayList<>();
//        int time = 0;
//        for(int i = 0;i<jobs.size();i++){
//            job curr = jobs.get(i);
//            if(curr.deadline>time){
//                seq.add(curr.id);
//                time++;
//            }
//        }
//        System.out.println("maximum job :"+seq.size());


//    static class job{
//        int deadline;
//        int profit ;
//        int id;
//
//
//
//        public job(int i, int d, int p) {
//            id = i;
//            deadline = d;
//            profit = p;
//        }
//    }


//    chocola problem
//        System.out.println("hellow");
        int  n  = 4, m = 6;
        Integer costvertical []= {2,1,3,1,4};//m-1
        Integer costhorizontal[] = {4,1,2};//n-1
        Arrays.sort(costvertical , Collections.reverseOrder());
        Arrays.sort(costhorizontal , Collections.reverseOrder());
        int h = 0, v = 0;
        int hp = 1 , vp =1 , cost = 0;
        while(h < costhorizontal.length && v < costvertical.length){
            //verticalcost is less
            if(costvertical[v]<=costhorizontal[h]){//horizontal
                cost+=(costhorizontal[h]*vp);
                hp++;
                h++;
            }
            else{ //vertical cut
                cost+=(costvertical[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costhorizontal.length){
            cost+=(costhorizontal[h]*vp);
            hp++;
            h++;
        }
        while(v<costvertical.length){
            cost+=(costvertical[h]*vp);
            vp++;
            v++;
        }
        System.out.println("Minumum cost : "+cost);





            int nums[] = {-4,-2,1,4,8};
            int distance = Math.abs(nums[0]-0);
            int i = 1;
            int minI = 0;
        int mindis = 0;
            while(i<nums.length){
                int currdis = Math.abs(nums[i]-0);
                 mindis = Math.min(currdis , distance);
                distance = currdis;
                System.out.print(distance +" " +mindis +" "+currdis);
                System.out.println();
                i++;
            }
        System.out.println("final minimum distance :"+mindis);
    }
}


