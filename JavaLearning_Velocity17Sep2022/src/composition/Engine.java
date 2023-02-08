package composition;

public class Engine {

	public void EngineType() {
		System.out.println("V12 Engine");
	}
	
	public static void main(String[] args) {
		new Car(new Engine());
	}
}
