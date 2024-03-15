package BrCod;
import java.util.ArrayList;

public class ArrLis1 {
       public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>(); 
		
		food.add("pizza");
		food.add("hamburger");
		food.add("choco");
		
		food.set(0,"mutton");
	
		food.remove(1);
		
		for(int i=0 ; i<food.size();i++) {
			System.out.println(food.get(i));
		}
	}
}
