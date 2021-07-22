package oops;

class Cycle
{
	protected static int sno=1073287;
	private boolean run;
	Cycle()
	{
		this.sno++;
		this.run=false;
	}
	public void applyBrakes(){
		System.out.println("Cycle stopped");
		this.run=false;
	}
	public void accelerate() {
		System.out.println("Cycle Running");
		this.run=true;
	}
	public void get_Sno() {
		System.out.println("Serial no: "+this.sno);
	}
}

class GearedCycle extends Cycle
{
	private int gear;
	GearedCycle()
	{
		this.gear=1;
	}
	public void gearUp() {
		this.gear++;
		System.out.println("Gear Up to: "+this.gear);
	}
	public void gearDown() {
		this.gear--;
		System.out.println("Gear Down to: "+this.gear);
	}
	public void getGear()
	{
		System.out.println("Gear at:"+this.gear);
	}
	public void get_Sno() {
		System.out.println("Serial no: "+super.sno+"GS");
	}
}


public class dynamicDispatch {
	public static void main(String args[])
	{
		Cycle c=new GearedCycle();
		c.get_Sno();
		c.accelerate();
		c.applyBrakes();
		GearedCycle cg=new GearedCycle();
		cg.get_Sno();
		cg.accelerate();cg.gearUp();
		cg.accelerate();cg.gearDown();
	}
}
