package recurssion;

public class SumofArray {
	static int count = 0;
	public static int sum(int arr[]) {
		int x = arr[arr.length-1];
		if(arr.length == 1) {
			return 0;
		}
		count+=arr[0];
		int small[] = new int[arr.length-1];
		for(int i = 1;i<arr.length;i++) {
			small[i-1] = arr[i];
		}
		sum(small);
		return count+x;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(sum(arr));
	}
}
