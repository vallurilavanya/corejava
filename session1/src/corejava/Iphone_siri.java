package corejava;

import java.util.Scanner;

public class Iphone_siri extends weather{
	static int temperature=30;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("how can i help u");
		String name=a.nextLine();
		
		Scanner b=new Scanner(System.in);
		System.out.println(" here is the msg love u mom");
		String name1=b.nextLine();
	Scanner c=new Scanner(System.in);
		System.out.println("yes");
		String name2=c.next();
		
		if(name.equalsIgnoreCase(" send a msg to mom " + "love u mom" ))
		{
			System.out.println("ready to send masg");
		}
		else if(name2.equalsIgnoreCase(" ready to send msg" ))
			
			{
			System.out.println("yes");
			}
		
		switch(temperature)
		{
		case 30:
		System.out.println("cool");
		break;
		case 40:
			System.out.println("cloudy");
			break;
		}
		try
		{
	int temperature=0;
	System.out.println("not normal");
		}catch(Exception e) {
			//System.out.println("not valid");
		}
					
	
				
				
					
								
					
				
					
			}
			
		
		
		
		

	}


