package hu.webler;

public interface AreaVolume {
	public double calculate(double x);
	
	default public double area(double a, double b) {
		return area(a, b, 1000);
	}
	
	default public double area(double a, double b, int precision) {
		double result = 0;
		double x;
		for(int i = 0; i < precision; i++) {
			x = a + (b - a) * i / precision;
			result += calculate(x) / precision;
		}
		return result;
	}
	
	default public double volume(double a, double b) {
		return volume(a, b, 1000);
	}

	default public double volume(double a, double b, int precision) {
		return 0; // TODO: should be implemented
	}
}
