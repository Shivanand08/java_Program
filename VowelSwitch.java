import java.util.Scanner;
class VowelSwitch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character :");
		char ch = sc.next().toLowerCase().charAt(0);

		switch(ch)
		{
		case 'a':
		case 'i':
		case 'o':
		case 'e':
		case 'u': System.out.println(ch+": is a vowel");break;
		default : System.out.println(ch+ ": is a consonent");break;



        
        
        
		

		}
	}
}