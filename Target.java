import java.util.Scanner;
class Target
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your monthly target : ");
		int target = sc.nextInt();
		System.out.print("Enter your monthly salary :");
		int sal = sc.nextInt();  
		//int target = score*1; 
		if(target>=90)
		System.out.println("increment by 3%"+sal/100*3); 
	else {
		System.out.println("increment by 1%"+sal/100*1);
	}
	}
}