
public class InterestAccount extends Account {
	
	double monthlyInterestRate;
	
	public InterestAccount(double balance, double monthlyInterestRateIn)
	{
		super(balance);
		monthlyInterestRate = monthlyInterestRateIn;

	}
	
	public void addMonthlyInterest()
	{
		double interestDue = super.getBalance() * monthlyInterestRate;
		super.setBalance(super.getBalance()+interestDue);

	}
	
	public void getInterestRate()
	{
		System.out.println(monthlyInterestRate);
	}
	
	public void setInterestRate(double monthlyInterestRateIn)
	{
		monthlyInterestRate = monthlyInterestRateIn;
	}
	
	public String toString()
	{
		return super.toString() + " interest rate " + monthlyInterestRate;
	}
	
	
}
