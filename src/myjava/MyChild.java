package myjava;

public class MyChild extends Parent1 {
	int i=100;
	
	
	public void myhome(){
		
		System.out.println(" This is Home of MYCHILD Class");
	}
	
static public void myStatic(){
		
		System.out.println(" This is myStatic of MYCHILD Class");
	}
 

public static void main(String[] args) {	
		Parent1 par = new MyChild();
		System.out.println("SAMOSA");		 
	}

}
