package BrCod;

public class Method1 {

	public static void main(String[] args) {
		String name = "yashassu";
		int age = 21;		
		hello(name,age);
}
     static  void hello(String name , int age) {                                           //static ani pettali beacuse mana java static main kabatti
    	                                                               // and same data type undali lopala so that void lo unna data...mai lo acces cheayachu
    	  System.out.println("hello" + " " + name + " " +age);
      }
}