import java.util.Scanner;
class Election
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.print("Do you have a voter Id (Yes/NO) :");
			String voterId = sc.next().toLowerCase();

			if(voterId.equals("yes"))
			{
				System.out.println("*******WELCOME********");
				System.out.println("1.BJP");
				System.out.println("2.CONGERSS");
				System.out.println("3.AAP");
				System.out.println("4.MNS");
				System.out.println("5.SHIVSENA");
				System.out.println("6.NCP");
				System.out.println("7.NOTA");
				System.out.println("Enter the option to vote for fav party");
				String vote = sc.next().toUpperCase();
				if(vote.equals("BJP"))
				{
					System.out.println("you have voted for bjp");
				}else if(vote.equals("CONGERSS"))
				{
					System.out.println("you have voted for congress");
				}else if(vote.equals("AAP")){
					System.out.println("you have voted for aap");
				}else if(vote.equals("MNS")){
					System.out.println("you have voted for mns");
				}else if(vote.equals("SHIVSENA")){
					System.out.println("you have voted for shivsena");
				}else if(vote.equals("NCP"))
				{
					System.out.println("you have voted for ncp");
				}else if(vote.equals("NOTA"))
				System.out.println("Thank you wasting time");

			}
		}
	}
}