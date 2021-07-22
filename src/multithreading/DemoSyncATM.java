package multithreading;

class ATM {
	synchronized public void checkBalance(double amount,String name){
		try {
			Thread.sleep(1000);
			System.out.println("BALANCE OF "+name+" : "+amount);	
		}
		catch(Exception e)
		{}
	}
	
	synchronized public double withDrawBalance(double amount,double w_amount,String name){
			try {
			if(amount>=w_amount)
			{
				double balance=amount-w_amount;
				System.out.println("AMOUNT WITHDRAWN BY "+name+" IS: "+w_amount);
				Thread.sleep(500);
				return balance;
			}
			else if(amount<w_amount)
			{
				System.out.println("LOW BALANCE CANNOT BE WITHDRAWN");
				return 0;
			}			
		}
		catch(Exception e) {}
		return 0;
	}

}

class Customer extends Thread{
	double amount;
	String name;
	ATM atm_ref;
	Customer(String name,double amount,ATM atm){
		this.name=name;
		this.amount=amount;
		atm_ref=atm;
	}
	public void setAmount(double value){
		amount=value;
	}
	
	public void run(){
		atm_ref.checkBalance(amount,name);
		setAmount(atm_ref.withDrawBalance(amount,200,name));
		setAmount(atm_ref.withDrawBalance(amount,500,name));
		atm_ref.checkBalance(amount,name);
	}
	
}


public class DemoSyncATM {
	public static void main(String args[]) throws Exception {
		ATM atm_obj=new ATM();
		Customer cust1=new Customer("Shrobana",2024,atm_obj);
		Customer cust2=new Customer("Srija",4814,atm_obj);
		cust1.start();
		cust2.start();
	}
}
