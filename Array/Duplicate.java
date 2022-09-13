import java.util.*;
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
	Arrays.sort(arr);
        int ans = 0;
	for(int i = 0;i<arr.length-1;i++){
        if(arr[i]==arr[i+1]){
            return ans = arr[i];
        }
    }
        return ans;
    }
}
