package oopsDemo2;

public class Multilevel2 {
	public static void main(String[] args) {
		Director d1=new Director(10, "Sai",5000);
		
		
		System.out.println("**************Director Details**************");
		d1.display();
		d1.getHRA();
		d1.gerDA();
		d1.getTA();
		d1.getGross();
		
		System.out.println("**************Manager Details**************");
		Manager m1=new Manager(11, "Kiran",4000);
		m1.display();
		m1.getHRA();
		m1.gerDA();
		m1.getGross();
		
		
		System.out.println("*****************Staff Details*****************");
		Satff s1=new Satff(12, "Srikar",25000);
		s1.display();
		s1.getHRA();
		s1.print();
	}

}
