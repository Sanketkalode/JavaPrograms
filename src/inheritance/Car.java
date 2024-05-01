package inheritance;

public class Car extends Vehicle {

	String name;
	String color;
	
	Car(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	void printColor() {
		System.out.println(this.color);
	}
}
