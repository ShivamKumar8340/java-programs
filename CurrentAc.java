class Account {
	double salary = 784778;
	double bonus = 588748;
}

class SavingAccount extends Account{
	int savingAccNo = 12323;
	String savingAccHoldName = "Amit";
}

public class CurrentAc extends Account {
	int currentAccNo = 8743734;
	int currentAccIfsc = 7832787;
	
	public static void main(String args[]){
		 Account ac = new Account();
		SavingAccount sa = new SavingAccount();
		CurrentAc ca = new CurrentAc();
		
		System.out.println("Account Salary: " + ac.salary);
		System.out.println("Account Bonus:" + ac.bonus);
		
		System.out.println("SavingAccount No:" + sa.savingAccNo);
		System.out.println("SavingAccount Holder Name:" + sa.savingAccHoldName);
		
		System.out.println("CurrentAcc: " + ca.currentAccNo);
		System.out.println("CurrentAcc: " + ca.currentAccIfsc);
		
		
		
	}
}