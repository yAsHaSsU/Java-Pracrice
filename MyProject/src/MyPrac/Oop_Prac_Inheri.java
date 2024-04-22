package MyPrac;
 class circle{
	 
	 circle(int r){
		 System.out.println("i am circle parametrised constructor");
		 this.radius = r;
	 }
	 
	 public int radius;
	 public double area() {
		 return Math.PI*this.radius*this.radius;
	 }
 }
 
 class cylinder1 extends circle{
	 public int height;
	 cylinder1(int r , int h){
		 super(r);                                         //runs the constructor from the parent class
		 System.out.println("i am cyclinder1 parameterised constructor");
		 this.height = h;
	 }
	 
	 
	 
	 public double volume() {
		 return Math.PI*this.radius*this.radius*height;
	 }
 }
public class Oop_Prac_Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle(14);
        cylinder1 obj = new cylinder1(15 , 20);
        
        
	}

}
