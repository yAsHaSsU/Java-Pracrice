package MyPrac;

public class Metho1 {
    /*       static void multiplication(int n) {
        	   for(int i=1;i<=10000;i++) {
        		   System.out.format("%d X %d = %d\n",n,i,n*i);           multiplucation
        	   }
           }
	public static void main(String[] args) {
		
multiplication(7);
	}

}*/
	
	
	static void pattern(int n) {
	   	for(int i =0; i<n ; i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println( " ");
		}
	}
	public static void main(String[] args) {
		pattern(4);
	}
}
	
