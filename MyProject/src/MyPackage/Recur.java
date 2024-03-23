package MyPackage;
import java .util.Scanner;
public class Recur {
        static int factorial(int n) {
        	if(n==0 || n==1) {
        		return 1;
        		
        	}
        	else
        	{
             return n*factorial(n-1);	
        }
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Scanner sc = new Scanner(System.in);
		     int num = sc.nextInt();
           System.out.println("the value of factorial n is " + num);
	}

}
