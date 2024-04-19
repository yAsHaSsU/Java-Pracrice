package JavOops;
 
class base1{  
	base1(){                                                      //creating a constructor
		System.out.println("I am a constructor");  
	}
	base1(int x){
		System.out.println("I am an over load constructor with vale of x  as : " + x);
	}
}

class derived1 extends base1{
	derived1(){
		System.out.println("I am an derived calss constructor");
	}
	derived1(int x , int y){
		super(x);
		System.out.println("I am an overlaod construcot with value of y as : " + y);
	}
}

class childofderived extends derived1{
	childofderived(){
		System.out.println("i am a child of deried cosntructor ");
	}
	
	childofderived(int x , int y , int z){
		super(x , y);
		System.out.println("i am an overload constructor derived with value z is :  " + z);
	}
}

public class Oop_7_inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       derived1 d = new derived1(14 , 9 );
       childofderived cd = new childofderived( 15 , 15 ,18); 
    		   
	}
}