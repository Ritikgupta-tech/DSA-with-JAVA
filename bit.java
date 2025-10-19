public class bit{
    public static void ODorEV(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("no is EVEN");
        }
        else{
            System.out.println("no is ODD");
        }
    }
    public static int getItnbit(int n , int i){
        int bitmask=1<<i;
        if ((n&bitmask)==0) {
            return 0;
            
        } else {
            return 1;
        }
    } 
    public static int setItnbit(int n , int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clrItnbit(int n , int i){
        int bitmask=1<<i;
        return ~(bitmask)&n;

    }
    public static int updItnbit(int n , int i ,int newbit){
        //using set method
        if (newbit==0) {
            return clrItnbit(n, i);
            
        } else {
            return setItnbit(n, i);
        }
        //second using clear method
        //n=clrItnbit(n, i);
       // int bitmask=newbit<<i;
       // return n|bitmask;

    }
     public static int clerItnbit(int n , int i ,int newbit){
        int bitmask=~((~0)<<i);
        return n & bitmask;
     }
     public static int clrrgbit(int n,int i,int j){
        int a =((~0)<<(j+1));
        int b =(1<<i)-1;
        int bitmask =a|b;
        return n&bitmask;

    }
    public static int cuntsetbit(int n){
        int count=0;
        while (n>0) {
            if ((n&1) !=0) {//cheak our lsb
            count++;
                
            }
            n=n>>1;

            
        }
        return count;
    }

    public static boolean isPowerofTWO(int n){
        return (n&(n-1))==0;
    }
    public static int fastexpo(int a,int n){
        int ans=1;
        while (n>0) {
            if((n&1) !=0)   {// cheak lsb
                ans=ans*a;

            }  
            a=a*a;
            n=n>>1;       
            
        }
        return ans;
    }
    public static void main (String [] args){
        System.out.println(5&4); //and
        System.out.println(5|4);// or
        System.out.println(5^4); //x-or
        System.out.println(~5); // complemet 
        System.out.println(5<<2); //left shift a*2^b =a<<b
         System.out.println(5>>2);//RIGHT SHIFT A/2^B=A>>B
        ODorEV(3);
        ODorEV(4);
        System.out.println(getItnbit(10, 3));
        System.out.println(setItnbit(10, 2));
        System.out.println(clrItnbit(10, 1));
        System.out.println(updItnbit(10, 2, 1));
        System.out.println(clerItnbit(10, 2, 1));
        System.out.println(clrrgbit(78, 2, 7));
        System.out.println(isPowerofTWO(7));
        System.out.println(cuntsetbit(10));
        System.out.println(fastexpo(3,5));

    }
}