import java.util.Scanner;
public class Percentage 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the 5 subject's marks");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of English:");
		int a=sc.nextInt();
		
		System.out.println("Enter the marks of Maths:");
		int b=sc.nextInt();
		
		System.out.println("Enter the marks of German:");
		int c=sc.nextInt();
		
		System.out.println("Enter the marks of Marathi:");
		int d=sc.nextInt();
		
		System.out.println("Enter the marks of History:");
		int e=sc.nextInt();
		
		int total=a+b+c+d+e;
		System.out.println("The total mrks is:"+total);
		
		float avg=(total*100)/500;
		System.out.println("The avg is:"+avg);
		
		
	}

}
