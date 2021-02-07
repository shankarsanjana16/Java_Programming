import java.util.Scanner;
class Employee
{
	String name, address;
	long year;
	float salary;
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\tName: ");
		name = sc.nextLine();
		System.out.print("\tAddress: ");
		address = sc.nextLine();
		System.out.print("\tYear of joining: ");
		year = sc.nextLong();
		System.out.print("\tSalary: ");
		salary = sc.nextFloat();
	}
	void displayData()
	{
		System.out.println(name+"\t"+year+"\t"+salary+"\t"+address);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of Employees: ");
		int n = sc.nextInt();
		Employee[] emp = new Employee[n];
		for(int i = 0;i<n;i++)
		{
			emp[i] = new Employee();
			System.out.println("Details Of Employee "+(i+1));
			emp[i].getData();
		}
		System.out.println("Name\tYear of joining\tSalary\tAddress");
		for(int i = 0;i<n;i++)
		{
			emp[i].displayData();
		}
	}
}