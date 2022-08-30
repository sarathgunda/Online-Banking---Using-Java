package amigo_bank;

public class Savings extends Accounts{
	static int min_balance=1000;

	public int getMin_balance() {
		return min_balance;
	}

	public Savings(long account_number, int balance, int pin, int iFSC_Code) {
		super(account_number, balance, pin, iFSC_Code);
	}
	public String toString() {
		return "\n\n\n\n\t\t***************************************************************\n"
				+"\t\t*                  Savings Account Details                    *\n"
				+"\t\t***************************************************************\n"
				+ "\nmin_balance: " + min_balance  + " \nAccount_number: "
				+ Account_number + " \nbalance: " + balance + " \nPin: " + Pin + " \nIFSC_Code: " + IFSC_Code + "\n\n\n";
	}
	
	
	

}
