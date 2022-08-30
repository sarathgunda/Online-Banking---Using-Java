package amigo_bank;

import java.util.ArrayList;
import java.util.List;

public class Branch {
	String Branch_name;
	final int Branch_id;
	final String location;
	static int IFSC_code;
	static List<Savings> S_Account_list=new ArrayList<Savings>();
	static List<Current> C_Account_list=new ArrayList<Current>();
	static List<Customer> Customer_list=new ArrayList<Customer>();
	static void maintain_accounts(String ac_type,String type,int amt,long act_no) {
		if(ac_type=="Savings")
			for(Accounts i:S_Account_list) {
				if(i.Account_number==act_no) {
					if(type.equals("Debit")) {
						i.balance-=amt;
					}
				}
			}
		else if(ac_type=="Current")
			for(Accounts i:C_Account_list) {
				if(i.Account_number==act_no) {
					if(type=="Debit") {
						i.balance-=amt;
					}
				}
			}	
	}
	static void maintain_accounts(String type,int amt,long act_no) {
		if(type=="Credit")
		{
			for(Customer i:Customer_list) {
				if(i.Account1!=null)
				if(i.Account1.Account_number==act_no) {
					i.Account1.balance+=amt;
					int trans_id=Transaction.tras_temp++;
					String Type="Crediting";
					Transaction t=new Transaction(act_no,trans_id,Type,amt);
					i.E_pass_book.add(t);
				}
				if(i.Account2!=null)
				if(i.Account2.Account_number==act_no) {
					i.Account2.balance+=amt;
					int trans_id=Transaction.tras_temp++;
					String Type="Crediting";
					Transaction t=new Transaction(act_no,trans_id,Type,amt);
					i.E_pass_book.add(t);
				}
			}
		}
	}
	static boolean check_account(long account_no) {
		for(Accounts i:S_Account_list) {
			if(i.Account_number==account_no) {
				return true;
			}
		}
		for(Accounts i:C_Account_list) {
			if(i.Account_number==account_no) {
				return true;
			}
		}
		return false;
	}
	public Branch(String branch_name, int branch_id, String location, int iFSC_code) {
		Branch_name = branch_name;
		Branch_id = branch_id;
		this.location = location;
		IFSC_code = iFSC_code;
	}
	public String getBranch_name() {
		return Branch_name;
	}
	public void setBranch_name(String branch_name) {
		Branch_name = branch_name;
	}
	public List<Savings> getS_Account_list() {
		return S_Account_list;
	}
	public void setS_Account_list(List<Savings> s_Account_list) {
		S_Account_list = s_Account_list;
	}
	public List<Current> getC_Account_list() {
		return C_Account_list;
	}
	public void setC_Account_list(List<Current> c_Account_list) {
		C_Account_list = c_Account_list;
	}
	public int getBranch_id() {
		return Branch_id;
	}
	public String getLocation() {
		return location;
	}
	public int getIFSC_code() {
		return IFSC_code;
	}
	public String toString() {
		return "Branch [\nBranch_name=" + Branch_name + ", \nBranch_id=" + Branch_id + ", \nlocation=" + location
				+ ", \nIFSC_code=" + IFSC_code + ", \nS_Account_list=" + S_Account_list + ", \nC_Account_list="
				+ C_Account_list + "]";
	}
	
	
}
