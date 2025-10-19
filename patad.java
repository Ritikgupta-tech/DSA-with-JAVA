public class patad{
    public static void hellow(int row,int colm) {
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=colm; j++) {
                if (i==1||i==row ||j==1 ||j==colm) {
                    System.out.print("*");
                    
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
        
    }
    public static void inv(int row ,int colm){
         for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
                        
            }
            System.out.println();
                    
                
            
            
             
         }
    }
    public static void invh(int row ,int colm){
         for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5-i+1; j++) {
                System.out.print(j);
                
            }
            
                        
            
            System.out.println();
         }
    } 
    public static void floyed(int n) {
        int cont=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(cont);
                cont++;
                
            }
            System.out.println();
            
        }
        
    } 
    public static void butter(int n){
        
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j<=2*(n-i); j++) {
                System.out.print(" ");
                    
            }
            for (int j = 1; j<=i; j++) {
                    
                

                System.out.print("*");
            }
            System.out.println();
            
             
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j<=2*(n-i); j++) {
                System.out.print(" ");
                    
            }
            for (int j = 1; j<=i; j++) {
                    
                

                System.out.print("*");
            }
            System.out.println();
            
             
         
             
         }

    }
    public static void trin(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1");
                    
                }
                else{
                    System.out.print("0");
                }

                
            }
            System.out.println();

            
        }
        
    }  
    public static void solid (int n) {
        for (int i =1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
    }  
    public static void hollowr(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.err.print(" ");
                
            }
            for (int j = 1; j <=n; j++) {
                if (i==1||j==1 ||i==n ||j==n) {
                    System.out.print("*");
                    
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        
    }  
    public static void dim(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    } 
    public static void flag(int n) {
        for (int i = 1; i <=2; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            
                
            }
            System.out.println();

            for (int j = 1; j <=n; j++) {
                System.out.print(" ");
                
            }
            System.out.println(" ");
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
                
            }
        

            
        }
        
    } 
    public static void main(String[] args) {
        flag(3);
       // dim(4);
        //hollowr(5);
        //solid(5);
        //butter(4);
        //trin(5);
        //floyed(10);
       // invh(5, 5);
        //inv(4, 4);
        //hellow(5, 4);
        
    }
}