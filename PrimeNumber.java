import java.util.Scanner;
class PrimeNumber
{
	int n;
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any Number: ");
		n = sc.nextInt();
	}
	boolean isPrime()
	{
		int check = 0;
		for(int i = 2;i<Math.sqrt(n);i++)
		{
			if((n%i)==0)
			{
				check++;
			}
		}
		if(check==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void displayData()
	{
		if(n==1)
		{
			System.out.println("1 is neither Prime nor Composite.");
		}
		else if(isPrime())
		{
			System.out.println(n+" is a Prime Number.");
		}
		else
		{
			System.out.println(n+" is not a Prime number.");
		}
	}
	public static void main(String[] args)
	{
		PrimeNumber obj = new PrimeNumber();
		obj.getData();
		obj.displayData();
	}
}