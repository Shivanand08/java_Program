import java.util.Scanner;
class PowerProgram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();
		int length=0;
		int dup =num;
		long power =1;
		while(num>0)
		{
			length++;
			num/=10;
		}
		for(int i=1;i<=length;i++)
			power*=dup;
		System.out.println(power);
	}
}