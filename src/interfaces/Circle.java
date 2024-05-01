package interfaces;

public class Circle implements Shape {
	private int radius;
	private static final float pi = 3.14f;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	@Override
	public void area() {	
		System.out.println("Area of Circle:"+pi*radius*radius);
	}

	@Override
	public void perimeter() {
		System.out.println("Circumference of Circle: "+2*pi*radius);

	}

}
