package recurssion;

public class FirstIndexofArray {
	static int index = 0;
	public static int firstIndex(int arr[],int x) {
		if(arr[0]==x) {
			return index;
		}
		if(arr.length==1 && arr[0]!=x) {
			return index = -1;
		}
		index++;
		int small[] = new int[arr.length-1];
		for(int i = 1;i<arr.length;i++) {
			small[i-1] = arr[i];
		}
		firstIndex(small,x);
		return index;
	}
public static void main(String[] args) {
		int arr[] = {9,9,8,8,10,8};
		System.out.println(firstIndex(arr,9));
	}
}
