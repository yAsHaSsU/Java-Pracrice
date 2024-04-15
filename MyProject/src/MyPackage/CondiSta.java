	package MyPackage;
import java.util.Scanner;

public class CondiSta {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int age = sc.nextInt();
	 if(age>19) {
		 System.out.println("you can drive");
	 }
	 else
	 {
		 System.out.println("no you cant");
	 }
}
}