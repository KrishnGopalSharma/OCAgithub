
public class OCATest54 {
	int x=10;
	String y="k";
	OCATest54(){
		System.out.println("Hi");
	}
	void m(OCATest54 o) {
		o.x+=5;
		o.y+="j";
	}
	public static void main(String[] args) {
		OCATest54 o=new OCATest54();
		System.out.println(o.x+o.y);
		o.m(o);
		System.out.println(o.x+o.y);
	}
}
