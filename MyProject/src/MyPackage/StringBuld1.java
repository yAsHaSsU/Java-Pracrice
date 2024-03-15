package MyPackage;

public class StringBuld1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
         System.out.println(sb.charAt(0));   //1
         
        //set char at index
        sb.setCharAt(0, 'p');
        System.out.println(sb);   //2 
        
       //insert char
        sb.insert(0,'s');
        System.out.println(sb);  //3
        
        //delete
        sb.delete(0,1);
        System.out.println(sb);
        
         
	}

}
