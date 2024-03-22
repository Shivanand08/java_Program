import java.util.Scanner;
class AmstronNumber
{
	public static void main(String[] args)
	 {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the Number :");
	  int num = sc.nextInt();
	  
	  int dup=num;
	  int dup1=num;
	  int length=0;
	  int sum=0;
	  while(num!=0)
	  {
	  	length++;
	  	num/=10;
	  }	

	  while(dup!=0)
	  {
	  	int rem=dup%10;
	  	int power=1;

	  
	  for(int i=1;i<=length;i++)
	  {
	  	power*=rem ;

	  }
	  sum+=power;
	  dup/=10;
	}

       
       if(sum==dup1)
       
       	System.out.println(dup1+" :It is amrstrong Number");
       
	else{
		System.out.println(dup1+" :It is Not amrstrong Number");
	}

}
}
