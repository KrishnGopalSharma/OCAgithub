public class OCATest16 {
	public static void main(String[] args) {
		System.out.println("Hello");
		String a="hi";
		switch(a) {
		//case 1://error
		case "hello":
		System.out.println("hi");
		break;
		case "hi":
		System.out.println("ok");
		break;
		default: 
		System.out.println("rr");
		}
		System.out.println("bye");
	}
}
