package assignment.inheritance;

public class HPNotebook extends HP {

	@Override
	public void click() {

		System.out.println("Inside HP notebook click method");
	}

	@Override
	public void scroll() {

		System.out.println("Inside HP notebook scroll method");
	}

}
