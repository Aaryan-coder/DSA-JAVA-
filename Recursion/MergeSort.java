package recurssion;

public class MergeSort {
public static void mergersort(int arr[]) {
	if(arr.length<=1) {
		return;
	}
	int a[] = new int[arr.length/2];
	int b[] = new int[arr.length - a.length];
	for(int i = 0;i<arr.length/2;i++) {
		a[i] = arr[i];
	}
	int j = 0;
	for(int i = arr.length/2;i<arr.length;i++) {
		b[i-arr.length/2] = arr[i];
		
	}
	mergersort(a);
	mergersort(b);
	merge(a,b,arr);
}
public static void merge(int[] s1, int[] s2, int[] d) {
	int i = 0;
	int j = 0;
	int k = 0;
	while(i<s1.length && j<s2.length) {
		if(s1[i]<=s2[j]) {
			d[k] = s1[i];
			i++;
			k++;
		}
		else {
			d[k] = s2[j];
			k++;
			j++;
		}
	}
	if(i<s1.length) {
		while(i<s1.length) {
			d[k] = s1[i];
			i++;
			k++;	
		}
	}
	if(j<s2.length) {
		while(j<s2.length) {
			d[k] = s2[j];
			j++;
			k++;	
		}
	}
}
public static void main(String[] args) {
	int arr[] = {10,4,5,9,8,6,12,11,7};
	mergersort(arr);
	for(int i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
 