package amigo_bank;

import java.util.Scanner;

public class Loan {
	static int loan_temp=2;
	int Loan_no;
	int Amount;
	String Type;
	int Tenure;
	float Interest;
	double emi;
	public Loan() {
		
	}
	public Loan(int loan_no, int amount, String type, int tenure) { 
		Loan_no = loan_no;
		Amount = amount;
		Type = type;
		Tenure = tenure;
		setEmi();
	}
	public String toString() {
		return "\n\n\n\n\t\t*************************************************************\n"
				+"\t\t*                      Loan Details                         *\n"
				+"\t\t*************************************************************\n"
				+ "\nLoan_no: " + Loan_no + " \nAmount: " + Amount + " \nType: " + Type + " \nTenure(In Months): " + Tenure
				+ " \nInterest: " + Interest + " \nemi: " + emi + "";
	}
	public int getLoan_no() {
		return Loan_no;
	}
	public void setLoan_no(int loan_no) {
		Loan_no = loan_no;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount() {
		Scanner scan=new Scanner(System.in);
		
		int amt=0,ten=0,temp=0;
		do {
			temp=0;
			try {
				System.out.println("\nEnter the amount for loan(50,000-20,00,000):");
				amt=scan.nextInt();
				if(amt <50000 || amt >2000000) {
					System.out.println("\nEnter Valid Amount: ");
					temp=-1;
				}
			}
			   catch(Exception e){
					System.out.println("\nInvalid Input.");
					temp=-1;
					scan.nextLine();
					
				}
				
		}while(temp==-1);
		do {
			temp=0;
			try {
				System.out.println("\nEnter Tenure In Years: ");
				ten=scan.nextInt();
				if(ten<=0) {
					System.out.println("\nEnter Valid Tenure: ");
					temp=-1;
				}
			}
			
		        catch(Exception e){
				System.out.println("\nInvalid Input.");
				temp=-1;
				scan.nextLine();
				
			}
		
			
		}while(temp==-1);
		Amount=amt;
		Tenure=ten;
	}
	public String getType() {
		return Type;
	}
	public void setType() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the type of loan:\n1.Personal Loan\n2.Agricultural Loan\n3.Educational Loan");
		int a=0;
		while(a<1||a>3)
		{
			try {
				a=scan.nextInt();
				if(a<1&&a>3)
				{
					System.out.println("\nInvalid Input");
				}
			}
			catch(Exception e)
			{
				System.out.println("\nInvalid Input");
				scan.nextLine();
				
			}
		}
		if(a==1) {
			Type="Personal Loan";
		}
		else if(a==2)
		{
			Type="Agricultural Loan";
		}
		else
		{
			Type="Educational Loan";
		}
		
		
	}
	public int check_availability()
	{
		
		Scanner scan=new Scanner(System.in);
		if(Type=="Personal Loan")
		{
			
			int sal=0;
			int age=0;
			int temp=0;
			do {
				temp=0;
				try {
					System.out.println("Enter your salary Per Month: ");
					sal=scan.nextInt();
					if(sal<=0) {
						System.out.println("\nEnter Valid Salary: ");
						temp=-1;
					}
				}
				   catch(Exception e){
						System.out.println("\nInvalid Input");
						temp=-1;
						scan.nextLine();
						
					}
					
			}while(temp==-1);
			do {
				temp=0;
				try {
					System.out.println("\nEnter Age:");
					age=scan.nextInt();
					if(age<=0) {
						System.out.println("\nEnter Valid Age:");
						temp=-1;
					}
				}
				
			        catch(Exception e){
					System.out.println("\nInvalid Input");
					temp=-1;
					scan.nextLine();
					
				}
			
				
			}while(temp==-1);
			if(sal*12>(Amount/4)&&age>20)
			{
				System.out.println("Your loan is approved.");
				Loan_no=loan_temp++;
				return 1;
			}
			else if(age<=20)
			{
				System.out.println("Your Age is Not eligible(Age Must be Gretaer then 20).");
				System.out.println("Your loan is not approved.");
				return 0;
			}
			else {
				System.out.println("Your salary is not enough to get this loan.");
				System.out.println("Your loan is not approved.");
				return 0;
			}
			
		}
		else if(Type=="Agricultural Loan")
		{
			System.out.println("Enter your age: ");
			int age=0;
			int temp=0;
			while(temp==0)
			{
				try {
					age=scan.nextInt();
					temp=1;
				}
				catch(Exception e)
				{
					System.out.println("Invalid Input.");
					temp=0;
					scan.nextLine();
				}
			}
			if(age>20)
			{
				
				System.out.println("Your loan is approved.");
				Loan_no=loan_temp++;
				return 1;
			}
			else
			{
				System.out.println("Your Age is Not eligible(Age Must be Gretaer then 20).");
				System.out.println("Your loan is not approved.");
				return 0;
			}
			
		}
		else
		{
			
			int age=0;
			String institute=" ";
			float perc=0;
			int temp=0;
			do {
				temp=0;
				try {
					System.out.println("\nEnter Age: ");
					age=scan.nextInt();
					if(age<=0) {
						System.out.println("\nEnter Valid Age: ");
						temp=-1;
					}
				}
				   catch(Exception e){
						System.out.println("\nInvalid Input.");
						temp=-1;
						scan.nextLine();
						
					}
					
			}while(temp==-1);
			do {
				temp=0;
				try {
					System.out.println("\nEnter your Previous Passing Class Percentage: ");
					perc=scan.nextInt();
					if(perc<=0) {
						System.out.println("\nEnter Valid Percentage.");
						temp=-1;
					}
				}
				
			        catch(Exception e){
					System.out.println("\nInvalid Input.");
					temp=-1;
					scan.nextLine();
					
				}
			
				
			}while(temp==-1);
			System.out.println("\nEnter Your Institute Name: ");
			institute=scan.nextLine();
			
			if(age<23 && age>=18 && perc>40)
			{
				System.out.println("Your loan is approved.");
				Loan_no=loan_temp++;
				return 1;
			}
			else if (age<18 || age >23)
			{ 
				System.out.println("Age is not enough(Age must be between 18 to 23.)");
				System.out.println("Your loan is not approved.");
				return 0;
			}
			else{
				System.out.println("Your Percentage should be greater than 75 percent.");
				System.out.println("Your loan is not approved.");
				return 0;
			}
		}
	}
	public int getTenure() {
		return Tenure;
	}
	public void setTenure(int tenure) {
		Tenure = tenure;
	}
	public float getInterest() {
		return Interest;
	}
	public void setInterest(float interest) {
		Interest = interest;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi() {
		if(Type=="Personal Loan")
			{
				if(Amount>=50000&&Amount<=500000)
				{
					int principal=Amount;
					double rate = 4.5;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
				}
				else if(Amount>=500000&&Amount<=1000000)
				{
					int principal=Amount ;//should be admin input or user input
					double rate = 6.5;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
				}
				else if(Amount>=1000000&&Amount<=1500000)
				{
					int principal=Amount ;//should be admin input or user input
					double rate = 8.5;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
					
				}
				else if(Amount>=1500000&&Amount<=2000000)
				{
					int principal=Amount ;//should be admin input or user input
					double rate = 10;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
				}
			}
			if(Type=="Agricultural Loan")
			{
				if(Amount>=50000&&Amount<=200000)
				{
					int principal=Amount ;//should be admin input or user input
					double rate = 2.5;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
				}
				else if(Amount>=200000&&Amount<=400000)
				{
					int principal=Amount ;//should be admin input or user input
					double rate = 3.5;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
				}
				else if(Amount>=400000&&Amount<=600000)
				{
					int principal=Amount ;//should be admin input or user input
					double rate = 4.5;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
				}
				else if(Amount>=600000&&Amount<=800000)
				{
					int principal= Amount;//should be admin input or user input
					double rate = 5.5;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
				}
			}
			if(Type=="Education Loan")
			{
				if(Amount>=50000&&Amount<=500000)
				{
					int principal=Amount ;//should be admin input or user input
					double rate = 2.5;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
				}
				else if(Amount>=500000&&Amount<=1000000)
				{
					int principal=Amount ;//should be admin input or user input
					double rate = 4.5;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
				}
				else if(Amount>=1000000&&Amount<=1500000)
				{
					int principal=Amount;//should be admin input or user input
					double rate = 6.5;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
				}
				else if(Amount>=1500000&&Amount<=2000000)
				{
					int principal=Amount ;//should be admin input or user input
					double rate = 7.5;
					Interest=(float)rate;
					rate=rate/(12*100); /*one month interest*/
			        Tenure=Tenure*12; /*one month period*/
			        this.emi= (principal*rate*Math.pow(1+rate,Tenure))/(Math.pow(1+rate,Tenure)-1);
				}
			}

	}
}
