package JavOops;

   class Employee{
	   int id;
	   String name;
	   public void printdetails() {
		   System.out.println("the id is " + id);
		   System.out.println("the name is : " + name);
	   }
   }
   public class Oop_1_cla{
	   public static void main(String[] args) {
		System.out.println("this is our custom class");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.id=18;
		e1.name="yashassu";
		
		e2.id=20;
		e2.name="ram";
			
		e1.printdetails();
		e2.printdetails();
	}
}
