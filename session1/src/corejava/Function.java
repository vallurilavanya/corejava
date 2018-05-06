package corejava;

public class Function extends Nonstatic {
	
	
static int l=4;//global variable
int d=5;  //nonstatic variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
country();
city();
age();
add(6,7);
sub(87,45);
deci(6.3,7.5);
	}
	public static void country() {
		
		System.out.println("i am from india");
		System.out.println(l);
		Function b=new Function();
		System.out.println(b.d);
	}
	public static void city()
	{
		System.out.println("i am from vij");
		Function g=new Function();
		System.out.println(g.d);
	}
	public static void age()
	{
		int a=6;
		System.out.println(a);
	
	}
public static void add(int x,int y) 
{
	
		int sum=x+y+l;
		System.out.println(sum);
	}
	public static void sub(int a,int b)
	{
		int subtraction=a-b;
		System.out.println(subtraction);
	}
	public static void deci(double c,double d)
	{
		double mul=c*d;
		System.out.println(mul);
	}
	
	

}
