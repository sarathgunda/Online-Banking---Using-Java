package amigo_bank;

import java.time.LocalDate;

public class debit_card extends cards{
	int debit_limit;

	public debit_card(long card_no, int cvv, String expiry_date, String card_holder_name, int debit_limit) {
		super(card_no, cvv, expiry_date, card_holder_name);
		this.debit_limit = debit_limit;
	}
	public debit_card(String name) {
		Card_no=cards.temp++;
		Cvv= (int)(Math.random()*999);
		debit_limit=200000;
		Card_holder_name=name;
		LocalDate todaysDate = LocalDate.now();
		Expiry_date=todaysDate.getDayOfMonth()+"/"+todaysDate.getMonth()+"/"+(todaysDate.getYear()+4);
	}
	public int getDebit_limit() {
		return debit_limit;
	}

	public void setDebit_limit(int debit_limit) {
		this.debit_limit = debit_limit;
	}
	public String toString() {
		return "\n\n\n\n\t\t***************************************************************\n"
				+"\t\t*                     Debit Card Details                      *\n"
				+"\t\t***************************************************************\n"
				+ "\ndebit_limit=" + debit_limit + " \nCard_no=" + Card_no + " \nCvv=" + Cvv + " \nExpiry_date="
				+ Expiry_date + " \nCard_holder_name=" + Card_holder_name + "\n\n\n";
	}
	

}
