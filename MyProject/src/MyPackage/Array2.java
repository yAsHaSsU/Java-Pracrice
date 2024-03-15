package MyPackage;

public class Array2 {
   public static void main(String[] args) {
	   int [][]flats;
	   flats = new int[1][2];
	   
	   flats[0][0] = 100;
	   flats[0][1] = 200;
	   
	   for(int i=0;i<flats.length;i++)
	   {
		   for(int j=0;j<flats[i].length;j++)
		   {
	   System.out.print(flats[i][j]);
	   System.out.print("  ");
}
	   System.out.print(" ");
}
   }
}
