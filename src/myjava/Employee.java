package myjava;

public class Employee {
	int empID=14;
	String empName="Jhon";
	String empSalary="25000";
	
	public void m_name(){
		System.out.println(" Employee Name is " + empName );
	}
	
	public void m_id(){
		System.out.println(" Employee ID  is " + empID );
	}
	
	public void m_sal(){
		System.out.println(" Employee Salary  is " + empSalary );
	}
	
 	Employee( ){
		System.out.println("I am Constructor of Employee Class " );
	}
 
 	
 
	public static void main(String[] args) {
		 

	}

}
