package usePolymorphism;

public class Calculator {
	
	public int landOfArea(int a, int b) {
		int result = a + b;
		return result;
	}
	public final int landOfArea(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
	public int landOfArea(int a, int b, int c, int d) {
		int result = a + b + c + d;
		return result;
	}
	public int landOfArea(int a, int b, int c, String e) {
		int result = a + b + c ;
		return result;

	}
}
