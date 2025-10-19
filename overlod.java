public class overlod{
        public static int sum(int a,int b){
            return a+b;
        }
        /*public static int sum(int a ,int b,int c){
            return a+b+c;
        }*/
       public static float sum(float a ,float b) {
        return a+b;
           
       }
       public static boolean isPrime(int n) {
        if(n==2){
            return true;
        }
        boolean isPrime=true;
        for (int i = 2; i <=n-1; i++) { //i<=math.squrt(n)
            if (n%i==0) {
                isPrime=false;
                break;
                
            }
            
        }
        return isPrime;
           
       }
       public static void primesInRange(int n){
        for (int i = 2; i <=n; i++) {
            if(isPrime(i)){
            System.out.println(i+" ");}
            
        }
        System.out.println( );

       }
       public static void bintodec(int bino) {
        int dec=0;
        int pow =0;
        while(bino>0){
            int ld= bino%10;
            dec =dec +ld*(int)(Math.pow(2, pow));
            pow++;
            bino=bino/10;
        }
        System.out.println("decimal of "+ bino +"="+dec);
           
       }
       public static void dectobin(int dec) {
        int bin = 0;
        int pow =0;
        int myno =dec;
        while (dec>0) { 
            int dig=dec%2;
            bin = bin +(dig*(int)Math.pow(10,pow));
            pow++;
            dec =dec/2;
            
            
        }
        System.out.println("bin of "+bin);

           
       }


    
    public static void main(String[] args){
       dectobin(12);
       // bintodec(101);
       //primesInRange(20);
        //System.out.println(sum(3,5));
        //System.out.println(sum (5,2,3));
        //System.out.println(sum(3.2f, 3.8f));
        //System.out.println(isPrime(12));

    }
}
    