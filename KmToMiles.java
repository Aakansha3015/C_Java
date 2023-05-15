import java.util.Scanner;
public class KmToMiles
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the km:");
		float km=sc.nextFloat();
		
		double m=0.6213711922*km;
		
		System.out.println("The distance in miles is:"+m);
		
	}

}
