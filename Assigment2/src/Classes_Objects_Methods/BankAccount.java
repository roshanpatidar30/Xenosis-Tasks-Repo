package Classes_Objects_Methods;

public class BankAccount {


	private double balance;
	public BankAccount(double initialBalance) {
		if(initialBalance > 0) {
			balance = initialBalance;
		}else {
			balance = 0.0;
		}
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposit Successfully"+ amount);
		}
		else {
			System.out.println("Please enter valid amount");
		}
		
	}
	
	public void withdraw(double amount) {
	
			if(amount > 0 ) {
				if(amount < balance) {
				balance -= amount;
				System.out.println("Withdraw succesfully :" +amount);
			}else {
				System.out.println("Insufficient balance!!!");
			}
			
		}else {
			System.out.println("Please enter valid amount");
		}
	}
	
	public void checkBalance() {
		System.out.println("Toal Balance is : " + balance);
	}
	public static void main(String[] args) {
		BankAccount bankaAccount = new BankAccount(500.0);
		bankaAccount.checkBalance();
		bankaAccount.withdraw(200);
		bankaAccount.checkBalance();
		bankaAccount.deposit(6000);
		bankaAccount.checkBalance();
		
	}

	
}


