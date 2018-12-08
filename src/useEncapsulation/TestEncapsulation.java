package useEncapsulation;



public class TestEncapsulation {

	public static void main(String[] args) {
		
			UseEncapsulation use1 = new UseEncapsulation();
			use1.setComputerName("Dell inspiron");
			use1.setComputerCompany("Dell computer");
			use1.setComputerPrize(1400);
			System.out.println(use1.getComputerName()+" "+use1.getComputerCompany()+"  "+use1.getComputerPrize());
		
			UseEncapsulation use2 = new UseEncapsulation("Dellinspiron","Dellcomputer",50);
			System.out.println(use2.getComputerName()+use2.getComputerCompany()+use2.getComputerPrize());
		}

	

}
