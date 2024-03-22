import java.util.Scanner;
class DrivingLicences
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		if(age>18)
		{
			System.out.print("should you have passed the RTO exams(yes/no) :");
			String res = sc.next().toUpperCase();

			if(res.equals("YES"))
			{n
				System.out.print("Tell me your marks :");
				int marks = sc.nextInt();

				if(marks>60)
				{

					System.out.println("your are eligible to driving licences");n

				}
				else 
					System.out.println("your are not eligible to driving licences");
				

			}
			else
				System.out.println("you are not eligible to driving licences because you do not passed the RTO Exams also you do not be re exams");
			

		}
		else
		System.out.println("your are not eligible to driving licences try after"+(18-age)+"years");
	}
	}
