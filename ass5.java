import java.util.*;
public class ass5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println( n+"*"+i+"="+n*i);

            
        }

        /*int factorial=1;
        System.out.println("enter possitive int");
        n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial=factorial*i;
        
            
        }
        System.out.println(factorial);
        /*int number;
        int choice;
        int sumeven =0;
        int sumodd=0;
        do { 
            System.out.println("enter the no ");
            number =sc.nextInt();
            if (number%2==0) {
                sumeven=sumeven+number;
                
            } else {
                sumodd=sumodd+number;
            }
            System.out.println("for continue press 1 or not press 0");
            choice=sc.nextInt();
        } while (choice==1);
        System.out.println("the even no sum is"+sumeven);
        System.out.println("the odd no sum is"+sumodd);*/
    }
}