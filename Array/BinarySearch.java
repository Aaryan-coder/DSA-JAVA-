
public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    int low = 0;
        int high = arr.length-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]>x){
            high=mid-1;
        }
        if(arr[mid]<x){
            low = mid+1;
        }
    }
        return - 1;

}
}
