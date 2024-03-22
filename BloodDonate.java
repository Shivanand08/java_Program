import java.util.Scanner;
class BloodDonate
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();

		if(age>=20)
		{
			System.out.print("Do you have comsumed alcohol or cigarate in bofore 24 hours (YES/NO) : ");
			String nasha = sc.next().toLowerCase();
			if(nasha.equals("no")){
				System.out.print("Enter your weight :");
				double weight = sc.nextDouble();
				if(weight>=50){
					System.out.println("you are eligible to blood donote");


				}else {
					System.out.println("you weight is confort to blood donate try to next time");
				}

			}else{
				System.out.print("You do not eligible to blood donate because you comsumed alcohol (your are bad person)");
			}

		}else{
			System.out.println("your are not eligible to donate blood try after"+(20-age)+"years");
		}
	}
}