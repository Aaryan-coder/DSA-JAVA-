
public class Solution {  

    public static void selectionSort(int[] arr) {
        int temp;
        for(int i = 0;i<arr.length-1;i++){
            int index = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }   

}
