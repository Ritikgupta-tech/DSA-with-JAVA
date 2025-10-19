

public class array{
    public static void update(int marks[], int nonChangable){
        nonChangable =10;
        for (int i = 0; i <marks.length; i++) {
            marks[i]=marks[i]+5;
            
        }

    }
    public static int linear(int Number[],int Key){
        for (int i = 0; i <Number.length; i++) {
            if (Number[i]==Key) {
                return i;
                
            }
            
            
        }
        return -1;

    }
    public static  int large(int num[]){
        int largest =Integer.MIN_VALUE;
        int smalest =Integer.MAX_VALUE;
        for (int i = 0; i <num.length; i++) {
            if (smalest>num[i]){
                smalest=num[i];
            }
                
            
            

            if (largest<num[i]) {
                largest=num[i];

                
            }
        }
            
        
        System.out.println("smalle" +smalest);
        return largest;

    }
    public static  int binarysrc(int num[],int key){
        int start=0,end =num.length-1;
        while (start<=end){
            int mid =(start+end)/2;
            if (num[mid]==key){
                return mid;
                
            }
            if (num[mid]>key){
                 end =mid-1;

                
            }
            else{
                start=mid+1;
            }
            
        }
        return -1;

    }
    public static void  rev(int num[]){
        int first =0,lst=num.length-1;
        while (first<lst) { 
            int temp =num[lst];
            num[lst]=num[first];
            num[first]=temp;
            first++;
            lst--;

            
        }
    }
    public static void pair(int num[]) {
        int tp=0;
        for (int i = 0; i <num.length; i++) {
            int curr =num[i];
            for (int j = i+1; j <num.length; j++) {
                System.out.print("("+curr+","+num[j]+")");
                tp++;
                
            }
            System.out.println();
            
        }
        System.out.println(tp);

        
    }
    public static void  sub(int num[]){
        int ts =0;
    

        for (int i = 0; i <num.length; i++) {

            int start=i;
            for (int j = 0;j<num.length; j++) {
                int end =j;
                for (int k = start; k <=end; k++) {
                    System.out.print(num[k] +" ");
                
                
                   

                }
                
                
                

                

                ts++;
                System.out.println();
                
            }
            System.out.println();
            
            
        }
        System.out.println("total sub array " +ts);
        

    }
    public static void  maxsumofsub(int num[]){
        int maxsum =Integer.MIN_VALUE;
        int sum =0;
    

        for (int i = 0; i <num.length; i++) {

            int start=i;
            for (int j = 0;j<num.length; j++) {
                int end =j;
                sum=0;
                for (int k = start; k <=end; k++) {
                    sum=sum+num[k];
                    //System.out.println(sum);
                    
                }
                
                if (maxsum<sum) {
                    maxsum=sum;
                    
                }
                
            }
        
        
            
        
        }
        System.out.println("maxsum="+maxsum);
        
        

    }
    public static void prefixsumarry(int num[]){
        int sum =0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[] =new int[num.length];
        prefix[0]=num[0];
        for (int i = 1; i <num.length; i++) {
            prefix[i]=(prefix[i-1]+num[i]);
            
        }

        for (int i = 0; i <num.length; i++) {
            int start =i;
            for (int j = 0; j < num.length; j++) {
                int end =j;
                 sum=start==0 ?prefix[end]: prefix[end]-prefix[start-1];
                 if (maxsum<sum) {
                    maxsum=sum;
                    
                }
                
            }
            
            
        }
        System.out.println("maxsum"+maxsum);


    }
    public static void kadanssumarray(int num[]) {
        int ms =Integer.MIN_VALUE;
        int cs=0;

        for (int i = 0; i < num.length; i++) {
            cs =cs +num[i];
            if(cs<0) {
                cs =0;
            }
            ms =Math.max(cs, ms);
            
        }
        System.out.println("our max subarry sum is "+ms);
        
    }


    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        kadanssumarray(num);
       // prefixsumarry(num);
       // maxsumofsub(num);
        /*int num[]={2,4,6,8,10,12,14};
        pair(num);
        /*int num[]={2,4,6,8,10,12,14};
        rev(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
            
        }
        System.out.println();
        /*int num[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("index for key "+binarysrc(num, key));
    
      //int num[]={2,4,1,5,6,3,6,3};
      //System.out.println("largest value"+large(num));

        //int Number[]={2,4,1,5,6,3,6,3};
        /*int Key =3;
        int index =linear(Number, Key);
        if (index==-1) {
            System.out.println("not fund");
            
        } else {
            System.out.println("num od ind"+index);
        }
       /* int marks[]={90,89,78};
        int nonChangable=5;
        update(marks ,nonChangable);
        for (int i = 0; i <marks.length; i++) {
            System.out.print(marks[i]+" ");
            
        }
        System.out.println();
        System.out.println(nonChangable);
       /* int marks []=new int[100];
        Scanner sc =new Scanner(System.in);
        System.out.println("lenth of arrya ="+marks.length);
        /*marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("phy : "+marks[0]);
        System.out.println("che : "+marks[1]);
        System.out.println("math: "+marks[2]);
        marks[2]=100;
        System.out.println("math: "+marks[2]);
        marks[2]=marks[2]+2;
        System.out.println("math: "+marks[2]);
        int percen=(marks[0]+marks[1]+marks[2]/3);
        System.out.println("percent"+percen+"%");
        /*int phy =sc.nextInt();
        int che =sc.nextInt();
        int math = sc.nextInt();
        System.out.println("total num "+a[marks]);*/
        /*int marks[] =new int [500];
        int num[]={1,2,3};
        String fruit []={"mango" ,"apple","orange"};*/
        
    }
}