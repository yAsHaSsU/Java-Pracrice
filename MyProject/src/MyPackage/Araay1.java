package MyPackage;


public class Araay1 {
  public static void main(String[] args) {

	/*int [] marks = new int [4];
	marks[0] = 100;
	marks[1] = 90;
	marks[2]=80;
	marks[3]=70 ;*/
	  
	  
	 
	/* int [] marks = {100 , 20 , 25 , 80};
	System.out.println(marks[2]);*/                       //array inti
	  
	  
	  
	/*  String [] students = {"shubha" ," yashassu" , "gowtham"};
	  for(int i=0;i<students.length ; i++) {                        //printing using loops
		  System.out.println(students[i]);
	  }*/
	  
	  
	  /*String [] students = {"shubha" ," yashassu" , "gowtham"};   //printing in reverse order
	  for(int i=students.length-1;i>=0 ; i--) {
		  System.out.println(students[i]);
	  }
	  
	  
	  /*System.out.println(students.length);                          //length of array
	  System.out.println(students[1]);*/
  
  
	  String [] students = {"shubha" ," yashassu" , "gowtham"};
       System.out.println("printingnusing for-each loop");            //using for each loop
       for(String element : students) {
    	   System.out.println(element);
       }
  }
}
