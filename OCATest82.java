
public class OCATest82 {
	public static void main(String[] args) {
		//int a[]=new int[0];//allowed
		//int a[]=new int[-2];//NegativeArraySizeException
		//int a[]=new byte[2];//error
		//Object a=new byte[2];//allowed
		//int a[]=new int[2];//Size must be int {int, byte, short, char} 
		//int a[]=new int[2L];//error
		//int a[]=new int[2.0];//error		
		//int a[]=new int[(byte)2];	//allowed	
		int a[]=new int[9/2];//allowed
		System.out.println(a[2]);//Index must be int {int, byte, short, char}
		//System.out.println(a[2L]);//error		
		//System.out.println(a[2.0]);//error		
	}
}