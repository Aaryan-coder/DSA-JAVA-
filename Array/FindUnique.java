import java.util.*;
public class Solution{  

    public static int findUnique(int[] arr){
	Arrays.sort(arr);
        if(arr.length==1){
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        for(int i = 1;i<arr.length-1;i++){
            if(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
}

}
