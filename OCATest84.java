
public class OCATest84 {
	public static void main(String[]args) {
	//public static void main(String...args) {//allowed
		m(5,6,3,6);
		m();
		m(new int[] {5,6,3,6});
		m(4);
		//m(4,6.0);//error
		
		mmmm(5);
		mmmm(5,5,67,8);
		//mmmm();//error 
	}
	static void m(int ... a) {
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	//static void mmmm(int ... a,double ... b) {//error
	//static void mmmm(int ... a,double b) {//error
	static void mmmm(double b,int ... a) {
		System.out.print(b+" ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}