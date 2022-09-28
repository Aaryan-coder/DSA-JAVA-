import java.util.*;
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        Arrays.sort(arr);
        int ans = 0;
        int i;
        if(size==1&&arr[0]>1){
            return 1;
        }
        for(i = 0;i<size-1;i++){
            if(arr[i]>=0&&arr[i+1]-arr[i]>1){
                return ans = arr[i]+1;
            }
           if(arr[i]<0&&arr[i+1]>1){
               return 1;
           }
        }
        if(i==size-1){
            return ans = arr[size-1]+1;
        }
        return ans;
    }
}
