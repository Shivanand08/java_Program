import java.util.Scanner;
class CheckJoinArmy
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		if(age>18){
			System.out.print("Enter your height :");
			double height = sc.nextDouble();
			if(height>=162){
				System.out.print("Enter your weight :");
				double weight = sc.nextDouble();
				if(weight>56){
					System.out.println("your are eligible to join army");

				}else{
					System.out.println("your weight is less than 56 kg");
				}

			}else{
				System.out.println("your height is less than 162 cm ");
			}

		}else{
			System.out.println("your are unable to join army");
		}
	}
}