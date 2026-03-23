import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Backtacking{
    public static void changeArr(int arr[] , int i , int value){
        // base case
        if( i ==arr.length ){
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = value;
        changeArr(arr,i+1,value+1);
        //backtracking
        arr[i] = arr[i]-2;
    }

    // find subsets
    public static void FindSubSets( String str , String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            else {
                System.out.println(ans);
            }
            return ;
        }
        // Yes choice
        FindSubSets(str, ans+str.charAt(i),i+1 );
        //No choice
        FindSubSets(str,ans,i+1);
    }




// print array
    public static void printArr(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
    }
    public static void FindPermutations(String str , String ans ){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i= 0 ;i<str.length();i++){
            char curr = str.charAt(i);
            //To remove the iTH Character from string
            String Newstr = str.substring(0,i)+str.substring(i+1);
            FindPermutations(Newstr,ans+curr);
        }
    }


    public static int factorial(int n ){
        int fact = 1;
        for(int i = 1 ;i<=n;i++){
            fact*=i;

        }
        return fact;
    }
    public static int GridWays(int i ,int j , int n , int m ){
        if(i == n-1 && j == m-1){
            return 1;
        }
        else if( i==n || j==n){
            return 0;
        }
        int w1 =  GridWays(i+1 ,j,n,m);
        int w2 = GridWays(i ,j+1,n,m);
        return w1+w2;
        //way 2
//        int neo = factorial((n-1)+(m-1));
//        int dino = factorial(n-1)*factorial(m-1);
//        return neo/dino;
    }

    public void main() {
        int arr[][] = {{2,3,4},
                {1,5,1}};
        System.out.println(GridWays(0,0,4 ,4));
//        int arr[] = new int[5];
//        changeArr(arr,0,1);
//        printArr(arr);
        String str = "abc";
//        FindSubSets(str,"",0);
//        FindPermutations(str,"");
//        System.out.println(factorial(5));
    }
}

