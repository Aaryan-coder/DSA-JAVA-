class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
        int count = 0;
        int total = 0;
        while(N!=0){
            if(N%2!=0){
                count++;
            }
             if(count>total){
                    total = count;
                }
            if(N%2==0){
                count = 0;
            }
            N=N/2;
        }
        return total;
        
    }
}
