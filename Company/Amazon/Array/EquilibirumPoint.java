
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        int ans = 0;
if(n==1){
    return 1;
}
if(n==2){
    return -1;
}
else{
    long sum = 0;
    int total = 0;
    long sumArr[] = new long[n];
    sumArr[0] = arr[0];
    for(int i = 0;i<n;i++){
        sum+=arr[i];
    }
    for(int i = 1;i<n;i++){
        sumArr[i]=sumArr[i-1]+arr[i];
    }
    for(int i = 1;i<n-1;i++){
        long left = sumArr[i] - arr[i];
        long right = sum-sumArr[i];
        if(left==right){
            return ans = i+1;
        }
    }
}
return -1;
    }
}
