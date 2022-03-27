import java.util.Scanner;
class Strong 
{    
	static boolean isStrong(int n)
	{
		int temp=n; int sum=0;
		while (n>0)
		{

			int ld=n%10;
			sum=sum+factorial(ld);

			n=n/10;

		}

		return sum==temp;

	}

      static int factorial(int num)
	 {
		  int fact=1;
		  for (int i=num;i>1 ;i-- )
		  {
			  fact=fact*i;
		  }
	    return fact;	
	 }


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
    System.out.println("Engter the number");
		int num=sc.nextInt();

		boolean rs=isStrong(num);
		if (rs==true)
		{
			System.out.println(num +" is strong number");
		}

		else 
			System.out.println(num+" is not strong number");
	}
}
