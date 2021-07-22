package javalang;
import java.lang.*;


public class WrapperClass {
	public static void main(String args[])
	{
		int m1=15;
		Integer m2=Integer.valueOf(m1);
		System.out.println(m2);
		System.out.println(Integer.valueOf("11111101",2));
		System.out.println(Integer.valueOf("127",8));
		Integer m4=Integer.bitCount(25);
		System.out.println(m4);
		System.out.println(Integer.decode("0xABCD"));
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.parseInt("A",16));
		System.out.println(Integer.reverseBytes(10));
	}
}
