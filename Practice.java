import java.util.Scanner;
public class Practice
{
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		System.out.print("Enter Initial number : ");
		int b=a.nextInt();
		System.out.print("Enter Ending Number : ");
		int c=a.nextInt();
		
		for(;b<=c;b++){
				if(b%2==0){
					System.out.print(b);
					System.out.println(" Is Even");
		}
		else{
			System.out.print(b);
			System.out.println(" Is Odd");
		}
		}

	}
}
// For armstrog
// n==b
//System.out.print("Enter Number Of Digits : ");
		//int c=a.nextInt();
//r=b/10; sum=summ+(r*r*r);b=b/10;
// if(sum==n)System.out.print("Number is Armstrong") else System.out.print("Number is not armstrong")
/*int i=1,flag=0;
		Scanner a=new Scanner(System.in);
		System.out.print("Enter Number : ");
		
		int b=a.nextInt();
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
		}*/