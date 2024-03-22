import java.util.Scanner;
class EligibleCheck_Interview
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your precetage :");
		double per = sc.nextInt();
		
		if(per>=60)
			System.out.println(per+": It Is Eligible To Interview");
		else{
			System.out.println(per+": It Is Not Eligible To Interview");
		}
	}
}