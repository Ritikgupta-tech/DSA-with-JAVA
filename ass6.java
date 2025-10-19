
import java.util.Scanner;

public class ass6{
    public static int avg(int a ,int b,int c){
        int avg=(a+b+c)/3;
        System.out.println(avg);
        return avg;

    }
    public static  boolean isEVEN(int n ){
        boolean isEVEN =false;
        if (n%2==0) {
            isEVEN=true;
            
        }
        System.out.println(isEVEN);
        return isEVEN;

    }
    public static boolean isPalidrome(int n){
        int Palidrome =n;
        int rev = 0;
        while (Palidrome!=0) { 
            int rem =n%10;
            rev = rev*10+rem;
            Palidrome=Palidrome/10;
            
        }
        if(n==rev) {
            return true;
            
        }
        return false;

    }
    public static int sumdig(int n) {
        int sumdg=0;
        while (n>0) {
            int ld =n%10;
            sumdg =sumdg+ld;
            n=n/10; 
            
        }
        return sumdg;
        
    }

    public static void main(String[] args) { 
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no ");
        int dig =sc.nextInt();
        System.out.println("the sum is"+sumdig(dig));

        
        /*System.out.println("enter the no plaidrom ");
        Scanner sc= new Scanner(System.in);
        int Palidrome =sc.nextInt();
        if (isPalidrome(Palidrome)){
            System.out.println("number :"+ Palidrome+"is a palidrome");
            
        } else {
            System.out.println("number :"+ Palidrome+"is not a palidrome");
        }*/


        //isEVEN(13);
        //avg(5, 4, 6);

        
    }
}