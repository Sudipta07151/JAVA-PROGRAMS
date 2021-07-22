package Learning;

public class stringMethods {
	static String getNameFromEmail(String email)
	{	
		int pos=email.indexOf('@');
		return email.substring(0,pos);
	}
	public static void main(String args[])
	{
		System.out.println(getNameFromEmail("adak07151@gmail.com"));
	}
}
