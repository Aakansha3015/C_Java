import java.util.Scanner;
public class TakingInputFromUser
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a:");
		int a=sc.nextInt();
		
		System.out.println("Enter the value for b:");
		int b=sc.nextInt();
		
		int sum=a+b;
		
		System.out.println("Ans is:"+sum);
	}

}
