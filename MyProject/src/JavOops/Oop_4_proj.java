package JavOops; 	                   //guess the no game
	 class Employee2{
		 private int id;
		 private String name;
		 
		 public String getName() {
			 return name;
		 }
		 public void setName(String n) {
			 name = n;
		 }
		 public void setId(int i) {
			 id = i;
		 }
		 public int getId() {
			 return id;
		 }
	 }
public class Oop_4_proj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee2 e1 = new Employee2();
    e1.setId(15);
    e1.setName("yashassu");
    
    System.out.println(e1.getId());
    System.out.println(e1.getName());
    		;
	}

}
