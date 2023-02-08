package practiceprogram;

public class SarswatiVidyalaya {

	int maths;
	int phy;
	int chem;
	
	public static void main(String[] args) {
		SarswatiVidyalaya avdhut = new SarswatiVidyalaya();
		SarswatiVidyalaya shyam = new SarswatiVidyalaya();
		SarswatiVidyalaya Raju = new SarswatiVidyalaya();
		
		avdhut.maths=90; avdhut.phy=92; avdhut.chem=95;
		shyam.maths=80; shyam.phy=68; shyam.chem=87;
		Raju.maths=66; Raju.phy=84; Raju.chem=55;
		
		System.out.println("Marks of Avdhut: " +" "+" M " + avdhut.maths+" "+ " P "+ avdhut.phy +" C "+ avdhut.chem);
		System.out.println(avdhut.maths+avdhut.phy+avdhut.chem);
		
		System.out.println("Marks of Shyam: " +" "+" M " + shyam.maths+" "+ " P "+ shyam.phy +" C "+ shyam.chem);
		System.out.println(shyam.maths+shyam.phy+shyam.chem);
		
		System.out.println("Marks of Raju: " +" "+" M " + Raju.maths+" "+ " P "+ Raju.phy +" C "+ Raju.chem);
		System.out.println(Raju.maths+Raju.phy+Raju.chem);
	}
}
