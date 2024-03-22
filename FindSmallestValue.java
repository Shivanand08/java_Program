import java.util.Scanner;
class FindSmallestValue
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num 1 :");
		int num1 = sc.nextInt();
		System.out.print("Enter the num 2 :");
		int num2 = sc.nextInt();
		int main = ((num1 > num2)? num2:num1);
		System.out.println(num1 + ","+ num2 + "samllest among the 2 number");
	}
}