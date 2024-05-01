package interfaces;

public class Driver {

	public static void main(String[] args) {

		Circle c = new Circle(3);
		c.area();
		c.perimeter();
		
		Square s = new Square(5);
		s.area();
		s.perimeter();
	}

}
