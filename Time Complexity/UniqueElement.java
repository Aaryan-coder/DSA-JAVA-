package timeComplexity;

public class UniqueElement {
	static int ans = 0;
public static int unique(int[] arr) {
	int res = arr[0];
    for (int i = 1; i < arr.length; i++)
        res = res ^ arr[i];
    return res;
}
	public static void main(String[] args) {
		int arr[] = {2,3,1,1,5,6,3,6,2};
		System.out.println(unique(arr));
	}
}
