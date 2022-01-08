package recurssion;

public class NaturalNo {
	public static void printNatural(int n) {
		if(n==0) {
			return;
		}
		printNatural(n-1);
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		printNatural(5);
	}
	
}
