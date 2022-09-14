
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;
        int arr3[] = new int[m+n];
        int k = 0;
        while(i<m&&j<n){
                if(arr1[i]>=arr2[j]){
                    arr3[k] = arr2[j];
                    j++;
                    k++;
                }
              else  if(arr1[i]<=arr2[j]){
                    arr3[k] = arr1[i];
                        i++;
                    	k++;
                }
        }
        while(i<m){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
         while(j<n){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;
    }

}
