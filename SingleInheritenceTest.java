package oopsDemo2;
class Animal
{
	String name;
	
	public void eat()
	{
		System.out.println("I Can Eat");
	}
}

class Dog extends Animal
{
	public void display()
	
	{
		System.out.println("My name is :"+name);
	}
}

public class SingleInheritenceTest {
	public static void main(String[] args) {
		Dog labrador =new Dog();
		labrador.name="Ruby";
		labrador.display();
		labrador.eat();
	}

}
