import java.util.Scanner;

public class RomanToInteger {
	public int Roman(String str)
	{
		int d=0,temp=0,sum=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			switch(str.charAt(i))
			{
				case 'I' :
					d=1;
					break;
				
				case 'V' :
					d=5;
					break;
					
				case 'X' :
					d=10;
					break;
			
				case 'L' :
					d=50;
					break;
				
				case 'C' :
					d=100;
					break;
					
				case 'D' :
					d=500;
					break;
					
				case 'M' :
					d=1000;
					break;
					
				default :
					d=0;
					break;
			}
			if(d<temp)
			{
				sum=sum-d;
				temp=d;
			}
			else
			{
				sum=sum+d;
				temp=d;
			}
		}
		return sum;
		
	}
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Roman Numbers :");
			String str=sc.nextLine();
			RomanToInteger m=new RomanToInteger();
			int Result=m.Roman(str);
			System.out.println(Result);
			sc.close();
	}

}


