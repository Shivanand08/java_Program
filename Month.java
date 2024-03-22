     import java.util.Scanner;
class Month
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a month Number");
		byte monthnum = sc.nextByte();
		String month = null ;


		switch(monthnum)
		{  
		case 1:month = "JAN";
		case 2:month = "FRB";
		case 3:month = "MAR";
		case 4:month = "APR";
		case 5:month = "MAY";
		case 6:month = "JUN";
		case 7:month = "JULY";
		case 8:month = "AUGUST";
		case 9:month = "SEP";
		case 10:month = "OCT";
		case 11:month = "NOV";
		case 12:month = "DEC";
		default : System.out.println("invalid input");


		}
		System.out.println((month != null)?(monthnum+"-"+month):"");
	}
}