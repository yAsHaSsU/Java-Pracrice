// method dispatch
package JavOops;

class phone{
	public void keypad() {
		System.out.println("im a keypad phone");
	}
	public void call() {
		System.out.println("i can make calls");
	}
}

class smartphone extends phone{
	public void touch() {
		System.out.println("im a touch phone");
	}
	public void call() {
		System.out.println(" i can make calls virtually");
	}
}
public class Oop_9_MethodDis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      phone p = new phone();
      p.call();
      
     
      phone obj = new smartphone();    //we can write this...as when reference is the super class and obj is from the child class.
	
      //In this obj are formed during run time. Super class reference and sub class object.
      //obj is created from sub class , so call() method of smartphone is implemented.
      obj.call();         
      
      
      
      obj.touch();   // not allowed
      /* Rut this object cannot be implemented because reference is from super class and object is from child class.
      So an object in child can be implemented , if the object is referencing in the main class ,this method is called method dispatch */
	}

}
