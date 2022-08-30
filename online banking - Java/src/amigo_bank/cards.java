package amigo_bank;

public class cards {
	static long temp=1564444581;
	long Card_no;
	int Cvv;
	String Expiry_date;
	String Card_holder_name;
    public cards() {
    	
    }
	public cards(long card_no, int cvv, String expiry_date, String card_holder_name) {
		Card_no = card_no;
		Cvv = cvv;
		Expiry_date = expiry_date;
		Card_holder_name = card_holder_name;
	}
	public String toString() {
		return "cards [\nCard_no=" + Card_no + ", \nCvv=" + Cvv + ", \nExpiry_date=" + Expiry_date + ", \nCard_holder_name="
				+ Card_holder_name + "]";
	}
	public long getCard_no() {
		return Card_no;
	}
	public void setCard_no(long card_no) {
		Card_no = card_no;
	}
	public int getCvv() {
		return Cvv;
	}
	public void setCvv(int cvv) {
		Cvv = cvv;
	}
	public String getExpiry_date() {
		return Expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		Expiry_date = expiry_date;
	}
	public String getCard_holder_name() {
		return Card_holder_name;
	}
	public void setCard_holder_name(String card_holder_name) {
		Card_holder_name = card_holder_name;
	}
	

}
