
import java.util.Scanner;



public class fun {
    public static void prhello(){
        System.out.println("hello world ");
        System.out.println("hello world ");
        System.out.println("hello world ");
    }
    //public static void calc(int n1,int n2){
    public static int calc(int n1,int n2){ //formal parameter fun definition tim
        //Scanner sc = new Scanner(System.in);
        //int a =sc.nextInt();
        //int b =sc.nextInt();

        int sum =n1+n2;
        System.out.println("sum is "+ sum);
        return sum;
    }
    public static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
        return;
    }
    public static int mult(int a,int b){
        int prod = a*b;
        System.out.println("prod"+prod);
        return prod;
    }
    public static int fact(int n){
        int f =1;
        for (int i = 1 ;i<=n; i++){
            f=f*i;
            
        }
        //System.out.println("fact="+f);
        return f;
    }
    public static int binocof(int n ,int r){
        int n_fact =fact(n);
        int r_fact = fact(r);
        int nr_fact =fact(n-r);
        int binocof=n_fact/(r_fact * nr_fact);
        System.out.println(binocof);
        return binocof;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        binocof(n,r);

        //System.out.println(fact(4));
        //Scanner sc =new Scanner(System.in);
       // int n = sc.nextInt();
        //fact(n);
      /*  int a =5;
        int b = 10;
        //swap(a,b);
       int prod = mult(a, b);
       System.out.println("prod = "+ prod);
       prod =mult(12,5);
       System.out.println(prod);
     
    
       /* Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        //prhello();
        //calc(a,b);
        int sum =calc(a,b);//arguments or actual para meter fun call 
        System.out.println("sum is"+ sum);*/
    }
}