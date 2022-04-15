package oopsDemo2;

public class Manager extends Satff {
	protected float da;
    private float gross;

	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);
		// TODO Auto-generated constructor stub
	}
	void gerDA()
	{
		da=(salary*80)/100;
		System.out.println("DA is "+da);
	}
	
    void getGross()
    {
        gross= salary+hra+da;
        System.out.println("Gross Salary of Manager is :"+gross);
    }

}
