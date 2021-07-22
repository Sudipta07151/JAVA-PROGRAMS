package multithreading;


class MyThread2 extends Thread{
	public MyThread2(String name) {
		super(name);
		setPriority(Thread.MAX_PRIORITY);
	}
	public void run(){
		System.out.println("MyThread Called");
		for(int i=0;;i++)
		{
			System.out.println("MyThread"+i);
//			try {
//				Thread.sleep(10);
//			}
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
		}
			
	};
}


public class fifth {

	public static void main(String[] args) throws Exception
	{
		MyThread2 t2=new MyThread2("MyThread");
//		t2.setDaemon(true);
		t2.start();
//		try {
//			Thread.sleep(5000);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		Thread mainThread=Thread.currentThread();
//		mainThread.join();
		for(int i=0;;i++)
		{
			System.out.println("Main"+i);
//			try {
//				Thread.sleep(10);
//			}
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
			Thread.yield();
		}
		
	}

}
