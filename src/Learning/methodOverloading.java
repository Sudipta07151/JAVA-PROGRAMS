package Learning;

public class methodOverloading {
	static int reverse(int val)
	{
		int rev=0;
		System.out.println("BEFORE ");
		System.out.println(val);
		while(val!=0)
		{
			rev=(rev*10)+(val%10);
			val=val/10;
		}
		return rev;
	}
	static int[] reverse(int arr[])
	{
		int l=arr.length;
		System.out.println("BEFORE ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<l/2;i++)
		{
			arr[i]=arr[l-i-1];
		}
		return arr;
	}
	public static void main(String args[])
	{
		int arr[]= {23,34,56,67,11};
		System.out.println("AFTER ");
		System.out.println(reverse(225));
		int newArr[]=reverse(arr);
		System.out.println("AFTER ");
		for(int i=0;i<newArr.length;i++)
		{
			System.out.print(newArr[i]+" ");
		}
	}
}
