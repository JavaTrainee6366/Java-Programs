package KeywordsDemo;

final public class FinalDemo {
	
	final static int x ;
	
	static{
		x=100;
	}
	
	final void show()
	{
		int g = 10;
		int res = g+x;
	}
	public static void main(String[] args) {
		System.out.println(args[0]);
	}
}

