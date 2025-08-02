package comp.example;

public class nestedscope {

	public static void main(String[] args) {
		
		int bar = 1; 
		  { 
		  
		    int car = 2; // Compile-time error – Duplicate local variable bar already defined!
		   
		  }
		  System.out.println(bar);
		  
		 
	}

}
