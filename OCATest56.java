
public class OCATest56 {
	int x=10;
	String y="k";
	OCATest56(){
		System.out.println("Hi");
	}
	OCATest56 o;
	void m(OCATest56 o) {
		System.out.println(o.x+o.y);
	}
	
	public static void main(String[] args) {
		OCATest56 o=new OCATest56();
		o.o=new OCATest56();
		o.x+=90;
		o.y+="j";
		o.m(o);
		o.m(o.o);
		o.m(o.o.o);
		o.m(o.o.o.o.o.o.o.o.o);
	}
}
