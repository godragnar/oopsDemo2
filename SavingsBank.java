package oopsDemo2;

public class SavingsBank extends Account {
	
	private int min_bal;
	protected int balance;

	public SavingsBank(int acNo, String name,int mb,int b) {
		super(acNo, name);
		// TODO Auto-generated constructor stub
		this.min_bal=mb;
		this.balance=b;
		
	}
   
	  void display()
	  {
		  super.display();
		  System.out.println("Minimum Balance is :"+min_bal);
		  System.out.println("Saving Balance is :"+balance);
	  }
	  
}
