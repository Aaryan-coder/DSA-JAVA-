class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
    for(int i = 0;i<n;i=i+k){
        int left = i;
        int right = i+k-1;
        if(right>=n){
            right = n-1;
        }
        int temp;
        while(left<right){
            Collections.swap(arr,left,right);
            left++;
            right--;
        }
    }
    }
}
