package JavOops;
class CellPhone{
	public void ringing(){
		System.out.println("ringing");
	}
	public void vibrate() {
		System.out.println("vibrate");
	}
}
public class Oop_3_cla {
   public static void main(String[] args) {
	CellPhone samsung = new CellPhone();
	CellPhone apple = new CellPhone();
	
	samsung.ringing();
	apple.ringing();
	samsung.vibrate();
	apple.vibrate();
	
}
}
