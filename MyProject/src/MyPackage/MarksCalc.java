package MyPackage;
import java.util.*;
public class MarksCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("totsl msarks ");
	     int total = sc.nextInt();
		System.out.println("Enter the marks of maths\n ");
        int maths = sc.nextInt();
        System.out.println("Enter the marks of socail\n ");
        int social = sc.nextInt();
        System.out.println("Enter the marks of hindi\n");
        int hindi = sc.nextInt();
        
        
         int all = maths + social + hindi;
         
         float percent = (all*100/total);
        System.out.println("percantage obtained " + percent);
        
        System.out.println("Total marks obtained " + all);
        
	}

}
