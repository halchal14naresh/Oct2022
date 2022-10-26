package myjava;

public  class MyChromDriver implements  MyWebDriver {

	@Override
	public void get() {
	System.out.println("Launch CHROME Browser ");
		
	}

	@Override
	public void findElement() {
		 
		System.out.println("FIND ELEMENTS in CHROME");
	}

	@Override
	public void close() {
		System.out.println("CLOSE CHROME BROWSEr");
		
	}
 

}
