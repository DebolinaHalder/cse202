public class Account {
   private Customer customer;
   private int accountNumber;
   private double balance;
   private String branch;
   public Account(Customer cust, int no, double b ) {
		this.customer = cust;
		this.accountNumber = no;
		this.balance = b;
   }
   public Account(Customer cust, int no, String br) {
		this.customer = cust;
		this.accountNumber = no;
		this.branch = br;
   }
   public void setBalance(double x) {
		this.balance = x;
	}
	
   public void setBranch(String br) {
		this.branch = br;
	}
	
   public int getAccountNumber() {
		return accountNumber;
	}
	
   public double getBalance() {
		return balance;
	}
	
   public Customer getCustomer() {
		return customer;
	}
	
   public String getCustomerName() {
		return customer.getName();
	}
	
   public String getBranch() {
		return branch;
	}
	
   public void credit(double x) {
		balance += x;
	}
	
   public void debit(double x) {
		if (x <= balance) {
			balance -= x;
		} 
      else {
			System.out.println("Amount withdrawn exceeds the current balance!");
		}
	}
	
   public void print() {
		System.out.println("Customer: " + getCustomerName() + " Branch: " + branch + " A/C no: " + accountNumber + " Balance: " + balance);
	}
}

    
    
