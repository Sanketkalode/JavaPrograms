package assignment.inheritance;

public class Test {

	public static void main(String[] args) {

		DellNotebook dell = new DellNotebook();
		dell.click();
		dell.scroll();
		
		HPNotebook hp = new HPNotebook();
		hp.click();
		hp.scroll();
	}

}
