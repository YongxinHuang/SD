package 设计模式.单例;

public class Test {

	public static void main(String[] args) {
		
		Recycle r1 = Recycle.getInstance();
		Recycle r2 = Recycle.getInstance();
		
		System.out.println( r1 == r2 );


	}

}
