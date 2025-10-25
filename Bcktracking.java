public class Bcktracking{
    public static void changeArr(int arr[], int i ,int val){
        //base case 
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion 
        arr[i]=val;
        changeArr(arr, i+1, val+1); //fn call step
        arr[i]=arr[i]-2; // backtraking step
        
    }
    public static void printArr(int arr[]){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");   
        }
        System.out.println();
    }



    // subset find 
    public static void findsubsets(String str , String ans,int i){
        // base case 
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
                
            } else {
                System.out.println(ans);
            }
            
            return;
        }
        //recursion 

        //yes choice 

        findsubsets(str, ans+str.charAt(i), i+1);
        // no choices 
        findsubsets(str, ans, i+1);
    }


    public static void findPermutation(String str,String ans ){
        // bse case 
        if (str.length()==0) {
            System.out.println(ans);
            return;
            
        }


        // recursion 
        for (int i = 0; i <str.length(); i++) {
            char curr=str.charAt(i);
            //"abcde" => "ab" +"de" =  "abde"
            String Newstr =str.substring(0,i) + str.substring(i+1);
            findPermutation(Newstr, ans+curr);
            
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr,0,1);
        printArr(arr);
        // find subsets
        String str="abc";
        findsubsets(str, " ", 0);


        //find permitations O(n*n!)= tc
        findPermutation(str, "");
        

    }
}
