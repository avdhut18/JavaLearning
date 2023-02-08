package practiceprogram;

public class SarswatiVidyalayaPart2 {

	
	public void general(int maths, int checm, int phys, String name) {
		System.out.println("Marks of Student "+name);
		System.out.println("Maths: " + maths);
		System.out.println("Chem: " + checm);
		System.out.println("Phy: " + phys);
		
		System.out.println();
	}
	
	public void allStudent() {
		general(80, 90, 95, "Avdhut");
		general(85, 60, 85, "Raju");
		
	}
	
	
	public static void main(String[] args) {
		SarswatiVidyalayaPart2 ob = new SarswatiVidyalayaPart2();
		ob.allStudent();
	}	
}
