package oopsDemo2;

public class OverloadDemo {
	public static void main(String[] args) {
		Addition a1=new Addition();
		a1.add();
		a1.add(5, 4);
		a1.add(34.75f, 45.9f);
		a1.add(100,200,900);
		a1.add("Sai" ,"Kiran");
	}

}
