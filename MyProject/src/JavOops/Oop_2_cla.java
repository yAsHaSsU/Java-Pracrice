package JavOops;

class Employe{
	int salary;
	 public int getSalary() {
		 return salary;
	 }
	 String name;
	 public String getName() {
		 return name;
	 }
	 public void setName(String n) {
		 name = n;	
		 
	 }
}
public class Oop_2_cla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employe e1 = new Employe();
       e1.setName("yashassu");
       e1.salary=233333;
       System.out.println(e1.getSalary());
       System.out.println(e1.getName());
	}

}
