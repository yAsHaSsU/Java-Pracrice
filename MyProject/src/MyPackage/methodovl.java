package MyPackage;

public class methodovl {              //method overloading : tow or more methods having same name but diff parameter
          static  void foo() {
        	  System.out.println("good morning bro");
          }
          static void foo(int a) {
        	  System.out.println("i love you"+a+"bro");
          }
          static void foo(int a , int b) {
        	  System.out.println("my rank is"+ a +" "+ b + "lol");
          }
            
            
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         foo();
         foo(3000);
         foo(100 , 1000);
	}

}