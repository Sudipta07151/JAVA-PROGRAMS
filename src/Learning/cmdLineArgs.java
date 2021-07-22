package Learning;

public class cmdLineArgs {
//	public static void main(String args[])
//	{
//		for(String s: args)
//		{
//			System.out.print(s+" ");
//		}
//	}
	public static void main(String args[]) {
		int res=0;
		for(String val:args)
		{
			res+=Integer.parseInt(val);
		}
		System.out.print("SUM IS "+res);
	}
	
}
