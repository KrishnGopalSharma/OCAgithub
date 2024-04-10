public class OCATest14 {
	public static void main(String[] args) {
		System.out.println("Hello");
		int a=2;
		final byte b=10;
		switch(a) {
		case 1:
		System.out.println("hi");
		break;
		case b://error if b variable is not final.
		System.out.println("ok");
		break;
		default: 
		System.out.println("rr");
		}
		System.out.println("bye");
	}
}
