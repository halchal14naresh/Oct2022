package amyjava001;

 
import java.util.ArrayList;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {

 @Test 
  //@Parameters ({"mypara"})
 //public void method1(@Optional String a){
	 public void method1(  ){
	 ArrayList<String> ar = new ArrayList<String>();
	 ar.add("Naresh");
	ar.add("Kumar");
	ar.add("Yadavaaa");
	 System.out.println(ar.toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "").trim());
	 System.out.println("Chnaged By Poonam");
		
 }

}
