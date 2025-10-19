



public class sorting{
    public static void bblsort(int arr[]){
        
        for (int turns = 0; turns <arr.length-1; turns++) {
            //int swap=0;
            for (int j = 0; j < ((arr.length-1)-turns); j++) {
                if (arr[j]>arr[j+1]) {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
                

                
            }
            
        }

    }
    public static void selsort(int arr[]){
        int smallvl=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j <arr.length; j++) {
                if (arr[minPos]>arr[j]) {
                    minPos=j;
                    
                }
                
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;

            
        }
    }
    public static void printarr(int arr[]){
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void insersort(int arr[]){
        for (int i = 1; i <arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]>curr) { 
                arr[prev+1]=arr[prev];
                prev--;
                
            }
            arr[prev+1]=curr;
            
        }
    }
    public static void countsort(int arr[]){
        int largest =Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            largest=Math.max(largest,arr [i]);
            
        } 
        int count[]=new int[largest+1];
        for (int i = 0; i <arr.length; i++) {
            count[arr[i]]++;


    }
    int j=0;
    for (int i = 0; i <count.length; i++) {
        
        while (count[i]>0) { 
            arr[j]=i;
            j++;
            count[i]--;
            
        }
    }
}

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        countsort(arr);
        printarr(arr);
       // Integer arr[]={5,4,1,3,2};
        //Arrays.sort(arr,0,3,Collections.reverseOrder());
        //Arrays.sort(arr,Collections.reverseOrder());
        //Arrays.sort(arr);
       // Arrays.sort(arr,0,3);
    
       // bblsort(arr);
       //insersort(arr);
        //selsort(arr);
       // printarr(arr);
        
        
    }
}