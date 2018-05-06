package corejava;

import java.util.Scanner;

public class String_names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String names[]=new String[10];
names[0]="sridhar";
names[1]="lavanya";
names[2]="utkarsh";
names[3]="rushil";
names[4]="sweety";
names[5]="pandu";
names[6]="vinay";
names[7]="ammulu";
names[8]="priya";
names[9]="seshu";
System.out.println("give me a string");
Scanner input = new Scanner(System.in);
String name=input.nextLine();
int count=0;
for(int i=0;i<names.length;i++)
{
	if(name.equalsIgnoreCase(names[i]))
	{
		count++;
	}
}
if (count==0)
{
	System.out.println("string is not in array");
}
else
{
	System.out.println("string is  in array");
}
	





	}

}
