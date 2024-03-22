import java.util.Scanner;
class CheckPositiveAndNegativeNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();
		if(num>0){

			System.out.println(num+":is positive Number");
		}else if(num==0){
			System.out.println(num+"is a Nutural Number");
		}
	else {
		System.out.println(num+":is negative Number");
	}
}
}