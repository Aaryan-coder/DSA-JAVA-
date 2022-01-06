package oops;

public class Complexno {
	private int real;
	private int imag;
	public Complexno(int real,int imag) {
		this.real = real;
		this.imag = imag;
	}
	public void print() {
		System.out.println(real + "+" + imag + "i");
	}
	public void add(Complexno c2) {
		real = real + c2.real;
		imag = imag + c2.imag;
	}
	public void multiply(Complexno c2) {
		int newreal = (real*c2.real) - (imag*c2.imag);
		int newimag = (real*c2.imag) + (imag*c2.real);
		System.out.println(newreal + "+" + newimag + "i");
	}
	
}
