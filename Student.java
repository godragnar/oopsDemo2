package oopsDemo2;

public class Student {
int rollNo;
String name;

Address ad;  // Entity Reference has-a relation
public Student(int rollNo, String name, Address ad) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.ad = ad;
}

void display()
{
	System.out.println("**********Student Details*******");
	System.out.println("Stduent Id is :"+rollNo);
	System.out.println("Student Name is :"+name);
	System.out.println("Address: "+ad.city+" "+ad.state+" "+ad.state+" "+ad.country+" "+ad.pincode);
}


}
