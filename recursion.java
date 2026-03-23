import org.w3c.dom.ls.LSOutput;

class recursion{
    public static void incOrder(int n){
        if(n ==1){
            System.out.print(" "+n);
            return;
        }
        incOrder(n-1);
        System.out.print(" "+n);

    }

    public static int factorial(int n ){
        if(n==1 || n==0){
            return 1;
        }
        return  factorial(n-1)*n;
    }

    public static int SumOfNaturals(int n ){
        if(n==1){
            return 1;
        }
        return SumOfNaturals(n-1)+n;
    }

    public static int NthFabonacci(int n){
        if(n==0 || n==1) return n;
        return NthFabonacci(n-1)+NthFabonacci(n-2);

    }

    public static boolean IsSorted(int arr[] , int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return IsSorted(arr,i+1);
    }
    public static int FrendsPairing(int n){
        if(n==1) return 1;
        //single
        if(n==2) return 2;
        int fnm1 = FrendsPairing(n-1);
        //pair
        int fnm2 = FrendsPairing(n-2);
        int pairWays = (n-1)*fnm2;
        return fnm1+pairWays;
    }
    public static int FirstOccarance(int arr[] , int key , int i){
        if(i==arr.length) return -1;
        if(arr[i]==key) return i;
        return FirstOccarance(arr,key,i+1);
    }
//    public static int lastOccarance(int arr[] , int key , int i){
//        int isFound = lastOccarance(arr , key , i+1);
//        if(isFound!=-1)  return isFound;
//    }

    public static int Power(int x , int n){
        if(n==0) return 1;
        return x*Power(x,n-1);
    }
    public static int powerEff(int x,int n ){
        if(n==0) return 1;
        int hlfpower = powerEff(x,n/2)*powerEff(x,n/2);
        if(n%2!=0) hlfpower *= x;
        return hlfpower;
    }
    public static void PrintBinary(int n , int lastdigit , String str){
        if(n==0){
            System.out.println(str);
        }
        PrintBinary(n-1,0,str+"0");
        if(lastdigit == 0){
            PrintBinary(n-1,1,str+"1");
        }
    }
    public static boolean IsPowerof3(int n){
        if(n<1) return false;
        if(n==1){
            return true;
        }
        if(n%3!=0) return false;
        return IsPowerof3(n/3);
    }
    static String SkipAppNotApple(String Up){
        if(Up.isEmpty()){
            return "";
        }
        if(Up.startsWith("app")&&!Up.startsWith("apple")){
            return SkipAppNotApple(Up.substring(3));
        }
        else{
            return Up.charAt(0)+SkipAppNotApple(Up.substring(1));
        }
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(IsPowerof3(n));
//        incOrder(n);
//        System.out.println(powerEff(2,10));
//        System.out.println(NthFabonacci(n));
//        System.out.println(factorial(n));
//        System.out.println(SumOfNaturals(n));


    }
}