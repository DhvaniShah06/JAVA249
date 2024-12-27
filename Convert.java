import java.util.Scanner;
public class Convert
{
	public static void main(String[] args)
	{
		Scanner M=new Scanner(System.in);
		System.out.print("Enter Meter : ");
		double a=M.nextDouble();
		System.out.print("Enter Foot : ");
		double b=M.nextDouble();
		System.out.print("Conversion From Meter to Foot : ");
		System.out.println(a*3.28);
		System.out.print("Conversion From Foot to Meter : ");
		System.out.print(b/3.28);
	}
}