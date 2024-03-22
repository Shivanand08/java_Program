import java.util.Scanner;
class CheckVowel
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Character :");
		char ch = sc.next().charAt(0);
		//if(ch=='a'|| ch=='i' || ch=='o' || ch=='e' || ch=='u'){
		if((ch=='a' && ch=='A')|| (ch=='i' && ch=='I') || (ch=='e' && ch=='E') ||(ch=='o' && ch=='O') ||(ch=='u' && ch=='U'))
		 {
			System.out.println(ch+ " :it is vowel;");
		
		}

		// 	else if(ch=='A'|| ch=='I' || ch=='O' || ch=='E' || ch=='U'){
		// 		System.out.println(ch+ ": it is vowel");
			


		// }

		else{
		System.out.println(ch+" :it is consentent");
	}

	}
}