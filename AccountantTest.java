package oopsDemo2;

public class AccountantTest {
	public static void main(String[] args) {
		
		Accountant ac1=new Accountant(20,"Surya","Procees Salary of Employees","SAP");
	    Accountant ac2=new Accountant(21,"Sunil","Payment to Vendors","Tally");
	    
	    ac1.display();
	    ac1.print();
	    
	    ac2.display();
	    ac2.print();
	}

}
