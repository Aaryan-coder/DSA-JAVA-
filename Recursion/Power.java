package recurssion;

public class Power {
	public static int callPow(int n, int m) {
		if(m==0) {
			return 1;
		}
		return n*callPow(n,m-1);
		
	}
	public static void main(String[] args) {
		System.out.println(callPow(3,4));
	}
}
