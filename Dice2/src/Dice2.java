import java.util.Random;
public class Dice2 {	
		
int game;


	public void Throw()
	{
		game = 0 + (int) (Math.random() * 6);
				
	}

	public int Value()
	{
		return game;		
	}
	
	
}
