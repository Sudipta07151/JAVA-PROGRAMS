package Learning;

public class arrayMethod {
	 static void updatePos(int arr[],int val,int pos)
	 {
		 arr[pos]=val;
	 }
	 public static void main(String args[])
	 {
		 int arr[]= {1,2,3,4,5};
		 for(int i=0;i<5;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 updatePos(arr,23,2);
		 for(int i=0;i<5;i++)
		 {
			 System.out.println(arr[i]);
		 }
	 }
}
