package corejava;

import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("what is u r name");
		String name=reader.next();
		System.out.println("u r name is"+ name);
		Scanner reader1=new Scanner(System.in);
		System.out.println("how old  r u");
		int age=reader1.nextInt();
		System.out.println(" u r age is"+ age);
		

	}

}
