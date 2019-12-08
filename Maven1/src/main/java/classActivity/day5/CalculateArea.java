package classActivity.day5;

public class CalculateArea {

	public void computeArea(int a) {
		System.out.println("Area is "+(a^2));
	}
	
	public void computeArea(double a) {
		System.out.println("Area is "+(a*a));
	}
	
	public void computeArea(int a, int b) {
		System.out.println("Area is "+(a*b));
	}
	
	public void computeArea(double a, double b) {
		System.out.println("Area is "+(a*b));
	}
	
	public static void main(String[] args) {
		CalculateArea area = new CalculateArea();
		area.computeArea(5);
		area.computeArea(5.5);
		area.computeArea(2,5);
		area.computeArea(2.5,3.5);
		
	}

}
