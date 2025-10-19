public class ass8{
    public static void bblsort(int arr[]){
        for (int i = 1; i <arr.length-1; i++) {
            for (int j = 0; j < (arr.length-1)-i; j++) {
                if (arr[j]<arr[j+1]){
                    int temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                
            }
            
        }
    }
    public static void selsort(int arr[]){
        int largest =Integer.MIN_VALUE;
        for (int i = 0; i <arr.length-1; i++) {
            int minpos =i;
            
            for (int j = i+1; j <arr.length; j++) {
                if(arr[minpos]<arr[j]){
                    minpos=j;

                
                }    
            }
            int temp =arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

            
        }
    }
    public static void insersort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0&&arr[prev]<curr) { 
                arr[prev]=arr[prev+1];
                prev--;
                
            }
            arr[prev+1]=curr;
            
        }
    }
    public static void countsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            largest=Math.max(largest, arr[i]);
            
        }
        int count[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            
        }
        int j=0;
        for (int i =count.length-1; i >=0;i--) {
            while (count[i]>0) { 
                arr[j]=i;
                j++;
                count[i]--;
                
            }
            
        }
    }
    public static void printarr(int arr[]){
        for (int i = 0; i <arr.length; i++) {
            System.err.println(arr[i]+" ");
            
        }
        
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        countsort(arr);
        //insersort(arr);
       // selsort(arr);
       // bblsort(arr);
        printarr(arr);
    }
}