package practiceprograms;

public class Bankbranch extends Bank {
	int balance;
	

	public int deposit (int dp) {
		int deposit = dp;
		if (deposit>100000) {
			System.out.println("Please Try again!");
		}
		else {
		balance += deposit;
		System.out.println("New account balance is: "+balance);
		
		}
		return balance;
	}

}
