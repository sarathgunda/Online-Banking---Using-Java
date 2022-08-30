package amigo_bank;

public class Current extends Accounts{
	long Turnover;
	static int min_balance=10000;
	static double ca_interest=0.7;
	public long getTurnover() {
		return Turnover;
	}
	public void setTurnover(long Turnover) {
		this.Turnover = Turnover;
	}

	public double getInterest() {
		return ca_interest;
	}
	public void setInterest(double interest) {
		this.ca_interest = interest;
	}
	public Current(long account_number, int balance, int pin, int iFSC_Code, long Turnover) {
		super(account_number, balance, pin, iFSC_Code);
		this.Turnover = Turnover;

	}
	@Override
	public String toString() {
		return "\n\n\n\n\t\t***************************************************************\n"
				+"\t\t*                  Current Account Details                    *\n"
				+"\t\t***************************************************************\n"
				+ "\nTurnover: " + Turnover + " \nAccount_number: " + Account_number + " \nbalance: " + balance + " \nAccount_Pin: "
				+ Pin + " \nIFSC_Code: " + IFSC_Code + "\n\n\n";
	}
	
	

}
