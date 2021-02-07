import java.util.Scanner;
class Fibonacci
{
	int fib(int n)
	{
		if(n==1)
		{
			return 0;
		}
		if(n==2)
		{
			return 1;
		}
		return (fib(n-1)+fib(n-2));
	}
	void displayResult()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Range (n) = ");
		int n = sc.nextInt();
		for(int i = 1;i<n;i++)
		{
			System.out.print(fib(i)+", ");
		}
		System.out.println(fib(n)+".");
	}
	public static void main(String[] args)
	{
		Fibonacci obj = new Fibonacci();
		obj.displayResult();
	}
}