package MyPrac;
import java.util.Random;
import java.util.Scanner;

 class game{
int a,b,c=0;
int counter;

public int game3() {
	Random r = new Random();
	a=r.nextInt(0,10); 
    return a;
}
    public void takeUserInput() {
    	do {
    	Scanner sc  = new Scanner(System.in);
    	System.out.println("guess the number");
    	b=sc.nextInt();
    	if(a>b) {
    		System.out.println("think of a bigger number");
    	}
    	else if (b>a) {
    		System.out.println("think of a smaller number");
    	}
    	c++;
     
    } while(a!=b);
 }
    public void isCorrcetNumber() {
    	if(a==b && c==1) {
    	System.out.println("pro player :) ");
    }
    }
    
    public void numbofguess(){
		System.out.println("total number of guesses: " +c);
		if (c==1) {
			System.out.println("Nice Guess");
		}
		else if (c>2 && c<7) {
			System.out.println("Good player");
		}
		else {
			System.out.println("nice try but can do better");
		}
	}
 }
    
    
public class Game0 {

	public static void main(String[] args) {
		game player = new game();
		player.game3();
		player.takeUserInput();
		player.isCorrcetNumber();
		player.numbofguess();
}
}
