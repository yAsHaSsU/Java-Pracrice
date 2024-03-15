package BrCod;
import java.util.ArrayList;
public class ArrLis2 {

	public static void main(String[] args) {
	  ArrayList<ArrayList<String>> grocery = new ArrayList();
	  
	  ArrayList<String> food= new ArrayList<String>();
	  food.add("chicken");
	  food.add("mutton");
	 
	  	
	  
	  ArrayList<String> drinks = new ArrayList<String>();
	  drinks.add("pepsi");
	  drinks.add("sprite");
	  
	  grocery.add(food);
	  grocery.add(drinks);
	 
	  System.out.println(grocery);
	  System.out.println(grocery.get(0).get(1));
	  
	}

}
