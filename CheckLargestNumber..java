import java.util.Scanner;
class CheckLargestNumber
{
	public static void main(String[] args)
	 {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter the Num1 :");
	 	int num1 = sc.nextInt();
	 	System.out.print("Enter the Num2 :");
	 	int num2 = sc.nextInt();
	 	System.out.print("Enter the Num3 :");
	 	int num3 = sc.nextInt();
	 	int main =((num1>num2)? num1:num2);
	 	int lar = ((((num1>num2)?num1:num2)>num3)? main:num3);
	 	//System.out.println(lar+"this number is largest amoung 3 numbers");
	 	//System.out.println(main); second largest
		
	}
}