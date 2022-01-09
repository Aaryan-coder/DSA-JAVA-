package recurssion;

public class RemoveX {
	static String org = "";
	public static String remove(String str, char ch) {
		if(str.length()==0) {
			return org+= str;
		}
		else if(str.charAt(0)==ch) {
			org +="";
		}
		else if(str.charAt(0)!=ch) {
			org+=str.charAt(0);
		}
		String newStr = str.substring(1,str.length());
		remove(newStr,ch);
		return org;
		
	}
	public static void main(String[] args) {
		System.out.println(remove("xx",'x'));
	}
}
