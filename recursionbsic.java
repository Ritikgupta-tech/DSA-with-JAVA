public class recursionbsic{
    public static void printDec(int n){
        if (n==1) {
            System.out.println(n);
            return;
            
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");

    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn =n*fact(n-1);
        return fn;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sn1=sum(n-1);
        int sn=n+sn1;
        return sn;

        

    }
    public static int fib(int n){
        if(n== 0 || n==1){
            return n;
        }
        int fibnm1=fib(n-1);
        int fibnm2=fib(n-2);
        int fibn=fibnm1+fibnm2;
        return fibn;

    }

    public static boolean issorted(int arrr[],int i){
        if(i==arrr.length-1){
            return true;
        }
        if (arrr[i]>arrr[i+1]) {
            return false;
        }
        return issorted(arrr, i+1);
        
    }
    public static int firstoccurence(int arr[],int key,int i){
        if (i==arr.length) {
            return -1;
            
        }
        if (arr[i]==key) {
            return i;
            
        }
        return firstoccurence(arr, key, i+1);

    }
    public static int lastoccurence(int arr[],int key,int i){
        if (i==arr.length) {
            return -1;
            
        }
        int isFound=lastoccurence(arr, key, i+1);
        if (isFound==-1 && arr[i]==key) {
            return i;
            
        }
        return isFound;
    }
    public static int pow(int x,int n){
        if (n==0) {
            return 1;
            
        }
        //int xnm1=pow(x, n-1);
        //int xn=x*xnm1;
       // return xn;
       return x*pow(x, n-1);
    }
    public static int optmizpwr(int a ,int n){
         if (n==0) {
            return 1;
            
        }
        //int halfpwrsq=optmizpwr(a, n/2)*optmizpwr(a, n/2); //o(n)
        //second methode o(logn)
        int halfpwr=optmizpwr(a, n/2);
        int halfpwrsq=halfpwr*halfpwr;
        
        if (n%2!=0) {
            halfpwrsq=a*halfpwrsq;
            
        }
        return halfpwrsq;
    }

    public static int tillingproblem(int n){ // 2*n(floor size)
    // base case 
    if (n==0 || n==1) {
        return 1;
        
    }

    //kaam 
    //verticle choice
    int fnm1=tillingproblem(n-1);
    // horizental 
    int fnm2=tillingproblem(n-2);

    int totways=fnm1+fnm2;
    return totways;

    }

    public static void removeDuplicates(String str,int idx ,StringBuilder newStr,boolean map []){
        if (idx==str.length()) {
            System.out.println(newStr);
            return;
            
        }// kaam 
        char currchar=str.charAt(idx);
        if (map[currchar-'a']==true) {
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
            
        }else{
            map[currchar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currchar), map);
        }
    }

    public static int friendspairing(int n){
        //base case
        if (n==1 || n==2) {
            return n;
            
        }
        //kaam
        //single
        //int fnm1=friendspairing(n-1);
        //pair
       // int fnm2=friendspairing(n-2);
        //int pairways=(n-1)*fnm2;

       // int totalways=fnm1+pairways;
       // return totalways;


        // OR 
        return friendspairing(n-1)+(n-1)*friendspairing(n-2);

    }

    public static void printBinStrings(int n,int lastPlace, String str){
        //base case
        if (n==0) {
            System.err.println(str);
            return;
            
        }
        // kaam 
        printBinStrings(n-1,0, str+"0");
        if (lastPlace==0) {
            printBinStrings(n-1,1, str+"1");
            
            
        }

    }
 
    public static void main(String[] args) {
        //int n=100;
        //printDec(n);
       // printInc(n);
       // System.out.println(fact(n));
        //System.out.println(sum(n));
       // System.out.println(fib(n));
       //int arrr []={5,6,1,5,2,3,4,1,5,6,};
       //System.out.println(firstoccurence(arrr, 2, 0));
      // System.out.println(lastoccurence(arrr, 5, 0));
       //System.out.println(issorted(arrr, 0));
       System.out.println(pow(2,10));
       System.out.println(optmizpwr(2,10));
       System.out.println(tillingproblem(3));
         String str="appnnacollege";
         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
         System.out.println(friendspairing(3));
         printBinStrings(3, 0,"");
        
    }
}
