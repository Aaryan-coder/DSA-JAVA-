package recurssion;

public class LastIndexofArray {
	static int index = 0;
	public static int lastIndex(int arr[],int x) {
		if(arr[arr.length - 1]==x) {
			return index = arr.length-1;
		}
		if(arr.length == 1 & arr[0]==x) {
			return index = 0;
		}
		if(arr.length == 1 & arr[0]!=x) {
			return index = -1;
		}
		index--;
		int small[] = new int[arr.length-1];
		for(int i = 0;i<arr.length-1;i++) {
			small[i] = arr[i];
			
		}
		lastIndex(small,x);
		return index;
	}
	public static void main(String[] args) {
		int arr[] = {9,8,10,8};
		System.out.println(lastIndex(arr,10));
		
	}
}
