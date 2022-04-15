package oopsDemo2;

public class AccountDetails extends SavingsBank {
	
	int withdrawl,deposit,finalBalance;

	public AccountDetails(int acNo, String name, int mb, int b,int w,int d) {
		super(acNo, name, mb, b);
		this.withdrawl=w;
		this.deposit=d;
		// TODO Auto-generated constructor stub
	}
	
	void display()
	{
		super.display();
		System.out.println("Deposit :"+deposit);
		System.out.println("Withdrawls :"+withdrawl);
		finalBalance=(balance+deposit)-withdrawl;
        System.out.println("Final Balance:" + finalBalance);
	}

}
