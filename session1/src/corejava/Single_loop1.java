package corejava;

public class Single_loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[] =new int [7];
		temp[0]=(70);
		temp[1]=(75);
		temp[2]=(50);
		temp[3]=(55);
		temp[4]=(80);
		temp[5]=(45);
		temp[6]=(90);
		String []day = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		int a=0;
		for(int i=0;i<temp.length;i++)
		{
			if(a<temp.length)
			{
		
		
		
		System.out.println( day[a] + " temperature is " + temp[i]);
		a++;
			}
		}
	
		
		

	}

}
