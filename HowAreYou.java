import java.util.Scanner;
class HowAreYou
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Type:\n1. 'A' or 'a' for English.\n2. 'B' or 'b' for Hindi.\n3. 'C' or 'c' for Spanish.\nEnter Your Choice: ");
		char choice = (sc.next()).charAt(0);
		switch(choice)
		{
			case 'A':
			case 'a':
				System.out.println("Hello! How are you?");
				break;
			case 'B':
			case 'b':
				System.out.println("Namaste! Toh kaise ho aap?");
				break;
			case 'C':
			case 'c':
				System.out.println("Hola! Como estas?");
				break;
			default:
				System.out.println("Sorry Wrong Choice.");
		}
	}
}