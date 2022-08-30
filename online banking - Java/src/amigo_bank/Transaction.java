package amigo_bank;

public class Transaction {
	static int tras_temp;
	long Account_no;
	int Trans_id=1;
    String Type;
    int Amount;
	public Transaction(int trans_id, String type, int amount) {
		Trans_id = trans_id;
		Type = type; 
		Amount = amount;
	}
	public Transaction(long account_no, int trans_id, String type, int amount) {
		super();
		Account_no = account_no;
		Trans_id = trans_id;
		Type = type;
		Amount = amount;
	}
	public static int getTras_temp() {
		return tras_temp;
	}
	public static void setTras_temp(int tras_temp) {
		Transaction.tras_temp = tras_temp;
	}
	public long getAccount_no() {
		return Account_no;
	}
	public void setAccount_no(long account_no) {
		Account_no = account_no;
	}
	
	public int getTrans_id() {
		return Trans_id;
	}
	public void setTrans_id(int trans_id) {
		Trans_id = trans_id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	@Override
	public String toString() {
		return "\nAccount_no_: " + Account_no + " \nTrans_id: " + Trans_id
				+ " \nType: " + Type + ", \nAmount: " + Amount + "\n\n\n";
	}

	
}
