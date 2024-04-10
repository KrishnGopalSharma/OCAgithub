class WWW{
	WWW(){ 
		System.out.println("WWW");
	}
	WWW(int a){ this();
		System.out.println("WWW int");
	}
	{
		System.out.println("Hi1");
	}

	{
		System.out.println("Hi2");
	}
	static {
		System.out.println("Hello1");
	}
	static {
		System.out.println("Hello2");
	}
}
public class OCATest61 {
	public static void main(String[] args) {
		new WWW(4);
	}
}