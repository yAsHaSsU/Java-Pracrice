package JavOops;


interface Bicycle{
	int a = 45;
	void applyBrake(int decrement);
	void speedUp(int increment);
}
interface HornBicyle{
	void blowHorn1();
	void blowHorn2();
}

class BSA implements Bicycle , HornBicyle{
	void blowHord() {
		System.out.println("sound horn please");
	}
	public void applyBrake(int decrement) {
	System.out.println("implementung brakes");
	}
	public void speedUp(int increment) {
		System.out.println("applying accelrator");
	}
	public void blowHorn1() {
		System.out.println("please nound horn");
	}
	public void blowHorn2() {
		System.out.println("sound no horn");
	}
}
public class Oop_10_interf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BSA cyc = new BSA();
	cyc.applyBrake(0);
	// we can create properties interfaces
	System.out.println(cyc.a);
	//we cannot change or  modify the properties of Interface as they are final
    //Example:  cyc.a =233;
	
	cyc.blowHord();
	
	
	}

}
