package MyPackage;
import java.util.Scanner;
public class String2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	String lstring = name.toLowerCase();
	System.out.println(lstring);
	
	String letter = "Dear name , thanks";
	letter = letter.replace("name","yashassu");
	System.out.println(letter);
}
}
