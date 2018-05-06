package corejava;

public class For_bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bmi[] =new int[3];
		bmi[0]=(10);
		bmi[1]=(20);
		bmi[2]=(40);
		String []value= {"underweight","normal","abnormal"};
		int a=0;
		for(int i=0;i<bmi.length;i++)
		{
			if(a<bmi.length)
			{
				System.out.println( " bmi is " + bmi[i] + value [a] );
				
				a++;
			}
		}

	}

}
