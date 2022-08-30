package amigo_bank;

import java.time.LocalDate;

public class credit_card extends cards{
	public String toString() {
		return "\n\n\n\n\t\t***************************************************************\n"
				+"\t\t*                    Credit Card Details                      *\n"
				+"\t\t***************************************************************\n"
				+ "\ncredit_card_limit=" + credit_card_limit + " \nCard_no=" + Card_no + " \nCvv=" + Cvv + " \nExpiry_date=" + Expiry_date + " \nCard_holder_name="
				+ Card_holder_name + "\n\n\n";
	}
	public credit_card(String name) {
		Card_no=cards.temp++;
		credit_card_limit=100000;
		Cvv= (int)(Math.random()*999);
		Card_holder_name=name;
		LocalDate todaysDate = LocalDate.now();
		Expiry_date=todaysDate.getDayOfMonth()+"/"+todaysDate.getMonth()+"/"+(todaysDate.getYear()+4);
	}
	
	public int getCredit_card_limit() {
		return credit_card_limit;
	}
	public void setCredit_card_limit(int credit_card_limit) {
		this.credit_card_limit = credit_card_limit;
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public credit_card(long card_no, int cvv, String expiry_date, String card_holder_name, int credit_card_limit,
			int interest, int salary) {
		super(card_no, cvv, expiry_date, card_holder_name);
		this.credit_card_limit = credit_card_limit;
		this.interest = interest;
		this.salary = salary;
	}
	int credit_card_limit;
	int interest;
	int salary;


}
