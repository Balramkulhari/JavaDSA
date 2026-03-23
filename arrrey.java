import javax.print.attribute.standard.MediaSize;
import java.awt.*;
import java.util.Scanner;

//    public static void update(int marks[] ){
public class arrrey {
//        for(int i = 0;i<marks.length;i++){
//            marks[i]=marks[i]+1;
//        }
//
//    }

//linear search
    public static int linearSearch(int numbers[],int key){
        for(int i = 0;i< numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

//LARGEST AND SMALLEST IN AN ARREY
    public static int largest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i< number.length;i++){
            if(largest< number[i]){
                largest=number[i];

            }
        }
        for(int i =0;i< number.length;i++){
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("samllest value is :"+smallest);
        return largest;
    }


//binary searh
public static int binary_search(int number[], int key){
    int start = 0, end = number.length - 1;

    while (start <= end) { // Use <= to include all indices
        int mid = (start + end) / 2;

        if (number[mid] == key) {
            return mid;
        }
        if (number[mid] < key) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1; // Return -1 if the key is not found
}


//arrey reverse
    public static void RevArrey(int numbers[]){
        int first = 0;int last = numbers.length-1;
        while(first <last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

//  pairs in an arrey
    public static void PairsInArrey(int numbers[]){
        for(int i = 0;i< numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println();
        }

    }

//sub arreys
    public static void SubArrey(int num[]){
        for(int i=0;i< num.length;i++){
            int start = i;
            for(int j=i;j< num.length;j++){
                int end = j;
                for(int k =start;k<=end;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    //maximum sub arreys sum
    public static void MaxSubArreySum(int num[]){
        int currentSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0] = num[0];
        for(int i = 1;i<num.length;i++){
            prefix[i] = prefix[i-1]+num[i];
        }
        for(int i=0;i< num.length;i++){
            for(int j=i;j< num.length;j++){
                currentSum = i ==0?prefix[j]:prefix[j]-prefix[i-1];
                if(currentSum>maxsum){
                    maxsum = currentSum;
                }
            }
        }
        System.out.println("maax sum is "+maxsum);
    }

//maximum of subarreys(kadanes method)
    public static void kadane(int num[]){
        int ms = Integer.MIN_VALUE , cs =0;
        for(int i = 0;i<num.length;i++){
            cs = cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max sum is "+ms);
    }

//traped rain water
        public static int Trapped(int height[]){
        int n = height.length;
        int leftmax[]=new int[n];
        leftmax[0] =height[0];
        for(int i = 1;i<n;i++){
            leftmax[i] =Math.max(height[i],leftmax[i-1]);
        }
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater =0;
        for(int i =1;i<n;i++) {
            int waterlvl = Math.min(rightmax[i], leftmax[i]);
            trappedwater+=waterlvl-height[i];
        }
        return trappedwater;
    }

//stock buying and selling ::
    public static int BuyAndSellStocks(int price[]){
        int buysPrice = Integer.MAX_VALUE;
        int maxproft = 0;
        for(int i =0; i< price.length;i++){
            if(buysPrice<price[i]){
                int profit=price[i]-buysPrice;
                maxproft = Math.max(profit,maxproft);
            }
            else{
                buysPrice = price[i];
            }
        }
        return maxproft;
    }
//to check is a duplicatenumber in an arrey ::
//    public static boolean CheckTwice(int [] arrey ){
//        int both[]=
//        boolean isdublicte =false ;;
//        for(int i = 0 ;i< arrey.length;i++){
//            for(int j=i+1;j< arrey.length;j++){
//                isdublicte =false;
//                if(arrey[i]==arrey[j]){
//                    isdublicte=true;
//                }
//
//            }
//        }
//        return isdublicte;
//    }
//bubble sort
    public static void bubbleSort(int arr[]){
        int swaps = 0;
        for(int i =0; i< arr.length-1;i++){
            for(int j =0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

//selection sort
    public static void SelectionSort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j< arr.length-1;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;

        }
        for(int i= 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
//insertion sort
    public static void InseertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
//            int curr = i;
            int prev = i-1;
            while (prev >=0&&arr[prev]>arr[i]){
                arr[i] =arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=arr[i];


        }for(int i= 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }




            public static void main(String[] args) {
//        int marks[]=new int[100];
//        Scanner sc = new Scanner(System.in);
//        marks[0]= sc.nextInt();
//        marks[1]= sc.nextInt();
//        marks[2]= sc.nextInt();
//        System.out.println("phy:"+marks[0]);
//        System.out.println("Chemistry:"+marks[0]);
//        System.out.println("Maths:"+marks[0]);
        // String fruits[] = {"mango","banana ","papaya"};\

//using update function
//        int marks[]={97,98,99};
//            update(marks);
//        for(int i=0;i<marks.length;i++){
//            System.out.print(marks[i]+" ");
//        }
//        System.out.println();


//        int marks[]={97,98,99,12,34234,54};
//        int key =12;
//        int index = linearSearch(marks,key);
//        if(index==-1){
//            System.out.println("not found");}
//        else{
//                System.out.println("found at index :"+ index);
//
//        }
//largest and smallest in an arrey
//        int marks[]={97,98,99,12,34234,54};
//        System.out.println("the largest is :"+largest(marks));

//binary search
//        v


//arrey reverse
        int marks[]={97,98,99,12,34234,54};
        RevArrey(marks);
        System.out.print("reversed elements ");
        for(int elements:marks){
            System.out.print(elements +" ");
        }
        System.out.println();

        //pairs in arrey
//        int marks[]={97,98,99,12,54};
//        PairsInArrey(marks);

//subarreys
//        int marks[] = {97, 98, 99, 12, 54};
//        SubArrey(marks);




//maxsumof subarreys
    int ar[]={2,4,6,8,10};
//        kadane(ar);
//trapped water problem
       // int height[] ={4,2,0,6,3,2,5};
//        System.out.println("trapped water is : "+Trapped(height));
//BuyAndSellStocksint
        int height[] ={7,1,5,3,6,4};
        System.out.println("maximum profit  is : "+BuyAndSellStocks(height));

//chceck a duplicate number in an arrey :
                int arreu [] ={7,1,5,3,6,4,4};
//                System.out.println(CheckTwice(arreu));

//buble sort
//                int arre[] ={7,1,5,3,6,4,4};
//                bubbleSort(arre);
//                System.out.println();
//                SelectionSort(arre);
//                System.out.println();
//                InseertionSort(arre);

        }
    }
