package myjava;

public class Manager extends Employee {
	
	public void m_managment(){
		System.out.println("I am manager of XYZ Organization");
	}
	
	Manager(){
		//super("Iamsuper","iamDuper"); // as Constructor of Parent Class
		System.out.println("I am Constructor of Manager Class ");
		
	}
	
	public void m_sal(){
		System.out.println("No Salary for  Employee ");
	}
	
	  public void m_caller(){
		 super.m_sal();  // super = parent Class
		 this.m_sal(); // This = Current Class =  m_sal();
		
	}
	

	

	public static void main(String[] args) {
		Manager obj = new Manager();
	    obj.m_caller();
	   
	}

}
