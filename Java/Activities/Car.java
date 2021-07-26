
public class Car {
	String colour;
	int make;
	String transmission;
	int tyres;
	int doors;
	Car(){
		tyres=4;
		doors=4;
	}
	public void displayCharacteristics() {
		System.out.println("Colour of the Car:" + colour);
		System.out.println("make of the Car:" + make);
		System.out.println("Transmission of the Car:" + transmission);
		System.out.println("Number of doors on the Car:" + doors);
		System.out.println("Number of tyres on the Car:" + tyres);
		
	}
	public void accelerate() {
		System.out.println("Car is moving forward");
	}
 
	public void brake(){
		System.out.println("Car has stopped");
		}
}
