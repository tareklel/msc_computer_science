
public class TestAnimal {
	
	public static void main (String args[])
	{
		Cat kitty = new Cat("Katouskin");
		
		kitty.loseLife();
		System.out.println(kitty.getString());
		
		Dog pup = new Dog ("Pupper",23);
		System.out.println(pup.getString());

		
		
	}
  
}
