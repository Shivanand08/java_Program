import java.util.Scanner;
class IfElse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		System.out.print("Enter your property :");
		double prop = sc.nextDouble();
		//sc.nextLine();//1
		//Scanner sc1 = new Scanner(System.in);
			sc.reset(); 
		System.out.print("Enter your surname :");

		String surname = sc.next().toUpperCase();
	
		



		if ((age>=21 && prop>=10000000)||(surname.equals("ambani"))) 
		{
			 
			 System.out.println("your are eligible");
			}
			 else{
			 	System.out.println("you are not eligable" );
			 }

			
	}
}