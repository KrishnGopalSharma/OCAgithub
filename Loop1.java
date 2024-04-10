
public class Loop1 {

	public static void main(String[] args) {
//		 while(true) {  //infinite loop
//		 	System.out.println("hello");
//		 }
		
		if(false) {
			System.out.println("hello");
		}
		
//		while(false) { //error
//			System.out.println("hello");
//		}
//
//		while(2>3) {  //error
//			System.out.println("hello");
//		}
//
//		for(;false;) {  //error
//			System.out.println("Hello");
//		}
		
		do {  
			System.out.println("hello");
		}while(false);
		
		do {  
			System.out.println("hello");
		}while(2>3);
		
//		do {   //infinite loop
//			System.out.println("hello");
//		}while(true);
	}

}
