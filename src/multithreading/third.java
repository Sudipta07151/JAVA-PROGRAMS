package multithreading;

class Test implements Runnable{
	public void run() {
		int i=0;
		while(i!=20)
		{
			System.out.println("From run func"+i);
			i++;
		}
	}
}

public class third {

	public static void main(String[] args) {
		Test ts=new Test();
		Thread t=new Thread(ts);
		t.start();
		int i=0;
		while(i!=20)
		{
			System.out.println("From run func"+i);
			i++;
		}
	}

}
