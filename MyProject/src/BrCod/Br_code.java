package BrCod;

import java.util.Scanner;

public class Br_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		/*	double x =3.14;
			double y = -10;
			
			double z  =Math.sqrt( y);              //min , max , abs , sqrt , round , ceil and floor(round fig)  , 
			System.out.println(z);
		}*/
	     double x;
	     double y;
	     double z;
	     
	     Scanner sc = new Scanner(System.in);
	    
	     System.out.println("enter your side x");
	     x = sc.nextDouble();
	     System.out.println("enter the side y");
	     y = sc.nextDouble();
	      
	     z=Math.sqrt((x*x)+(y*y));
	     System.out.println("the final result is :" + z);
		}
	}
