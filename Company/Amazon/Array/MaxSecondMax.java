import java.util.*;
// Solution class to implement function largestAndSecondLargest
class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        Arrays.sort(arr);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(arr[sizeOfArray-1]);
        for (int i = sizeOfArray - 2; i >= 0; i--){
    if (arr[i] != arr[sizeOfArray - 1])
    {
      arr2.add(arr[i]);
      break;
    }
    else if(arr[sizeOfArray-1]==arr[0]){
        arr2.add(-1);
        break;
    }
  }
  
        return arr2;
    }
}
