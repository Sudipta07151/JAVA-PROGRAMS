package multithreading;


class Test extends Thread{
	public void run() {
		int i=0;
		while(i!=20)
		{
			System.out.println("From TEST Class"+i);
			i++;
		}
	}
}

public class first {

	public static void main(String[] args) {
		Test t= new Test();
		t.start();
		int i=0;
		while(i!=20)
		{
			System.out.println("From FIRST Class"+i);
			i++;
		}

	}

}
