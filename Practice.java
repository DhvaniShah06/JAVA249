import java.util.Scanner;
public class Practice
{
	public static void main(String[] args)
	{
		int i=1,flag=0;
		Scanner a=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int b=a.nextInt();
		//System.out.print("Enter Number Of Digits : ");
		//int c=a.nextInt();
		for(i=1;i<=b;i++){
			if(b%i==0){
				flag=flag+1;
			}
		}
		if(flag==2){
			System.out.print("Number is Prime");
		}
		else{
			System.out.print("Number Is Not Prime");
		}

	}
}