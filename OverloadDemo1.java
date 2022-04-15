package oopsDemo2;

class Trainee
{
	void skills()
	{
		System.out.println("Trainee Skills Management System");
	}
	
	void skills(int id,String name)
	{
		System.out.println(id+" "+name);
	}
	
	void skills(int id,String name,String prgm)
	{
		System.out.println(id+" "+name+" "+prgm);
	}
	
	void skills(int id,String name,String prgm,String db)
	{
		System.out.println(id+" "+name+" "+prgm+" "+db);
	}
}

public class OverloadDemo1 {
 
	public static void main(String[] args) {
		
		Trainee t1=new Trainee();
		
		t1.skills();
		System.out.println("Trainee without Skills");
		t1.skills(10, "Sai");
		
		System.out.println("Trianee with Programming Skills");
		t1.skills(11, "Kiran", "Java");
		
		System.out.println("Trianee with Programming Skills & Databse Skills");
		t1.skills(12, "Pavan","Python", "MySQL");
		
		
	 
		
}
}
