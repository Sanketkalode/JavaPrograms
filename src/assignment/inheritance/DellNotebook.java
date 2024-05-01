package assignment.inheritance;

public class DellNotebook extends Dell {

	@Override
	public void click() {

		System.out.println("Inside Dell notebook click method");
	}

	@Override
	public void scroll() {

		System.out.println("Inside Dell notebook scroll method");
	}

}
