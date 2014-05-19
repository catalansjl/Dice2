
public class Dice2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
				
		Dice2 myRandomNumber = new Dice2();
         
				
		
		myRandomNumber.Throw(); 	
		myRandomNumber.Throw(); 
		myRandomNumber.Throw(); 		
		
		 int jorge=myRandomNumber.Value(); 	
		 int jorge1=myRandomNumber.Value(); 	
		 int jorge2=myRandomNumber.Value(); 	
		 
		 int jorges = jorge + jorge1 + jorge2;
		 int average = jorges/3;

		 System.out.println(+ average);
 
   }	 
}


		
		
		

	