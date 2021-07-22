package lambda;

interface MyLambda{
	public void display();
}


class My implements MyLambda{
	public void display() {
		System.out.println("HELLO WORLD");
	}
}

public class LambdaFirst {
	public static void main(String args[]) {
		MyLambda m=new My();
		m.display();
	}
}
