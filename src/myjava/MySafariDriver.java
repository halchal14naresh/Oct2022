package myjava;

public class MySafariDriver implements  MyWebDriver  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void get() {
		 System.out.println("OPEN BROWSER IN SAFARI");
		
	}

	@Override
	public void findElement() {
		 System.out.println("FIND ELEMENT IN SAFARI");
		
	}

	@Override
	public void close() {
		 System.out.println("CLOSE SAFARI BROWSER.");
		
	}

}
