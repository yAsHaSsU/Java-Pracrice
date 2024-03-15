package MyPackage;
import java.util.Scanner;
public class Loo1 {
 public static void main(String[] args) {              
/*	 int i = 1;
	 while(i<=10) {                                  //while loop
		 System.out.println(i);
		 i++;
	 }
		*/
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 
	 if(a<0) {
		 System.out.println("negative");
	 }
	 else if(a>0) {
		 System.out.println("positive");                 // else if
	 }
	 else {
		 System.out.println("null");
	 }
	 
}
}
