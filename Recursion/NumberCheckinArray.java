package recurssion;

public class NumberCheckinArray {
	static boolean ans = false;
	public static boolean no(int arr[],int x) {
		if(arr[0]==x) {
			return ans = true;
		}
		else if(arr.length==1&&arr[0]==x) {
			return ans = true;
		}
		else if(arr.length==1&&arr[0]!=x) {
			return ans = false;
		}
		int small[] = new int[arr.length-1];
		for(int i = 1;i<arr.length;i++) {
			small[i-1] = arr[i];
		}
		no(small,x);
		return ans;
		
	}
	public static void main(String[] args) {
		int arr[] = {9,8,10};
		System.out.println(no(arr,2));
	}
}
