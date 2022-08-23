package week3.day1.Assignments.systems;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("In AxisBank amount can be deposited only in fixed account");
	}

	
	public static void main(String[] args) {
		
		AxisBank ab=new AxisBank();
		
		ab.saving();
		ab.fixed();
		ab.deposit();
	}
}
