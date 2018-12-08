package useAbstraction;

public class TestIndustry {

	public static void main(String[] args) {
		Industry st =  new Industry("A", 50);
		System.out.println(st.gradeOfIndustry + st.point);
		Industry in = new Industry();
		
		in.madeInBangladesh();
		in.madeInIndia();
		in.electircIndustry();
		in.bangladeshiCar();
		in.indianCar();
		in.medicineIndustry();
		in.goodIndustry();
		

	}

}
