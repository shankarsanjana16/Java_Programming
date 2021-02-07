import java.util.Scanner;
class Time
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the number of minutes = ");
		int minutes = sc.nextInt();
		if(minutes<60)
		{
			System.out.println("Please enter a value greater than 59 minutes.");
		}
		else if((minutes>=60)&&(minutes<(60*24)))
		{
			System.out.println(minutes+" minutes is approximately "+(minutes/60)+" hours and "+(minutes%60)+" minutes.");
		}
		else if((minutes>=(60*24))&&(minutes<(365*60*24)))
		{
			System.out.println(minutes+" minutes is approximately "+(minutes/(60*24))+" days "+((minutes%(60*24))/60)+" hours and "+((minutes%(60*24))%60)+" minutes.");
		}
		else
		{
			System.out.println(minutes+" minutes is approximately "+(minutes/(365*60*24))+" years "+((minutes%(365*60*24))/365)+" days "+(((minutes%(365*60*24))%365)/60)+" hours and "+(((minutes%(365*60*24))%365)%60)+" minutes.");
		}
	}
}