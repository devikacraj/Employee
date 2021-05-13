import java.util.Scanner;

public class Prog1
{
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		while (true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1.create \n 2.display\n 3.raise salary\n 4.exit");
			int i=sc.nextInt();
			if(i==4)break;
			switch(i)
			{
			case 1:e.create();
			break;
			case 2:e.display();
			break;
			case 3:e.raisesalary();
			break;
			}
		}
	}
}
class Employee
{
	String name;
	int age;
	double salary;
	String job;
	Scanner sc=new Scanner(System.in);
	void create()
	{
		System.out.println("enter name:");
		this.name=sc.next();
		System.out.println("enter age:");
		this.age=sc.nextInt();
		System.out.println("enter salary:");
		this.salary=sc.nextDouble();
		System.out.println("enter designation:");
		this.job=sc.next();
		
	}
	void display()
	{
		System.out.println("Nmae"+this.name+"\n age "+this.age+"\n salary "+this.salary+"\n designation"+this.job);
	}
	void raisesalary()
	{
		this.salary=salary+1000;
		System.out.println("salary raised by 1000.0");
	}
}

