class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
       ArrayList<Integer> arr2 = new ArrayList<>();
       arr2.add(arr[n-1]);
       int max = arr[n-1];
       for(int i = n-2;i>=0;i--){
           if(arr[i]>=max){
               arr2.add(arr[i]);
               max = arr[i];
           }
       }
       Collections.reverse(arr2);
       return arr2;
    }
}
