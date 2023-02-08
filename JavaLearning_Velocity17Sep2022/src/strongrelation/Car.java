package strongrelation;

public class Car {

	public void colorOfCar() {
		System.out.println("White");
	}
	
	public Car(Engine eng) {
		colorOfCar();
		eng.typeOfEngine();
	}
}
