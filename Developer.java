package oopsDemo2;

public class Developer extends Employee{
	String technology;

	public Developer(int empId, String empName,String t) {
		super(empId, empName);
		this.technology=t;
	}
	void display1()
	{
		System.out.println("Technology Used:"+technology);
	}

}
