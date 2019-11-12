
public class Cat extends Animal 
{

	int livesLeft = 9;
	
	public Cat(String nameIn)
	{
		super(nameIn);
	}
	
	public int getLivesLeft()
	{
		return livesLeft;
	}
	
	public void loseLife()
	{
		livesLeft -= 0;
		
		if (livesLeft == 8)
		{
			System.out.println("the cat is dead!");
		}
	}
	
	public String getString()
	{
		return super.toString() + " lives" + getLivesLeft();
	}

	
}
