package usePolymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal1 = new Calculator();
		System.out.println(cal1.landOfArea(10, 15));
		System.out.println(cal1.landOfArea(10, 15, 20));
		System.out.println(cal1.landOfArea(10, 15, 20, 30));

		ModernCalculator mc = new ModernCalculator();
		System.out.println(mc.landOfArea(10, 15, 20, 30));

	}

}
