package recurssion;

public class QuickSort {
public static void quickSort(int arr[],int si,int ei) {
	if(si>=ei) {
		return;
	}
	int pivot = partition(arr,si,ei);
	quickSort(arr,si,pivot-1);
	quickSort(arr,pivot+1,ei);
}
public static int partition(int arr[], int si, int ei) {
	int pivotElement = arr[si];
	int smallNumcount= 0;
	for(int i = si+1;i<=ei;i++) {
		if(arr[i]<pivotElement) {
			smallNumcount++;
		}
	}
	int temp = arr[si + smallNumcount];
	 arr[si + smallNumcount] = pivotElement;
	 arr[si] = temp;
	 int i = si;
	 int j = ei;
	 if(arr[i]<pivotElement) {
		 i++;
	 }
	 else if(arr[j]>=pivotElement) {
		 j--;
	 }
	 else {
		 temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
		 i++;
		 j--;
	 
	 }
	 return si + smallNumcount;
}
public static void main(String[] args) {
	int arr[] = {10,4,5,9,8,6,12,11,7};
	quickSort(arr,0,arr.length-1);
	for(int i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
