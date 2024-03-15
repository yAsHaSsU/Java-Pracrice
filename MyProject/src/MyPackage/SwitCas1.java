package MyPackage;
import java.util.Scanner;
public class SwitCas1 {

	public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int age = sc.nextInt();
       
       switch(age) {
       case 18:
    	   System.out.println("adult");
    	   break;
    	   
       case 21:
    	   System.out.println("job");
    	   break;
    	   
       case 60:
    	   System.out.println("old age");
    	   break;
    	   
    	   default:
    		   System.out.println("enjoy boy");
               break;
       }
       

	}

}
