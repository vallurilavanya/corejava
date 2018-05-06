package corejava;

import java.util.Scanner;

public class Product_information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
	System.out.println("what is the product u r looking for");
	String name=reader.next();
	Scanner reader1=new Scanner(System.in);
	System.out.println("enter the item u r looking");
	int type=reader1.nextInt();
	if(name.equalsIgnoreCase("dress"))
			
			{
		switch(type)
		{
		case 1:
		System.out.println("u r looking for kids dress");
		double price=20;
		double pricetax=price+(price*0.825);
		System.out.println("kids dress price with the tax"+pricetax);
		break;
		case 2:
			System.out.println("u r looking for mens dress");
			double price1=25.99;
			double price1tax=price1+(price1*0.825);
			System.out.println("mens dress with the tax"+price1tax);
			break;
			default:
				System.out.println("u r looking item is not there");
				break;
		}
			
			}
	
	

	}

}
