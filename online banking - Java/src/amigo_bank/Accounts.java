package amigo_bank;
import java.util.*;
public class Accounts {
	static int ac_temp=1;
	long Account_number;
	int balance;
	int Pin;
	int IFSC_Code;
	public long getAccount_number() {
		return Account_number;
	}
	public void setAccount_number(long account_number) {
		Account_number = account_number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	public int getIFSC_Code() {
		return IFSC_Code;
	}
	public void setIFSC_Code(int iFSC_Code) {
		IFSC_Code = iFSC_Code;
	}
	public Accounts(long account_number, int balance, int pin, int iFSC_Code) {
		super();
		Account_number = account_number;
		this.balance = balance;
		Pin = pin;
		IFSC_Code = iFSC_Code;
	}
	public String toString() {
		return "\n\n\n\n\t\t\t*************************************************************\n"
				+"\t\t*                          Account Details                    *\n"
				+"\t\t******************************************************************\n"
				+ "\nAccount_number: " + Account_number + " \nAccount_balance: " + balance + " \nPin: " + Pin + " \nIFSC_Code: "
				+ IFSC_Code + "\n\n\n";
	}
	

}
