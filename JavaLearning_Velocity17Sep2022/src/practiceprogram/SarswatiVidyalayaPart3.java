package practiceprogram;

public class SarswatiVidyalayaPart3 {

	public SarswatiVidyalayaPart3(String name, int math, int phy, int chem) {

		System.out.println("Name Of Student - " +name);
		System.out.println("Maths: " +math);
		System.out.println("Phy: " +phy);
		System.out.println("Chem: " +chem);
		int total = math+phy+chem;
		System.out.println("Total: "+total);
		System.out.println();
	}

	public static void main(String[] args) {
		new SarswatiVidyalayaPart3("Avdhut", 80,90,95);
		new SarswatiVidyalayaPart3("Raju", 55,66,77);
		new SarswatiVidyalayaPart3("Shyam", 55,85,44);
		
	}
}
