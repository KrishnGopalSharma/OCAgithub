
public class OCATest {
	public static void main(String[] args) {
		double a,b,c,d,e;
		a = 3.0/0; //Infinity
		//a = 3/0; //Arithmetic Exception
		b = 0/4.0; //0.0
		c=0/0.0; //NaN
		d=0.0/0; //NaN
		e=0.0/0.0; //NaN
		//e=0/0; //Arithmetic Exception
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		int x,y,z;
		x = 3/0; //Arithmetic Exception
		y = 0/4; //0
		z=0/0; //Arithmetic Exception
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
