package abstraction;

public class HPDriver {
	public static void main(String[] args) {
		HP h1=new Windows();
		h1.print();
		
		HP h2=new Linux();
		h2.print();
	}

}
