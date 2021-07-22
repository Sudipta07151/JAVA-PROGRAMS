package multithreading;

class DisplayClass{
	synchronized void display(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}
}

class Thread1 extends Thread{
	DisplayClass disp;
	Thread1(DisplayClass obj) {
		disp=obj;
	}
	public void run(){
		disp.display("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
}

class Thread2 extends Thread{
	DisplayClass disp;	
	Thread2(DisplayClass obj) {
		disp=obj;
	}
	public void run(){
		disp.display("1234567890");
	}
}

public class synchronization {
	public static void main(String args[]) {
		DisplayClass obj=new DisplayClass();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);		
		t1.start();
		t2.start();
	}
}
