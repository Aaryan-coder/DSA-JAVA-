package recurssion;

public class ToerofHanoi {
public static void towerhanoi(int n,char s, char h, char d ) {
	if(n==1) {
		System.out.println("Move 1 disk from "+ s + " to "+ d);
		return;
	}
	towerhanoi(n-1,s,d,h);
	System.out.println("Move "+n+" disk from "+s+" to "+ d);
	towerhanoi(n-1,h,s,d);
}
public static void main(String[] args) {
	towerhanoi(3,'s','h','d');
}
}
