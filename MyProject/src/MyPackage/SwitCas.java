package MyPackage;
import java.util.Scanner;
public class SwitCas {

	public static void main(String[] args) {
		System.out.println("enter yout age");
		Scanner sc =new Scanner(System.in);
		int age = sc.nextInt();
		if(age>59)
		{
			System.out.println("you are experienced");
		}
		else if(age>49)
		{
			System.out.println("you are semi exp");
		}
		else if(age>36)
		{
			System.out.println("not much exp");
		}
		else
		{
			System.out.println("not experienced");
		}
	}

}
