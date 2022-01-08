package recurssion;

public class NoOfDigits {
	static int count = 0;
	public static int no(int n) {
		if(n==0) {
			return 0;
		}
		count++;
		no(n/10);
		return count;
	}
	public static void main(String[] args) {
		System.out.println(no(156));
	}
}
