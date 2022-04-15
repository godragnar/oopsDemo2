package oopsDemo2;

public class CompositionDemo {
	
	public static void main(String[] args) {
		Honda hondaCity = new Honda();
       
        hondaCity.setColor("Silver"); //car class methods
        hondaCity.setMax_speed(180);    //car class methods
       
        System.out.println("*******Honda Car Details *********");
        System.out.println(hondaCity.getColor() +" Color");//car class methods
        System.out.println(hondaCity.getMax_speed()+" Speed");//car class methods
       
        hondaCity.hondaStart(); 
        
        
        Hyundai hyundaiVerna =new Hyundai();
        
        hyundaiVerna.setColor("White");
        hyundaiVerna.setMax_speed(150);
        
        System.out.println("*******Hyundai Car Details *********");
        System.out.println(hyundaiVerna.getColor() +" Color");//car class methods
        System.out.println(hyundaiVerna.getMax_speed()+" Speed");//car class methods
       
        hyundaiVerna.hyundaiStart();
	}

}
