static void Rotate(int arr[], int d, int n)
{
    // Storing rotated version of array
    int temp[] = new int[n];
 
    // Keepig track of the current index
    // of temp[]
    int k = 0;
 
    // Storing the n - d elements of
    // array arr[] to the front of temp[]
    for (int i = d; i < n; i++) {
        temp[k] = arr[i];
        k++;
    }
 
    // Storing the first d elements of array arr[]
    //  into temp
    for (int i = 0; i < d; i++) {
        temp[k] = arr[i];
        k++;
    }
 
    // Copying the elements of temp[] in arr[]
    // to get the final rotated array
    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }
}
