package MyPackage;
import java.util.Scanner;

public class strlen1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int value = s1.length();   //1
		String lstring = s1.toLowerCase();    //2
		String ustring1 = s1.toUpperCase();   //3
		String nonTrimedString = "        Yashassu   ";  //4
		String Trimed = nonTrimedString.trim();          //4 or method 
		
	    System.out.println(value);
	    System.out.println(s1.substring(3));       //5
	    System.out.println(s1.substring(1,5));     //5 
	    System.out.println(s1.replace('y' , 'z'));  //6
	    System.out.println(s1.replace("yas","Bas")); //6
		System.out.println(lstring);
		System.out.println(ustring1);
		
		System.out.println(nonTrimedString);
		System.out.println(Trimed);

	}

}
