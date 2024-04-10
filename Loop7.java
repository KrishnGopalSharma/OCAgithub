
public class Loop7 {

	public static void main(String[] args) {
		for(int x=1;x<=5;x++) {
			System.out.println("OK");
//			for(int y=x;y<=++x;y++,x++)
//			for(int y=x;++y<=++x;y++)
//			for(int y=x;++y<=++x;)
//			for(int y=x;++y<=x++;)
			for(int y=1;++y<=x++;)
			System.out.println("Hello");
		}
		System.out.println("Hi");
	}

}
