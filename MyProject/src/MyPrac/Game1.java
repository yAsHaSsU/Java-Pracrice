package MyPrac;
import java.util.Scanner;
import java.util.Random;

public class Game1 {                                                // a small program for playing rock paper scissors

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("o for rock , 1 for paper , 2 for scissors");        //ui = user input  and ci = computer input //
           int ui = sc.nextInt();
           
           Random random = new Random();
           int ci = random.nextInt(3);
           
           if(ci ==0 && ui == 1 || ui ==2 && ci==1 || ui == 0 && ci == 2) {
        	   System.out.println("you win");
           }
           else if(ui == ci) {
        	   System.out.println("Draw");
           }
           else {
        	   System.out.println("computer wins");
           }
           System.out.println("computer choics " + ci);
	}

}
