package oops;

public class ComplexnoUse {
public static void main(String[] args) {
	Complexno c1 = new Complexno(1,2);
	c1.print();
	Complexno c2 = new Complexno(1,2);
	c2.print();
	c1.add(c2);
	c1.print();
	c1.multiply(c2);
}
}
