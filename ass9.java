public class ass9{
    public static void  count(int matrix[][],int key){
        int counting=0;
        for(int i = 0; i < matrix.length; i++) {
            for (int j= 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key) {
                    counting++;

                
                }
                
                
            }
            
            
        }
        System.out.println(counting);

    }
    public static void  sumrw(int matrix[][]){
        int sumr=0;
        
        for (int j= 0; j < matrix[0].length; j++){
            sumr=sumr+matrix[1][j];

                    
                    
                    
        }
                
            
        
        System.out.println(sumr);

    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},{8,8,7}};
        sumrw(matrix);
       // int key=7;
       // count(matrix, key);
        
    }
}