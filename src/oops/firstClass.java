package oops;

class Phone
{
	private boolean state;
	private static int IMEI_NO=102323443;
	public Phone()
	{
//		System.out.println("constructor called");
		this.IMEI_NO++;
	}
	public boolean turnOn()
	{
		System.out.println("Phone ON");
		return !state;
	}
	public boolean turnOff()
	{
		System.out.println("Phone OFF");
		return !state;
	}
	public void getIMEINO(){
		System.out.println("IMEI NO :"+IMEI_NO);
	}
}


class MusicPlayer extends Phone
{
	private boolean state;
	private static int id=173892739;
	public MusicPlayer()
	{
		this.state=false;
		this.id++;
		
	}
	@Override
	public boolean turnOn()
	{
		System.out.println("MUSIC PLAYER ON");
		return !state;
	}
	@Override
	public boolean turnOff()
	{
		System.out.println("MUSIC PLAYER OFF");
		return !state;
	}
	public void display() {
		System.out.println(this.id);
	}
}
public class firstClass {
	public static void main(String args[])
	{
//		MusicPlayer mp1=new MusicPlayer();
//		mp1.turnOn();
//		mp1.turnOff();
//		MusicPlayer mp2=new MusicPlayer();
		Phone ph=new Phone();
		ph.getIMEINO();
		Phone ph2=new Phone();
		ph2.getIMEINO();
		ph2.turnOn();
	}
}
