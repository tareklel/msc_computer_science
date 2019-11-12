
public class TestAccountInterest {
	
	public static void main (String args[])
	{
		InterestAccount interest = new InterestAccount(10000,0.25);
		interest.addMonthlyInterest();
		System.out.println(interest.toString());
	}
	

}
