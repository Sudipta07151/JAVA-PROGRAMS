package multithreading;

class MyData{
	int value;
	boolean flag=true;
	synchronized public void set(int v) {
		while(flag!=true)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		value=v;
		flag=false;
		notify();
	}
	synchronized public int get() {
		int x=0;
		while(flag!=false)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		x=value;
		flag=true;
		notify();
		return x;
	}
}

class Producer extends Thread{
	MyData ref;
	Producer(MyData obj){
		ref=obj;
	}
	public void run() {
		int count=1;
		while(true) {
			ref.set(count);
			System.out.println("PRODUCER PRODUCED: "+count);
			count++;
		}
	}
}

class Consumer extends Thread{
	MyData ref;
	Consumer(MyData obj){
		ref=obj;
	}
	public void run() {
		while(true) {
			System.out.println("CONSUMER CONSUMED: "+ref.get());
		}
	}
}

public class ProducerConsumer {

	public static void main(String[] args) {
		MyData data=new MyData();
		Producer p=new Producer(data);
		Consumer c=new Consumer(data);
		p.start();
		c.start();
	}

}
