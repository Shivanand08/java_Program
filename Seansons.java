import java.util.Scanner;
class Seansons
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a month :");
		String month = sc.next().toUpperCase();
		switch(month)
		{
		case "OCT":
		case "NOV":
		case "DEC":
		case "JAN":System.out.println(month+" it's winter.");break;
		case "FEB":
		case "MAR":
		case "APR":
		case "MAY":System.out.println(month+" it's summer.");break;
		case "JUN":
		case "JUL":
		case "AUG":
		case "SEP":System.out.println(month+" it's Rainy.");break;
		default :System.out.println("invalid input");	

		}
	}
}