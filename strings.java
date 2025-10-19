

public class strings{
   /* public static void prtltr(String str){
        for (int i = 0; i <str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
            
        }
        System.out.println();

    }
    public static boolean  ispali(String str){
        for (int i = 0; i <str.length()/2; i++) {
            int n =str.length();
            if (str.charAt(i)!=str.charAt(n-i-1)) {
                return false;
                
            }
            
        }
        return true;

    }
    public static float  getsrtpt(String path){
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);
            //south
            if (dir=='S') {
                y--;
                
            }
            //north
            else if (dir=='N') {
                y++;
                
            }
            //west
            else if (dir=='W') {
                x--;
                
            }
            //east
            else {
                x++;

            }

            
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);

    }
    public static String substr(String str ,int si ,int ei){
        String substr="";
        for (int i =si; i < ei; i++) {
            substr=substr+str.charAt(i);
            
        }
        return substr; */
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");

        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i <str.length(); i++) {
            if (str.charAt(i)==' '&& i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                
            }
            else {
                sb.append(str.charAt(i));
            }
            
        }
        return sb.toString();

    }
    public static String compress(String str){
        String newStr="";
        for (int i = 0; i <str.length(); i++) {
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
                count++;
                i++; 
                
            }
            newStr=newStr+str.charAt(i);
            if (count>1) {
                newStr=newStr+count.toString();
                
            }

            
        }
        return newStr;
    }

    public static void main (String[]args){
        String str="aaabbbbccddddd";
        System.out.println(compress(str));
       


       /* String str="hi, i am shradha";
        System.err.println(toUpperCase(str));

        // lecsico
        String fruits[]={"apple","mango","bananna"};
        String largest=fruits[0];
        for (int i = 1; i <fruits.length; i++) {
            if (largest.compareTo(fruits[i])<0) {
                largest=fruits[i];
            }

            
        }
        System.out.println(largest);
        //sub string
       /* String str="helloworld";
        System.out.println(str.substring(0, 6));
        System.out.println(substr(str, 0, 5));*/




       // String path = "WNEENESENNN";
        //System.out.println(getsrtpt(path));
       // String str="racecar";
        //System.out.println(ispali(str));

        /*char arr[]={'a','b','c','d'};
        String str1="abcd";
        String str2=new String("xyz");
        // String are immutable

        // input
        Scanner sc =new Scanner(System.in);
       // String name =sc.next();
        String name =sc.nextLine();
        System.out.println(name);*/

        // string length :
        //String fullname="ritik kumar";
       // System.out.println((fullname.length()));

        //concatenation
       /* String firstname ="ritik";
        String lastname="kumar";
        String fullName=firstname +" " +lastname;
        prtltr(fullName);
        //System.out.print(fullName);
        //System.out.print(fullName.charAt(0));*/

    }
}