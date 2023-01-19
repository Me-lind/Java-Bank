package practiceprograms;

public class Customer extends Bankbranch {
	int customerid = 901;
	String name ="Ray";
	String gender ="Male";
	String empstatus ="unemployed";
	
	public void printcustomer() {
		System.out.println("Customers details: "+name +" " +gender +" " +customerid +" " +empstatus);
	}
	
	public void deposit1(int i) {
		int deposit1 = i;
		balance += deposit1;
		System.out.println("New balance is: "+balance);
	}
	public void withdraw(int y) {
		int withdrawal = y;
		balance -=withdrawal;
		System.out.println("New balance is: "+balance);
	}
	public void sendMoney(int s) {
		int sentmoney = s;
		balance -= sentmoney;
		System.out.println("Account balance is: "+balance);
	}

	public static void main(String[] args) {
		Bank1 objbank = new Bank1();
		Bankbranch objbranch = new Bankbranch();
		Customer objcustomer = new Customer();
		
		objbank.printbank();
		objbank.changesign("krg");
		objcustomer.printcustomer();
		objbranch.deposit(11000);
		objcustomer.deposit1(100);
		objcustomer.withdraw(1000);
		objcustomer.sendMoney(800);
		
		
	}

}
