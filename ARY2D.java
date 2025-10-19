

public class ARY2D{
    public static boolean  search(int matrix[][],int key){
        int largest =Integer.MIN_VALUE;
         for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key) {
                    System.out.println("fount at index= ("+i+","+j+")");
                    return true;
                    
                }
                if (matrix[i][j]>largest) {
                    System.out.println(matrix[i][j]);
                    
                }
                
            
            
            }
            
        }
        System.out.println("key not found");
        return false;
    }
    public static void prsprial(int matrix[][]){
        int strtrw=0;
        int edrw=matrix.length-1;
        int strtcl=0;
        int edcl=matrix[0].length-1;
        while (strtrw<=edrw && strtcl<=edcl) {
            //top 
            for (int j = strtcl; j <=edcl; j++) {
            System.out.print(matrix[strtrw][j]+" ");
            
            } 
            //right  
            for (int i = strtrw+1; i <=edrw; i++) {
                System.out.print(matrix[i][edcl]+" ");
                
            }
            //bottom
            for (int j =edcl-1 ; j >=strtcl; j--) {
                if (strtrw==edrw) {
                    break;
                    
                }
                System.out.print(matrix[edrw][j]+" ");
                
            
            }
            //left
            for (int i = edrw-1; i >=strtrw+1; i--) {
                if (strtcl==edcl) {
                    break;
                    
                }
                System.out.print(matrix[i][strtcl]+" ");
                
            }
            strtcl++;
            strtrw++;
            edcl--;
            edrw--;
            
         
        }
        
        
    }
    public static int digsum(int matrix[][]){
        int sum =0;
       /* for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i==j) {
                    sum=sum +matrix[i][j];
                    
                }
                else if (i+j==matrix.length-1) {
                    sum=sum +matrix[i][j];                   
                }
                
            }
            
        }*/
        for (int i = 0; i < matrix.length; i++) {
            sum=sum+matrix[i][i];
            if(i!=matrix.length-1-i){

                sum=sum+matrix[i][matrix.length-i-1];
            }
        }
        return sum;
        
    } 
    public static boolean   serchmt(int matrix[][],int key){
        int rw=0,cl=matrix[0].length-1;
        while (rw<matrix.length && cl>=0) { 
            if(matrix[rw][cl]==key){
                System.out.println("found key at (" +rw+","+cl+")");
                return true;
            }
            else if (key<matrix[rw][cl]) {
                cl--;
                
            }
            else{
                rw++;
            }
            
        }
        System.out.println("key not found");
        return false;


    }
    
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=12;
        serchmt(matrix, key);
        //digsum(matrix);
       // prsprial(matrix);
       /* int matrix[][]=new int[3][3];
        int n=3,m=3;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
                
            }
            
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
            
        }
        search(matrix, 5);*/
    }

}