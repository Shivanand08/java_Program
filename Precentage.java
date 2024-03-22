import java.util.Scanner;
class Precentage
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Precentage :");
		double pre = sc.nextDouble();

		if (pre<35)
			{
			System.out.println("you have failed in exams");
		} 
		else if(pre<60)
		{
			System.out.println("you have cleared your exams in how");
			System.out.println("Your Grade is B second class");
			}
			else if(pre<75){
				System.out.println("you have cleared exams ");
				System.out.println("Your Grade is A First class");
			}
			else if(pre<90){
				System.out.println("you have cleared exams");
				System.out.println("Your Grade is A+ Distinaction");

			}
			else if (pre<=100){
				System.out.println("you have cleared exams");
				System.out.println("Your Grade is O First Class With Distinaction ");
			}else{
				System.out.println("invalid data");
			}
		}
	}

	
