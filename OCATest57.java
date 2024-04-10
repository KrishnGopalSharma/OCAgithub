
public class OCATest57 {
	DD d;
	DD m(DD o) {
		d=o;
		o.d+=8;
		System.out.println(o.d);
		return new DD();
	}
	public static void main(String[] args) {
		OCATest57 o=new OCATest57();
		o.d=new DD();
		o.d=o.m(o.d);
		System.out.println(o.d);
		System.out.println(o.d.d);
	}
}
class DD{
	int d=9;
}
