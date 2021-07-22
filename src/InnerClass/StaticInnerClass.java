package InnerClass;




class Outer3{
	static int x=10;
	int y=20;
	static class Inner{
		void innerDisplay() {
			System.out.println("innerDisplay: "+x);
			
			//only static variable can be accessed
			//System.out.println("innerDisplay: "+y);
		}
	}
	void outerDisplay() {
		Inner i=new Inner();
		i.innerDisplay();
	}
}


public class StaticInnerClass {

	public static void main(String[] args) {

		Outer3.Inner o=new Outer3.Inner();
		o.innerDisplay();
	}

}