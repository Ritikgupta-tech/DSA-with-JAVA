


public class ass7{
    public static boolean  twice(int num[]){
        for (int i = 0; i <num.length; i++) {
            for (int j = i+1; j <num.length; j++) {
                if (num[i]==num[j]) {
                    return true;
                    
                }
                
            }
            
        }
        return false;

    }
    public static  int maxprof(int prices[]){
        int buy =prices[0];
        int profit=0;
        for (int i = 1; i <prices.length ; i++){
            if (buy<prices[i]) {
                profit=Math.max(prices[i]-buy, profit);
                
            }
            else{
                buy=prices[i];
            }
            
        }
        return profit;
    }
    
    public static void main(String[] args) {
        int prices[]={1,4,8,6,7,9,8};
        System.out.println(maxprof(prices));
        
        //int num[]={1,2,3,1};
        //System.out.println(twice(num));
    
    }
}