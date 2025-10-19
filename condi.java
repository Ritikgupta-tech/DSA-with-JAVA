import java.util.*;
public class condi {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+': System.out.println(a+b);
                        break;
            case '-': System.out.println(a-b);
                        break;
            case '*': System.out.println(a*b);
                        break;
            case '/': System.out.println(a/b);
                        break;
            default : System.out.println("wrong opreator ");                                                
        }
        //int n = sc.nextInt();
        /*switch(n) {
            case 1 : System.out.println("mango");
                        break;
            case 2 : System.out.println("apple");
                        break;
            default : System.out.println("fruits");
        }
       // int mark = sc.nextInt();
       // String result = (mark>=33) ? "pass":"fail";
       // System.out.println(result);
        //int n =4
        //trnary 
        //String type = ((n%2)==0) ? "even" :"odd";
        //System.out.println(type);
        /* 
        int income = sc.nextInt();
        int tax;

        if (income <500000) {
            tax =0;
            
        }
        else if (income>=500000 && income <1000000){
            tax= (int)(income *0.2);
        }
        else {
            tax = (int)(income *0.3);
        }
        System.out.println("your tax is :" + tax);

        
        /*int age = sc.nextInt();
        if (age>=18) {
            System.out.println("adult");
            
        }
        else if (age>13  && age<18){
            System.out.println("teenager");
        }
        else {
            System.out.println("not adut");
        }
       // int n = sc.nextInt();

        /*if (n%2==0) {
            System.out.println("even");
            
        } else {
            System.out.println("odd");
        }*/
    }

    
}
