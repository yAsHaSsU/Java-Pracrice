package BrCod;

import java.util.Scanner;

public class Br_code1_loo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int rows;
		 int columns;
		 String symbol ; 
		
		 System.out.println("Enter the rows");
		 rows=sc.nextInt();
		 System.out.println("Enter the columns");
		 columns = sc.nextInt();
		 System.out.println("enter the symbol");
		 symbol = sc.next();
		 
		 
		
		 for(int i=1;i<=rows ; i++) {
			 System.out.println();
			 for(int j=1 ; j<= columns ; j++) {
				 System.out.print(symbol);
			 }
		 }
		 }
	}

