package oopsDemo2;

public class Accountant extends Employee {
	
	String task,tech;
	public Accountant(int empId, String empName,String t1,String t2) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
		this.tech=t1;
		this.task=t2;
	}
	
	

	void print()
	{
		System.out.println("*************Acoountant Details**********");
		System.out.println("The task done by the Accountant is:"+task);
		System.out.println("The Softwares used  by the Accountant is:"+tech);
		
	}

	

	
	
	

}
