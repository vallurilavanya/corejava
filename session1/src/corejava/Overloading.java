package corejava;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
numbers(6);
numbers(3.7);
add(5,8.4);
add(6,4,3);
	}
public static void numbers(int a) {
	System.out.println(a);
} 
public static void numbers(double a) {
	System.out. println(a);
	
}
public static void add(int a,double b)

{
	double add= a+b;
	System.out.println(add);
	
	}
public static void add(int a,int b,int c)
{
	int mul=a*b*c;
	System.out.println(mul);
	}
}
