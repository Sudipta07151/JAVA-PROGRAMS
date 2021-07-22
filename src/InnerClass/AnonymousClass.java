package InnerClass;

interface My{
	void display();
}

class Outer2{
	public void method() {
		My m=new My() {
			public void display() {
				System.out.println("AnonymousClass");
			}			
		};
		m.display();
	}
}

public class AnonymousClass {
	public static void main(String[] args) {
		Outer2 o2=new Outer2();
		o2.method();
	}
}
