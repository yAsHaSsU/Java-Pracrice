package JavOops;

class base{
	int x;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		System.out.println("im in base an setting x now");
		this.x = x;
	}
	public void printMe(){
		System.out.println("this is a constructor");
	}
}

class derived extends base{                                           //base attributes are derived in derived class
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

public class Oop_6_inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an obj of base class
         base b = new base();
         b.setX(4);
         System.out.println(b.getX());
         
         
         //creating an obj of derived class
         derived c = new derived();
         c.setX(5);
         System.out.println(c.getX());
	
	}
}
