package multithreading;

public class second extends Thread{

	public void run() {
		int i=0;
		while(i!=20)
		{
			System.out.println("From run func"+i);
			i++;
		}
	}
	public static void main(String[] args) {
		second t= new second();
		t.start();
		int i=0;
		while(i!=20)
		{
			System.out.println("From main func"+i);
			i++;
		}

	}

}