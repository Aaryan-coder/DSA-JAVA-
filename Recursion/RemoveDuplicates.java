package recurssion;

public class RemoveDuplicates {
	static String org = "";
	public static String remove(String str) {
		if(str.length()<=1) {
			return org+=str;
		}
		if(str.charAt(0)==str.charAt(1)) {
			return remove(str.substring(1));
			
		}
		else {
			org+=str.charAt(0);
			remove(str.substring(1));
		}
		return org;
		
	}
	public static void main(String[] args) {
		System.out.println(remove("xxxyyyzwwzzz"));
	}
}
