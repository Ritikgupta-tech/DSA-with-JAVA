import java.util.*;
public class ass4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean x = (year %4)==0;
        boolean y = (year %100) !=0;
        boolean z =(year %100==0);
        boolean a =(year %400==0);
        if(x && (!z||a)) {
            System.out.println("leap year");
        }
        else if (y && a) {
            System.out.println(" leap year");
        }
        else{
            System.out.println("not leap year");
        }

        /*int a=63;
        int b=36
        boolean x = (a<b)?true:false;
        int y= (a>b) ? a : b ;
        x = false y = 63
       // int day = sc.nextInt();
       /*  switch (day) {
            case 1 : System.out.println("monday");
                break;
            case 2 : System.out.println("tuesday");
                        break;
            case 3: System.out.println("webnessday");
                        break;
            case 4 : System.out.println("thursday");
                        break;
            case 5: System.out.println("friday");
                        break;
            case 6: System.out.println("sturday");
                        break;
            case 7: System.out.println("sunday");
                        break;
            default: System.out.println("not valid");
                break;
        }
      
      
      
      
      
      
      
        /*  double temp =10.5;
        if (temp>100){
            System.out.println("fever");
        }
        else {
            System.out.println("not fever");
        }
        /*int n = sc.nextInt();
        if (n>=0){
            System.out.println("possitive");
        }
            else {
                System.out.println("nrgative");
            }*/
        
    }
    
}
