class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
int count = 0;
int arr2[] = new int[N];
for(int i = 0;i<N;i++){
    arr2[i] = 0;
}
for(int i = 0;i<N;i++){
    if(arr[i]<=N){
    arr2[arr[i]-1]++;
    }
}
for(int i = 0;i<N;i++){
    arr[i] = arr2[i];
}
}
}
