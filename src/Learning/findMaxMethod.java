package Learning;

public class findMaxMethod {
	static int max(int a, int b, int c)
	{
		int max=a>b?(a>c?a:c):(b>c?b:c);
		return max;
	}
	
	public static void main(String args[])
	{
		System.out.print(max(21,23,25));
	}

}
 