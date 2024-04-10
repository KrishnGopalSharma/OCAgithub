public class OCATest11 {
	public static void main(String[] args) {
		System.out.println("Hello");
		int a=10,b=5;
		if(++a<b--)
		System.out.println("incapp"+a++);
		if(a--!=--b)
		System.out.println("ok"+a++);
		else System.out.println("hi"+ ++a);
		System.out.println("bye"+a--);
	}
}
