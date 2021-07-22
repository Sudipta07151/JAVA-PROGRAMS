package multithreading;

class MyRun implements Runnable{
	public void run(){
		System.out.println("MyRun Called");
	};
}

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
		setPriority(Thread.MAX_PRIORITY);
	}
	public void run(){
		System.out.println("MyThread Called");
		for(int i=0;;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
			
	};
}


public class fourth {

	public static void main(String[] args) throws Exception
	{
		Thread t1=new Thread(new MyRun(),"MyRun");
		t1.start();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getClass());
		MyThread t2=new MyThread("MyThread");
		t2.start();
		t2.interrupt();
		System.out.println(t2.getClass());
		System.out.println(t2.getPriority());
	}

}
