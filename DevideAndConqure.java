public class DevideAndConqure {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // divide
        int mid = si + (ei - si) / 2;

        // conquer
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part

        // merge
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;      // left iterator
        int j = mid + 1; // right iterator
        int k = 0;       // temp iterator

        // merge left & right
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // leftover elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }



    // quick sort 

    public static void quickSort(int arr[],int si ,int ei){
        if (si>=ei) {
            return;
            
        }
        // last element 
        int pidx= partition(arr,si,ei);
        quickSort(arr, si, pidx-1); // left part
        quickSort(arr, pidx+1, ei); // right
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i =si-1; // to make place for els smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j]<=pivot) {
                i++;
                // swap 
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
            }
            
        }
        i++;
        int temp =pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }



    

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        //mergeSort(arr, 0, arr.length - 1);
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}












