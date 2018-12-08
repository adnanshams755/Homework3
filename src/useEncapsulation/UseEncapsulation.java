package useEncapsulation;

public class UseEncapsulation {
	
	private static String computerName;
	private String computerCompany;
	private int computerPrize;
	
	public UseEncapsulation() {};
	public UseEncapsulation(String computerName, String computerCompany, int computerPrize) {
		this.computerName = computerName;
		this.computerCompany = computerCompany;
		this.computerPrize = computerPrize;
	}
	
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public String getComputerCompany() {
		return computerCompany;
	}
	public void setComputerCompany(String computerCompany) {
		this.computerCompany = computerCompany;
	}
	public int getComputerPrize() {
		return computerPrize;
	}
	public void setComputerPrize(int computerPrize) {
		this.computerPrize = computerPrize;
	}

}
