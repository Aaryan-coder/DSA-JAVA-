class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        int res = n>>k;
        if((res&1)==0){
            return false;
        }
        return true;
        
    }
    
}
