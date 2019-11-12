
public class Dog extends Animal {
	
	int exerciseTime;

	
	public Dog(String nameIn, int exerciseTimeIn)
	{
		super(nameIn);
		exerciseTime = exerciseTimeIn;		
	}
	
	public void setExerciseTime( int exerciseTimeIn)
	{
		exerciseTime =  exerciseTimeIn;
	}
	
	public int getExerciseTime()
	{
		return exerciseTime;
	}
	
	public String getString()
	{
		return super.toString() + " exercise time" + getExerciseTime();
	}
}
