package JavOops;
class A{
	public int a;
	public int yashassu() {
		return 5;
	}
	public void meth2(){ 
		System.out.println("i am method 2 of class A");          //This is a method 2 of class A
	}
}
	class B extends A{
		@Override
		public void meth2() {
			System.out.println("i am a method 2 of class B");         //This is called method overriding...this is a method 2 of class B
		}                                                             //Overrides method in A	
		public void meth3() {
			System.out.println("i am method 3 from calss B");
		}
	}

public class Oop_8_methodoverrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A a = new A() ;
	  a.meth2();
  
	  B b = new B(); 
	  b.meth2();
	  b.meth3();
	}
}
