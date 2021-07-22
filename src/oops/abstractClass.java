package oops;

abstract class Hospital
{
	abstract void emegency();
	abstract void appointment();
	abstract void admit();
	abstract void billing();
}

class LifeLine extends Hospital
{
	public void emegency() {
		System.out.println("emegency");
	}
	public void appointment(){
		System.out.println("appointment");
	}
	public void admit() {
		System.out.println("admit");
	}
	public void billing() {
		System.out.println("billing");
	}
}
public class abstractClass {
	public static void main(String args[])
	{
		Hospital h=new LifeLine();
		h.admit();
	}
	
}
