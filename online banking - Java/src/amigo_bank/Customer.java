package amigo_bank;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Customer extends User{
	public Customer(String user_id, String password, String login_status) {
		super(user_id, password, login_status);
	}
	public Customer() {
		super();
	}
	Customer login() {
		// TODO Auto-generated method stub
		System.out.println("Enter your User_id:");
		Scanner scan=new Scanner(System.in);
		String id=scan.next();
		System.out.println("Enter your User_Password:");
		String pass=scan.next();
		Login_status="offline";
		for(Customer i:Branch.Customer_list) {
			if(i.User_id.equals(id))
			{
				if(i.Password.equals(pass)) {
					Login_status="online";
					return i;
				}
				else {
					System.out.println("Password incorrect");
					return null;
				}
					
			}
		}
		if(Login_status.equals("offline"))
		{
			System.out.println("User_id not found");
		}
		return null;
		
	}

	
	String Customer_name;
	String Address;
	String Email;
	long Mobile_num;
	long Aadhar_no;
	String pan_no;
	String Dob;
	List<Transaction>E_pass_book=new ArrayList<Transaction>();
	Savings Account1=null;
	Current Account2=null;
	List<Loan>loan_data=new ArrayList<Loan>();
	cards card1=null;
	cards card2=null;
	void apply_card() {
		if(card1==null||card2==null) {
			System.out.println("Enter 1.Credit_card 2.Debit_card");
			int ch2=0;
			Scanner scan=new Scanner(System.in);
			while(ch2<=0||ch2>2)
	        {
	        	try {
			        ch2=scan.nextInt();
			        if(ch2<=0||ch2>2) {
			        	System.out.println("Invalid input");
			        }
	            }
	            catch(Exception e)
	            {
		           	System.out.println("Invalid input.");
		        	scan.nextLine();
	            }
	        }
			if(ch2==1&&card1==null) {
				System.out.println("Enter card holder name:");
				String nm;
				nm=scan.next();
				card1=new credit_card(nm);
				System.out.println(card1);
			}
			else if(ch2==1&&card1!=null) {
				System.out.println("You already have a credit card");
			}
			if(ch2==2&&card2==null) {
				System.out.println("Enter card holder name:");
				String nm;
				nm=scan.next();
				card2=new debit_card(nm);
				System.out.println(card2);
			}
			else if(ch2==2&&card2!=null) {
				System.out.println("You already have a debit card");
			}
		}
		else {
			System.out.println("You already have credit and debit card");
		}
		
	}
	
	void update_profile() {
		 Scanner sc=new Scanner(System.in);
		    int ch=0,temp=0,flag=-5;
		    String user_nm;
			
			do{
			    System.out.println("Enter the choice\n1.Change UserName\n2.Change Password\n3.Change MobileNumber\n4.Change Address\n5.exit");
			    do{
			        temp=0;
			        try{
			       ch=sc.nextInt(); 
			    }
			    catch(Exception e){
			        	System.out.println("Invalid Input");
			        	sc.next();
			        	temp=-1;
			    }
			    }while(temp==-1);
			    if(ch==1){
			        System.out.println("Enter new UserName");
			        Customer_name=sc.next();
			    }
			    else if(ch==2){
			        System.out.println("Enter New Password");
			        Password=sc.next();
			        
			    }
			    else if(ch==3){
			        System.out.println("Enter New Mobile Number:");
		         do{
		              try{
		                temp=0;
		                Mobile_num=sc.nextLong();
		                if(Mobile_num<=0){
		                    temp=-4;
		                    
		                }
		               
		               long d=Mobile_num;
	                    while(d!=0)
	                   {
	                     d=d/10;
	                     temp++;
	                   }
	    
	                 if(temp!=10)
	                 {
	                   System.out.println("Enter a valid mobile no:");
	                     temp=-4;
	                 } 
		                
		            }
		            catch(Exception e){
		                System.out.println("Invalid Input");
		                sc.nextLine();
		                temp=-4;
		            }
		         }while(temp==-4);
			    }
			    else if(ch==4){
			        System.out.println("Enter the New Address");
			        sc.nextLine();
			        Address=sc.nextLine();
			    }
			    else if(ch==5){
			        break;
			    }
			    else{
			        System.out.println("Please give Correct option.");
			    }
			    
			    
			}while(flag==-5);
	}
	
	@Override
	public String toString() {
		return "\n\n\n\n\n\t\t***************************************************************\n"
				+"\t\t*                  Customer Credentials                       *\n"
				+"\t\t***************************************************************\n"
				+ "Customer_name: " + this.Customer_name + " \nCust_Address: " + this.Address + " \nCust_Email: " + this.Email
				+ " \nMobile_num: " + this.Mobile_num + " \nAadhar_no: " + this.Aadhar_no + " \npan_no: " + this.pan_no + " \nDob: " + this.Dob
				+ " \nE_pass_book=" + this.E_pass_book + " \nAccount1" + this.Account1 + " \nAccount2" + this.Account2 + " \nloan_data"
				+ this.loan_data + "\n\n\n";
	}
	void register() {
		int len,index1,index2,temp=0,dd=0,mm=0,yy=0,str;
		Mobile_num=0;
		Aadhar_no=0;
		Scanner sc= new Scanner(System.in);
		int temp1=0;
		while(temp1==0) {
			System.out.println("Enter Your User_id:");
			User_id=sc.next();
			for(Customer i:Branch.Customer_list) {
				if(User_id.equals(i.User_id)) {
					System.out.println("User id already taken.");
				}
				else {
					temp1++;
				}
			}
			if(temp1==Branch.Customer_list.size()) {
				break;
			}
			else {
				temp1=0;
			}
		}
		System.out.println("Enter Your password:");
		Password=sc.next();
		Login_status="offline";
		sc.nextLine();
		System.out.println("Please enter your Name:");
	    Customer_name=sc.nextLine();
	    len=Customer_name.length();
	    while(len<4){
	        System.out.println("Please enter Valid Name:");
	        Customer_name=sc.nextLine();
	        len=Customer_name.length();
	    }
	    System.out.println("Please enter your Address:");
	    Address=sc.nextLine();
	    len=Address.length();
	    while(len<5){
	        System.out.println("Please enter Valid Address:");
	        Address=sc.nextLine();
	        len=Address.length();
	    }
	    System.out.println("Please enter your Mobile number:");
	    
	    do{
	     //Mobile_num=sc.nextLong();
	    		try {
	    			temp=0;
			    	Mobile_num=sc.nextLong();
			    	long d=Mobile_num;
				    while(d!=0)
				    {
				    	d=d/10;
				        temp++;
				    }
				    
				    if(temp!=10)
				    {
				    	System.out.println("Enter a valid mobile no:");
				    }
		        }
		        catch(Exception e)
		        {
		        	System.out.println("Invalid mobile_num input.");
		        	System.out.println("Enter valid mobile_num");
		        	sc.nextLine();
		        }
	    }while(temp!=10||Mobile_num<=0);
        System.out.println("Please enter Your Email:");
        do{
        	temp=0;
            Email=sc.next();
            index1=Email.indexOf('@');
            index2=Email.indexOf('.');
            if(index1==-1 || index2==-1 || Email.length()<10)
            {
                temp=-1;
                System.out.println("Please enter Valid Email:");
                sc.nextLine();
                
            } 
         }while(temp==-1);
        
    
        do{
	        str = -1;
	        System.out.println("Please enter your date of birth(date month year):");
	        //dd=sc.nextInt();
	        while(dd<=0)
	        {
	        	try {
		        	dd=sc.nextInt();
	            }
	            catch(Exception e)
	            {
		           	System.out.println("Invalid day input.");
		           	System.out.println("Enter valid day input.");
		        	sc.nextLine();
	            }
	        }
	        
	        //mm=sc.nextInt();
	        while(mm<=0)
	        {
	        	try {
			        mm=sc.nextInt();
	            }
	            catch(Exception e)
	            {
		           	System.out.println("Invalid month input.");
		           	System.out.println("Enter valid month input.");
		        	sc.nextLine();
	            }
	        }
	        
	        //yy=sc.nextInt();
	        while(yy<=0)
	        {
	        	try {
		        	yy=sc.nextInt();
	            }
	            catch(Exception e)
	            {
	           	 System.out.println("Invalid year input.");
	            }
	        }
	        
	        if(yy>=1950 && yy <= 2003)
	        {
	            //checkin month validation
	            if(mm>=1 && mm<=12)
	            {
	                //checkin days validation
	                if((dd>=1 && dd<=31) && (mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12)) {}
	                else if((dd>=1 && dd<=30) && (mm==4 || mm==6 || mm==9 || mm==11)) {}
	                else if((dd>=1 && dd<=28) && (mm==2)) {}
	                else if(dd==29 && mm==2 && (yy%400==0 ||(yy%4==0 && yy%100!=0))) {}
	                else
	                {
	                	dd=0;
	    	            yy=0;mm=0;
	                    str=0;
	                    System.out.println("Day is invalid.\n");
	                }
	            }
	            else
	            {
	            	dd=0;
		            yy=0;mm=0;
	                str = 0;
	                System.out.println("Month is not valid.\n");
	                sc.nextLine();
	            }
	        }
	        else
	        {
	            str = 0;
	            dd=0;
	            yy=0;mm=0;
	            System.out.println("Year is not valid.\nPLease enter valid date: \n ");
	        }
    }while(str==0);
    Dob=dd+"/"+mm+"/"+yy;
    System.out.println(Dob);
     System.out.println("Please enter Aadhar Number:");
    do
    {
    	temp=0;
     //Aadhar_no=sc.nextLong();
    		try {
   	    	  Aadhar_no=sc.nextLong();
   	    	  long d=Aadhar_no;
	  	      temp=0;
	  	      while(d!=0)
	  	       {
	  	            d=d/10;
	  	            temp++;
	  	       }
	  	    
	  	      if(temp!=12)
	  	      {
	  	           System.out.println("Enter a valid Aadhar Number:");
	  	           sc.nextLine();
	  	            temp=0;
	  	      }
            }
            catch(Exception e)
            {
	           	System.out.println("Invalid Addhaar input.");
	        	sc.nextLine();
            }
     
	     
	
    }while(temp!=12||Aadhar_no<0);
    System.out.println("Please enter your Pan Number:");
    do{
        temp=0;
        pan_no=sc.next();
        len=pan_no.length();
        if(len!=10){
            temp=-4;
             System.out.println("Please enter Valid Pan Number:");
             sc.nextLine();
        }
    }while(temp==-4);
    
	    
   
   }
   
   


	void create_account() {
		if(Account1==null||Account2==null)
		{
			Scanner scan= new Scanner(System.in);
			System.out.println("\nDo you want to create 1.current account or 2.savings account");
			int a=0;
			while(a<1||a>2)
			{
				try {
					a=scan.nextInt();
					if(a<1||a>2)
					{
						System.out.println("\nInvalid choice number.");
					}
				}
				catch(Exception e)
				{
					System.out.println("\nInvalid Input.");
					scan.nextLine();
				}
			}
			if(a==2 && Account1==null)
			{
				System.out.println("you need to have a minimum balance of Rs.1000");
				System.out.println("you need to do a initial deposit of Rs.10000");
				int ac_no=Accounts.ac_temp++;
				int balance=10000;
				int pin = (int)(Math.random()*9000)+1000;
				int ifsc=Branch.IFSC_code;
				Account1=new Savings(ac_no,balance,pin,ifsc);
				Account1.toString();
				Branch.S_Account_list.add(Account1);
				System.out.println(Account1.toString());
			
			}
			else if(a==2 && Account1!=null)
			{
				System.out.println("You already have an existing Savings account.");
			}
			else if(a==1&& Account2==null) {
				System.out.println("Enter your anual turnover:");
				long sal=0;
				while(sal<=0)
				{
					try {
						sal=scan.nextInt();
						if(sal<0)
						{
							System.out.println("Invalid salary input.");
						}
					}
					catch(Exception e)
					{
						System.out.println("\nInvalid Input.");
						scan.nextLine();
					}
				}
				if(sal>500000) {
					System.out.println("you need to have a minimum balance of Rs.10000");
					System.out.println("you need to do a initial deposit of Rs.100000");
					int ac_no=Accounts.ac_temp++;
					int balance=100000;
					int pin = (int)(Math.random()*9000)+1000;
					int ifsc=Branch.IFSC_code;
					Account2=new Current(ac_no,balance,pin,ifsc,sal);
					Account2.toString();
					Branch.C_Account_list.add(Account2);
					System.out.println(Account2.toString());
				}
				else {
					System.out.println("You need to have a turnover more than 5 lakhs.");
				}
				
			}
			else if(a==1&& Account2!=null)
			{
				System.out.println("You are already having an existing current account.");
			}
			
		}
		else
			System.out.println("You already have 2 accounts, so no more accounts can be created.");
	}
	public Customer(String user_id, String password, String login_status, String customer_name, String address,
			String email, long mobile_num, long aadhar_no, String pan_no, String dob) {
		super(user_id, password, login_status);
		Customer_name = customer_name;
		Address = address;
		Email = email;
		Mobile_num = mobile_num;
		Aadhar_no = aadhar_no;
		this.pan_no = pan_no;
		Dob = dob;
	}
	void apply_loan() {
		Loan l=new Loan();
		l.setType();
		l.setAmount();
		int temp=l.check_availability();
		if(temp==0)
		{
			System.out.println("You are not eligible to take loan.");
		}
		else
		{
			System.out.println("You are eligible to take loan.");

			l.setEmi();
			System.out.println(l.toString());
			loan_data.add(l);
		}
	}
	int debiting(Savings acc,int amt) {
		if((Account1.balance-amt)<Savings.min_balance) {
			System.out.println("You don't have enough balance.");
			return 0;
		}
		else
		{
			Branch.maintain_accounts("Savings","Debit",amt,Account1.Account_number);
			//public Transaction(int trans_id, String type, int amount)
			int trans_id=Transaction.tras_temp++;
			String Type="Debiting";
			Transaction t=new Transaction(Account1.Account_number,trans_id,Type,amt);
			E_pass_book.add(t);
			return 1;
		}
		
		
	}
	int debiting(Current acc,int amt) {
		if((Account2.balance-amt)<Current.min_balance) {
			System.out.println("You don't have enough balance.");
			return 0;
		}
		else
		{
			Branch.maintain_accounts("Current","Debit",amt,Account2.Account_number);
			int trans_id=Transaction.tras_temp++;
			String Type="Debiting";
			Transaction t=new Transaction(Account2.Account_number,trans_id,Type,amt);
			E_pass_book.add(t);
			return 1;
		}
		
		
	}
	void crediting(long acc_no,int amt) {
		Branch.maintain_accounts("Credit",amt,acc_no);
	}
	void make_transaction(){
		System.out.println("Enter your account_no:");
		Scanner scan=new Scanner(System.in);
		long acc=0;
		while(acc<=0)
		{
			try {
				acc=scan.nextLong();
				if(acc<=0)
				{
					System.out.println("\nInvalid Account number.");
				}
			}
			catch(Exception e)
			{
				System.out.println("\nInvalid Account number.");
				scan.nextLine();
			}
		}
		if(Account1!=null){
			if(Account1.Account_number==acc) {
				System.out.println("Your current balance:"+Account1.balance);
				System.out.println("Enter your account pin:");
				int pin=0;
				while(pin<=0)
				{
					try {
						pin=scan.nextInt();
						if(pin<=0)
						{
							System.out.println("\nInvalid pin number. Please check the pin number while entering.");
						}
						if(pin!=Account1.Pin)
						{
							System.out.println("\nInvalid pin number. Please check the pin number while entering.");
							pin=0;
						}
					}
					catch(Exception e)
					{
						System.out.println("\nInvalid pin number.");
						scan.nextLine();
					}
				}
				System.out.println("Enter the Receiptant's Account number:");
				long acc2=0;
				while(acc2<=0)
				{
					try {
						acc2=scan.nextLong();
						if(acc2<=0)
						{
							System.out.println("\nInvalid Account number. Once please check your account number.");
						}
						if(!Branch.check_account(acc2)) {
							System.out.println("\nInvalid Account number. Once please check your account number.");
							acc2=0;
						}
					}
					catch(Exception e)
					{
						System.out.println("\nInvalid Account number.");
						scan.nextLine();
					}
				}
				System.out.println("Enter the amount:");
				int amt=0;
				while(amt<=0)
				{
					try {
						amt=scan.nextInt();
						if(amt<=0)
						{
							System.out.println("\nInvalid input.");
						}
					}
					catch(Exception e)
					{
						System.out.println("\nInvalid input.");
						scan.nextLine();
					}
					
				}
				if(debiting(Account1,amt)==1) {
					crediting(acc2,amt);
					System.out.println("Transaction is done successfully.");
					System.out.println("Your balance: "+Account1.balance);
				}
				else {
					System.out.println("Transaction cancelled.");
				}
			}
			
			
		}
		if(Account2!=null){
			
			 if(Account2.Account_number==acc) {
				System.out.println("Your account_balance: "+Account2.balance);
				System.out.println("Enter your account_pin: ");
				int pin=0;
				while(pin<=0)
				{
					try {
						pin=scan.nextInt();
						if(pin<=0)
						{
							System.out.println("\nInvalid account_pin.");
						}
						if(pin!=Account2.Pin)
						{
							System.out.println("\nInvalid account_pin.");
							pin=0;
						}
					}
					catch(Exception e)
					{
						System.out.println("\nInvalid account_pin.");
						scan.nextLine();
					}
				}
				System.out.println("Enter the Receiptant's Account number:");
				long acc2=0;
				while(acc2<=0)
				{
					try {
						acc2=scan.nextLong();
						if(acc2<=0)
						{
							System.out.println("\nInvalid Account number. Please check your account number.");
						}
						if(!Branch.check_account(acc2)) {
							System.out.println("\nInvalid Account number. Please check your account number.");
							acc2=0;
						}
					}
					catch(Exception e)
					{
						System.out.println("\nInvalid Account number.");
						scan.nextLine();
					}
				}
				System.out.println("Enter the amount:");
				int amt=0;
				while(amt<=0)
				{
					try {
						amt=scan.nextInt();
						if(amt<=0)
						{
							System.out.println("\nInvalid amount input.");
						}
					}
					catch(Exception e)
					{
						System.out.println("\nInvalid input.");
						scan.nextLine();
					}
					
				}
				if(debiting(Account2,amt)==1) {
					crediting(acc2,amt);
					System.out.println("Transaction is done successfully.");
					System.out.println("Your balance:"+Account2.balance);
				}
				else {
					System.out.println("Transaction cancelled.");
				}
			}
		}
		
		if(Account1==null && Account2==null) {
			System.out.println("Invalid Account number. Please check your account number.");
		}
	}
	void bill_payment() {
		long M_num;
		 int temp=0,ch=0,Gas,Elec;
		 Scanner sc= new Scanner(System.in);
		 
		 do{
			 System.out.println("Choose the Option\n1.Mobile Recharge\n2.Gas Bill\n3.Electricity Bill\n4.Exit");
		     try{
		         ch=sc.nextInt();
		         if(ch<0){
		             temp=-1;
		         }
		     }
		     catch(Exception e){
		         
		          temp=-1;
		          sc.nextLine();
		     }
		     if(ch!=4)
		     {
		    	 if(ch==1){
			         System.out.println("Enter  Mobile Number: ");
			         do{
			              try{
			                temp=0;
			                M_num=sc.nextLong();
			                if(M_num<=0){
			                    temp=-4;
			                    
			                }
			               
			               long d=M_num;
		                    while(d!=0)
		                   {
		                     d=d/10;
		                     temp++;
		                   }
		    
		                 if(temp!=10)
		                 {
		                   System.out.println("Enter a valid mobile no: ");
		                     temp=-4;
		                 } 
			                
			            }
			            catch(Exception e){
			                System.out.println("Invalid mobile number.");
			                sc.nextLine();
			                temp=-4;
			            }
			         }while(temp==-4);
			         
			     }
			     else if(ch==2){
			         
			         do{
			             System.out.println("Enter  Gas service Number: ");
			              try{
			                temp=0;
			                Gas=sc.nextInt();
			                if(Gas<=0){
			                    temp=-4;
			                    
			                }
			            }
			            catch(Exception e){
			                System.out.println("Invalid Gas service number.");
			                sc.nextLine();
			                temp=-4;
			            }
			         }while(temp==-4);

			         
			     }
			     else if(ch==3){
			         
			         do{
			             System.out.println("Enter Electricity service Number:");
			              try{
			                temp=0;
			                Elec=sc.nextInt();
			                if(Elec<=0){
			                    temp=-4;
			                    
			                }
			            }
			            catch(Exception e){
			                System.out.println("Invalid Electricity service Number.");
			                sc.nextLine();
			                temp=-4;
			            }
			         }while(temp==-4);
			         
			     }
		    	 System.out.println("Enter your account_no: ");
		 		Scanner scan=new Scanner(System.in);
		 		long acc=0;
		 		while(acc<=0)
		 		{
		 			try {
		 				acc=scan.nextLong();
		 				if(acc<=0)
		 				{
		 					System.out.println("\nInvalid Account number. Please check your account number.");
		 				}
		 			}
		 			catch(Exception e)
		 			{
		 				System.out.println("\nInvalid Account number.");
		 				scan.nextLine();
		 			}
		 		}
		 		if(Account1!=null){
					if(Account1.Account_number==acc) {
						System.out.println("Your current balance: "+Account1.balance);
						System.out.println("Enter your account pin: ");
						int pin=0;
						while(pin<=0)
						{
							try {
								pin=scan.nextInt();
								if(pin<=0)
								{
									System.out.println("\nInvalid account pin.");
								}
								if(pin!=Account1.Pin)
								{
									System.out.println("\nInvalid account pin.");
									pin=0;
								}
							}
							catch(Exception e)
							{
								System.out.println("\nInvalid pin.");
								scan.nextLine();
							}
						}
						
						System.out.println("Enter the amount: ");
						int amt=0;
						while(amt<=0)
						{
							try {
								amt=scan.nextInt();
								if(amt<=0)
								{
									System.out.println("\nInvalid amount input.");
								}
							}
							catch(Exception e)
							{
								System.out.println("\nInvalid input.");
								scan.nextLine();
							}
							
						}
						if(debiting(Account1,amt)==1) {
							
							System.out.println("Payment is done successfully.");
							System.out.println("Your balance: "+Account1.balance);
						}
						else {
							System.out.println("Transaction cancelled.");
						}
					}
					
					
				}
				if(Account2!=null){
					
					 if(Account2.Account_number==acc) {
						System.out.println("Your account balance:"+Account2.balance);
						System.out.println("Enter your account pin:");
						int pin=0;
						while(pin<=0)
						{
							try {
								pin=scan.nextInt();
								if(pin<=0)
								{
									System.out.println("\nInvalid account pin.");
								}
								if(pin!=Account2.Pin)
								{
									System.out.println("\nInvalid account pin.");
									pin=0;
								}
							}
							catch(Exception e)
							{
								System.out.println("\nInvalid account pin.");
								scan.nextLine();
							}
						}
						
						System.out.println("Enter the amount:");
						int amt=0;
						while(amt<=0)
						{
							try {
								amt=scan.nextInt();
								if(amt<=0)
								{
									System.out.println("\nInvalid amount input.");
								}
							}
							catch(Exception e)
							{
								System.out.println("\nInvalid input.");
								scan.nextLine();
							}
							
						}
						if(debiting(Account2,amt)==1) {
							
							System.out.println("Payment is done successfully.");
							System.out.println("Your balance:"+Account2.balance);
						}
						else {
							System.out.println("Transaction cancelled.");
						}
					}
				}
				
				if(Account1==null && Account2==null) {
					System.out.println("Invalid Account number. Please check your account number.");
				}
		     }
		     else if(ch==4){
		         break;
		     }
		     else{
		         System.out.println("Invalid Input.");
		         temp=-1;
		     }
		     
		 }while(temp==-1);
 
	}

}
