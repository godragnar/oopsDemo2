package oopsDemo2;

public class Account {
	
	int acNo;
	String name;
	public Account(int acNo, String name) {
		super();
		this.acNo = acNo;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("*****************Acccount Details***************");
		System.out.println("The Account Number is :"+acNo);
		System.out.println("The Account Name is :"+name);
		
	}

}
