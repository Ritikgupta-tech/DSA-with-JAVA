
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if (n==2) {
            System.out.println("n is prime");
        } else {
             boolean isprime =true;
        for (int i = 2; i <=n-1; i++) {
            if (n%i==0) {
                isprime=false ;
                
            }

            
        }

        if (isprime==true) {
            System.out.println("n is prime");
            
        } else { 
            System.out.println("n is not prime");
        }
    }    


        /*do { 
            int n =sc.nextInt();
            if (n%10==0) {
                continue;   
            }
            System.out.println(n);
        } while (true);
    
        /*for (int i = 1; i < 10; i++){
            if (i==3) {
                continue;
            }
        
            System.out.println(i);
        }
       /* do {
            int n=sc.nextInt(); 
            if (n%10==0) {
                break;
                
            }
            System.out.println(n);
        } while (true); 
        System.out.println("10 * multiple");
        

        /*for (int i = 1; i < 10; i++){
            if (i==3) {
                break;
                
            }
            System.out.println(i);
            
        }
        System.out.println("i am over");
       /* int n =10899;
        int rem = 0;
        int num =0;
        int rev =0;
        while (n>0) {
            rem=n%10;
            rev=(rev*10)+rem;
            System.out.println(rev);
            n=n/10;
           /* rem = n%10;
            System.err.print(rem); 
            n = n/10;*/
            
        //}
        //System.out.println(rev);


        /*for (int i = 0; i <4;i++){
            System.out.println("****");

        }

       /* int i =1;
        int sum =0;
        int n= sc.nextInt();
        //int count =1;
        while (n>=i) { 
            sum=sum+i;
            i++;
           // count++;
            
        }
        System.out.println("no is " + sum); 
        /*int n =0;
        while (n<100) { 
            System.out.println("hello");
            n++;
            
        }*/
    }
}