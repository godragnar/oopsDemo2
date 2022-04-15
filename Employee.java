package oopsDemo2;

public class Employee {
	int empId;
	String empName;
	public Employee(int empId, String empName) {
	 super();
		this.empId = empId;
		this.empName = empName;
	}
	void display()
	{
		System.out.println("**************Employee Details*************");
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name :"+empName);
	}

}
