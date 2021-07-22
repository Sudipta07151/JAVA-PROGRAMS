package Learning;

public class variableArgs {
	static int show(int ...x)
	{
		int res=0;
		for(int val:x)
		{
			System.out.print(val+" ");
			res+=val;
		}
		System.out.print("SUM IS:");
		return res;
	}
	public static void main(String args[])
	{
		System.out.println(show(10,24,677));
	}
}
