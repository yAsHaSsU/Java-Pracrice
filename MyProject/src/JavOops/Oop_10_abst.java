package JavOops;
abstract class Base{
	public Base() {
		System.out.println("i am a constructor of Base");
	}
	public void sayHello() {
		System.out.println("hello");                    /* is that kind of class where all the other standard derived class are
		                                                  formed*/
	}
	
	abstract public void greet();                         //we have to implement all the methods of abstract class to make a concrete class
	  
}

class Child extends Base{
	@Override
	public void greet() {
    System.out.println("good morning");
    }
}

 abstract class Child2 extends Base{
	 public void th() {
		 System.out.println("i am good");
	 }
 }

public class Oop_10_abst {

	public static void main(String[] args) {
		 Base b = new Base();             // this cannot be implemented because Base is an abstract class so we cannot instantiate
		                                  //we should not create an object of abstract class
		 Child c = new Child();
		 c.greet();
		 
		 Child2  c2 = new Child2(); // as this derived class is also an abstract class...we cannot create an objectc
		 
	}

}
