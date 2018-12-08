package useAbstraction;

public class Industry extends SubcontinentIndustry implements CarIndustry {
	public int point;
	public Industry() {}
	public Industry(String gradeOfIndustry, int point) {
		super(gradeOfIndustry);
		this.point = point;
	}
	
	
	public void medicineIndustry() {
		System.out.println("They make medicine");
	}
	public void bangladeshiCar() {
		System.out.println("Banglaesh makes car");
		
	}
	
	public void indianCar() {
		System.out.println("Indian makes car");
	}
	public void goodIndustry() {
		System.out.println("Indian and bangladeshi industries are good");
	}

}
