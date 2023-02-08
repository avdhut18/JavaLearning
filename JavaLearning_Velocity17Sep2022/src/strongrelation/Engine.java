package strongrelation;

public class Engine {

	public void typeOfEngine() {
		System.out.println("V12 engine");
	}
	
	
	public static void main(String[] args) {
		new Car(new Engine());
	}
}
