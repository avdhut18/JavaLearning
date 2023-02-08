package composition;

public class Car {

	public void CarColor() {
		System.out.println("White");
	}
	
	public Car(Engine engine) {
		CarColor();
		engine.EngineType();
	}
}
