import java.util.Scanner;
class CheckEven_Odd_Number
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();

		if(num%2==0){
			System.out.println(num+":It Is Even Number");
		}else {
			System.out.println(num+":It Is Odd Number");
		}
	}
}