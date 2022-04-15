package oopsDemo2;

public class TestDoctor {
	
		
		public static void main(String[] args) {
			 Specialist spObj=new Specialist(1001,"Mary","New York","Cardiologist");

		        spObj.display();
		        
		        NonSpecialist nspObj=new NonSpecialist(1005,"John","Sydney");

		        nspObj.display();
		}

	}



