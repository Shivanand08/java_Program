import java.util.Scanner;
class CheckChar
{
	public static void main(String[] args)
	 { 
	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter the Character");
		char ch = sc.next().charAt(0);
		System.out.println(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?((ch>='A'&&ch<='Z')? "uppercase alphabet" : "lowercase alphabet" ): " not Alphabet");
	}
}