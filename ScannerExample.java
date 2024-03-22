import java.util.Scanner;
class ScannerExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.Out.print("Enter your name :");
		String name = sc.next();
		char ch = name.charAt(0);
		System.Out.println("Hey my name is "+name+"and my Character is "+);
		 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		 {
		 	System.Out.println("Character" + ch +"is a vowel");

		 }
		 else{
		 	System.Out.println("Character" +ch+ "is a consontant")
		 }

	}
}