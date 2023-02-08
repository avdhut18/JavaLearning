package encapsulationnn;

import java.util.Scanner;

//POJO class - Plain old java object 
public abstract class HrDept {

	 private int salary = 10000;
	 
	 public int getSalary() {
		return salary;
	 }
	 
	 public void setSalary(int sal) {
		 this.salary=sal;
	 }
}
