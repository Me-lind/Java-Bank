package practiceprograms;

public class Bank1 {
	String location ="Btown";
	String manager ="Tommy";
	int bankid =789001;
	
	public void printbank() {
		System.out.println("Bank Details:" +location +" " +manager +" " +bankid);
	}
	public void changesign( String nSign) {
		String sign ="cb";
		sign = nSign;
		System.out.println("New signature is: " +sign);
		
	}

	
}
