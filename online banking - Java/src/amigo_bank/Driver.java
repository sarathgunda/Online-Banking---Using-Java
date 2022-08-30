package amigo_bank;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Branch branch=new Branch("Amigo",123,"Coimbatore",45);
		Customer c=new Customer("Laharesh45","Hitman@264","offline","Gali Laharesh","Nellore","Gali.laharesh45@gmail.com",7569391134l,685050126622l,"pan1234567","7/7/2002");
		Savings acc1=new Savings(Accounts.ac_temp++,2000000,6548,Branch.IFSC_code);
		Current acc2=new Current(Accounts.ac_temp++,500000,4545,Branch.IFSC_code,50000000l);
		c.Account1=acc1;
		c.Account2=acc2;
		branch.S_Account_list.add(acc1);
		branch.C_Account_list.add(acc2);
		Loan l1=new Loan(Loan.loan_temp++,700000,"Education Loan",5);
		c.loan_data.add(l1);
		branch.Customer_list.add(c);
		
		
		c=new Customer("Sarath123","cutie","offline","Gundai Venkata Sai Sarath Chandra","Ongole","Sarath45@gmail.com",9100426003l,123456789012l,"pan9874562","1/10/2002");
		acc1=new Savings(Accounts.ac_temp++,9000000,6548,Branch.IFSC_code);
		acc2=new Current(Accounts.ac_temp++,90000000,7272,Branch.IFSC_code,75000000l);
		c.Account1=acc1;
		c.Account2=acc2;
		branch.S_Account_list.add(acc1);
		branch.C_Account_list.add(acc2);
		l1=new Loan(Loan.loan_temp++,400000,"Education Loan",6);
		c.loan_data.add(l1);
		branch.Customer_list.add(c);
		
		c=new Customer("Sarvesh","Playgod","offline","Sarvesh P","Chennai","Sarvesh11@gmail.com",6369133419l,987654321234l,"pan1234885","2/4/2003");
		acc1=new Savings(Accounts.ac_temp++,3000000,6548,Branch.IFSC_code);
		acc2=new Current(Accounts.ac_temp++,70000000,7272,Branch.IFSC_code,22000000l);
		c.Account1=acc1;
		c.Account2=acc2;
		branch.S_Account_list.add(acc1);
		branch.C_Account_list.add(acc2);
		l1=new Loan(Loan.loan_temp++,600000,"Education Loan",2);
		c.loan_data.add(l1);
		branch.Customer_list.add(c);
		
		
		c=new Customer("Sanjith45","Rohit45","offline","Sanjith Raghav","Erode","rohithardfan45@gmail.com",8667261772l,340844264492l,"pan5698741","23/11/2002");
		acc1=new Savings(Accounts.ac_temp++,3000000,1276,Branch.IFSC_code);
		acc2=new Current(Accounts.ac_temp++,10000000,8932,Branch.IFSC_code,12000000l);
		c.Account1=acc1;
		c.Account2=acc2;
		branch.S_Account_list.add(acc1);
		branch.C_Account_list.add(acc2);
		l1=new Loan(Loan.loan_temp++,400000,"Agricultural Loan",2);
		c.loan_data.add(l1);
		branch.Customer_list.add(c);
		
		c=new Customer("Karthik","Karthik@123","offline","Karthik Sumod","Kunoor","karthiksumod245@gmail.com",9633359284l,642815632489l,"pan5698841","24/11/2002");
		l1=new Loan(Loan.loan_temp++,400000,"Personal Loan",2);
		c.loan_data.add(l1);
		branch.Customer_list.add(c);
		int tmp=0;
		System.out.println("\n\n\t\t*************************************************\n");
		System.out.println("\t\t*                                               *\n");
		System.out.println("\t\t*       -----------------------------           *\n");
		System.out.println("\t\t*        WELCOME TO AMIGO BANKING               *\n");
		System.out.println("\t\t*       -----------------------------           *\n");
		System.out.println("\t\t*                                               *\n");
		System.out.println("\t\t*************************************************\n\n\n");
		while(tmp==0)
		{
			System.out.println("Enter\n1.Login\n2.Register\n3.Exit");
			Scanner scan=new Scanner(System.in);
			int ch=0;
			while(ch<1||ch>3)
			{
				try {
					ch=scan.nextInt();
					if(ch<1||ch>3)
					{
					System.out.println("Invalid Input");	
					}
				}
				catch(Exception e) {
					System.out.println("Invalid Input");
					scan.nextLine();
				}
			}
			if(ch==1)
			{
				
				Customer c1=new Customer();
				c1=c1.login();
				if(c1!=null)
				{
					int tmp2=0;
					while(tmp2==0)
					{
						
						System.out.println("\n\n\t\t======================AMIGO BANKING==========================\n");
						System.out.println("\t\t*                1.Create Account    2.Check Balance        *\n");
						System.out.println("\t\t*                3.Make Transaction  4.Bill Payment         *\n");
						System.out.println("\t\t*                5.Apply Loan        6.View Profile         *\n");
						System.out.println("\t\t*                7.Update Profile    8.E-pass Book          *\n");
						System.out.println("\t\t*                9.Apply cards       10.Customer Service    *\n");
						System.out.println("\t\t*                             11.Exit                       *\n");
						System.out.println("\t\t=============================================================\n");
						
						
						
						int ch1=0;
						while(ch1<1||ch1>11)
						{
							try {
								ch1=scan.nextInt();
								if(ch1<1||ch1>11)
								{
								System.out.println("Invalid Input");	
								}
							}
							catch(Exception e) {
								System.out.println("Invalid Input");
								scan.nextLine();
							}
						}
						if(ch1==1) {
							c1.create_account();
						}
						else if(ch1==2) {
							if(c1.Account1!=null) {
								System.out.println("Your Saving Account balance:"+c1.Account1.balance);
							}
							if(c1.Account2!=null) {
								System.out.println("Your Current Account Balance:"+c1.Account2.balance);
							}
							if(c1.Account1==null&&c1.Account2==null) {
								System.out.println("You dont have any account");
							}
						}
						else if(ch1==3) {
							c1.make_transaction();
						}
						else if(ch1==4) {
							c1.bill_payment();
						}
						else if(ch1==5) {
							c1.apply_loan();
						}
						else if(ch1==6) {
							System.out.println(c1.toString());
							
						}
						else if(ch1==7) {
							c1.update_profile();
						}
						else if(ch1==8) {
							System.out.println("\\n\\n\\n\\n\\t\\t***************************************************************\\n\"");
							System.out.println("\t\t*                        E-Pass Book                          *\n");
							System.out.println("\t\t***************************************************************\n");
							for(Transaction i:c1.E_pass_book) {
								System.out.println(i.toString());
							}
						}
						else if(ch1==9) {
							c1.apply_card();
						}
						else if(ch1==10) {
							int temp=0;
							do{
							    String query;
							    
							    System.out.println("1.General information FAQ's"
									+ "\n2.Login Related FAQ's\n3.Service Requests FAQ's"
									+ "\n4.Fund Transfer and bill paying FAQ's\n5.Others\n6.Exit"
									+ "\nChoose the option of your query type: ");
							    int choice = scan.nextInt();
							if(choice==1)
							{
								System.out.println("1.What is Amigo Bank Internet Banking?"
										+ "\n2.On which browsers can I use the Internet Banking Website?"
										+ "\n3.Who is eligible for the Internet Banking?"
										+ "\n4.What do I do if I forget my password?"
										+ "\n5.What all services can I use on Internet Banking?"
										+ "\n6.others\nEnter your option:");
								int option =scan.nextInt();
								if(option==1)
								{
									System.out.println("\n\nThe Internet Banking gives you access to your account/s - anytime, anywhere, 24X7 - at your own comfort. You can manage all your daily transactions online. You can view statements, order cheque books, do fund transfers, order DDs, pay your bills & even shop online.\n\n");
									
								}
								else if(option==2)
								{
									System.out.println("\n\nInternet Banking works best on the latest versions of all browsers such as Internet Explorer, Google Chrome etc.\n\n");
								}
								else if(option==3)
								{
									System.out.println("\n\nInternet Banking service is available to all individual Savings and,Current account, only credit card and only loan customers. This is applicable for all domestic & NRI customers. In all cases, the customer should have the authority to operate the account with full permission.\n\n");
								}
								else if(option==4)
								{
									System.out.println("\n\nYou can generate your Internet Banking password online in case you have forgotten it. You will need your 16 digit ATM/debit card number and ATM PIN. If you do not have a debit card, then please place a request for PIN at the call center or your nearest branch.\n\n");
								}
								else if(option==5)
								{
									System.out.println("\n\nYou can manage your all your daily transactions online. You can view statements, order cheque books, do fund transfers, order DDs, pay your bills & even shop online.\n\n");
								}
								else if(option==6)
								{
								    System.out.println("\n\nEnter your query:");
								    scan.nextLine();
									query = scan.nextLine();
									System.out.println("\n\nYour problem will be resolved soon.\n\n");
								}
							}
							else if(choice==2)
							{
								System.out.println("1.What is required for accessing the account on the internet?\n2.What is a Customer ID?"
										+ "\n3.What is the policy on creating passwords?\n4.Others\nEnter your option:");
								int option = scan.nextInt();
								if(option==1)
								{
									System.out.println("\n\nYou can login with your login ID and password.\n\n");
								}
								else if(option==2)
								{
									System.out.println("\n\nA Customer Id is a character of size greater than 5 which uniquely identifies your relationship with Amigo Bank. Your customer ID is usually your login ID for the Internet Banking login. Please mention this ID in all your communications with Amigo Bank.\n\n");
								}
								else if(option==3)
								{
									System.out.println("\n\nNumber of characters should be greater than 5. It can also include numbers in it.\n\n");
								}
								else if(option==4)
								{
									System.out.println("\n\nEnter your query:");
									scan.nextLine();
									query = scan.nextLine();
									System.out.println("\n\nYour problem will be resolved soon.\n\n");
									
								}
							}
							else if(choice==3)
							{
								System.out.println("1.Which service requests can I make through Axis Bank Internet Banking?\n2.Which services come under General Banking services?"
										+ "\n3.Which services come under Tax services\n4.Others\nEnter your option: ");
								int option = scan.nextInt();
								if(option==1)	
								{
									System.out.println("\n\nGeneral Banking Services, Loan Services, Other Services.\n\n");
								}
								else if(option==2)
								{
									System.out.println("\n\nDisplay of Customer Credentials, Transaction, Bill Payments, Views Transaction History etc.\n\n");
								}
								else if(option==3)
								{
									System.out.println("\n\nWe provide loans in different fields like Personal loan, Agricultural Loan, Education loan.\n\n");
								}
								else if(option==4)
								{
									System.out.println("\n\nEnter your query:");
									scan.nextLine();
									query = scan.nextLine();
									System.out.println("\n\nYour problem will be resolved soon.\n\n");
									
								}
							}
							else if(choice==4)
							{
								System.out.println("1.What is the daily transaction limit?\n2.What are types of fund transfers I can do?\n3.What is an IFSC?"
										+ "\n4.Is online Bill Pay secure?\n5.What bills can I pay using this facility?\n6.How many billers can I choose to pay using this facility?"
										+ "\n7.Will I have a confirmation of my payment using this facility?\n8.Others\nEnter your option: ");
								int option = scan.nextInt();
								if(option==1)
								{
									System.out.println("\n\nThe daily transaction Default limit for the day is Rs. 5 Lakh.\n\n");
								}
								else if(option==2)
								{
									System.out.println("\n\nFund transfer between your own accounts, Credit card bill payments, etc.\n\n");
								}
								else if(option==3)
								{
									System.out.println("\n\nThe Indian Financial System Code (IFSC) is an RBI issued code which is being used in the NEFT system to identify recipient bank branches.\n\n");
								}
								else if(option==4)
								{
									System.out.println("\n\nYour online Bill Pay sessions are encrypted within the banking server and provide you with highest safety level while conducting your transactions.\n\n");
								}
								else if(option==5)
								{
									System.out.println("\n\nMobile Recharge, Electricity Bills, Gas Bills, Credit card Bills\n\n");
								}
								else if(option==6)
								{
									System.out.println("\n\nThere are no restrictions on number of billers that you can register under Pay Bills option provided in Internet Banking.\n\n");
								}
								else if(option==7)
								{
									System.out.println("\n\nAll your bill payments will reflect in transaction history of your account.\n\n");
								}
								else if(option==8)
								{
									System.out.println("\n\nEnter your query:");
									scan.nextLine();
									query = scan.nextLine();
									System.out.println("\n\nYour problem will be resolved soon.\n\n");
									
								}
							}
							else if(choice==5)
							{
								System.out.println("\n\nEnter your query:");
								scan.nextLine();
								query = scan.nextLine();
								System.out.println("\n\nYour problem will be resolved soon.\n\n");
								
							}
							else if(choice==6)
							{
							    temp=-1;
							}
							}while(temp==0);
						
						}
						else if(ch1==11) {
							tmp2=1;
							break;
						}
					}
				}
				
				
			}
			else if(ch==2)
			{
				Customer c1=new Customer();
				c1.register();
				Branch.Customer_list.add(c1);
				
			}
			else {
				break;
			}
		}

	}

}
