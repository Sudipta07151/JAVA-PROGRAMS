package javalang;
import java.lang.*;

class MyObject{}

public class ObjectCLass {
	public static void main(String args[])
	{
		Object o1=new Object();
		Object o2=o1;
		MyObject my=new MyObject();
		System.out.println(o1.equals(o2));
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
	}
}
