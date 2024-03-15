package MyPrac;
 
public class Arra1 {
        public static void main(String[] args) {
	/*	float[] marks	= {98.5f, 25.6f,78.6f ,89.5f, 45.2f};
		float sum =0;                                                  print  the sum of 5 floating num
		for(float element: marks) {
			sum = sum+element;
		System.out.println(sum);
		}*/
        	
        	
       
        	int [] marks = {98,58,97,84,76};
        	int sum = 0;
        	boolean isInArray=false;
        	for(int element:marks) {
        		if(sum==element) {
        			isInArray = true;
        			break;
        		}
        	}
        	if(isInArray) {
        		System.out.println("the num there in array");
        	}
        	else {
        		System.out.println("the num is not there in an array");
        	}
}
}


