package hu.webler;

public class Poli2 implements AreaVolume {
	private int a;
	private int b;
	private int c;
	
	public Poli2(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calculate(double x) {
		return this.a * x * x + this.b * x + c;
	}
}