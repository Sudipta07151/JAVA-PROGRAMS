package oops;

interface Member{
	void callback();
}

class Store{
	Member mem[]=new Member[100];
	int count=0;
	void register(Member m)
	{
		mem[count++]=m;
	}
	void inviteSale() {
		for(int i=0;i<count;i++)
		{
			mem[i].callback();
		}
	}
	
}

class Customer implements Member{
	String name;
	Customer(String n)
	{
		name=n;
	}
	public void callback(){
		System.out.println("Please visit out store "+name);
	}
}

public class interfaceOne {
	public static void main(String args[])
	{
		Store s=new Store();
		Customer c1=new Customer("Goda");
		Customer c2=new Customer("Vutki");
		Customer c3=new Customer("Buchki");
		s.register(c1);
		s.register(c2);
		s.register(c3);
		s.inviteSale();
	}
}
