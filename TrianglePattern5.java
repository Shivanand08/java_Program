import java.util.Scanner;
class TrianglePattern5
{
	public static void main(String[] args) 
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num =sc.nextInt();
		for (int i=1;i<=num ;i++ ) 
			   //num=12  
			   //i<=12  12<=12(true) 13<=12(false)
		{
			int k=i;
			for (int j=1;j<=i ;j++ ) 
			{
				System.out.print(k--+" ");
				
			
				
			}System.out.println();
				k+=i;//num=num+i
			
		}
	}
}