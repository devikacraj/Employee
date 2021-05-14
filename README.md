# assignment
# Java employee Creation
It is a program to create an details of an employee with business logic.

Two different classes are used one for business logic(Employee class) and another is Main class.

Inorder to take the input from the user we use Scanner class.

      import java.util.Scanner;

EMPLOYEE CLASS

In employee class the main data members used are:

       String name;
       String designation; 
       double salary; 
       Int age;

Three methods are used in the employee class create(),display() and raiseSalary().
CREATE()
This method  is used to create the details of the Employee.

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
	
      
DISPLAY()
This method shows the details of the Employee.

    void display()
	{
		System.out.println("Nmae"+this.name+"\n age "+this.age+"\n salary "+this.salary+"\n designation"+this.job);
	}
      
The use of this keyword is to initialize the global variable to local variable.

RAISESALARY()
This method is the logic to convert the current salary to 1000 hike and the sal is displayed along with the message that the Salary is raised by 1000.

    void raisesalary()
	{
		this.salary=salary+1000;
		System.out.println("salary raised by 1000.0");
	}
	
MAIN CLASS

In this class we have to create an object of the Employee class using emp as reference variable.

         Employee emp=new Employee();
	 
In the main method we make use of nextInt() of Scanner class to take users input,
1.Create,
2.Display ,
3.Raisesalary,
4.Exit ,
Enter choice are to be displayed as menu to the user so that the user can make a choice.


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
			case 4:System.out.println("exit");
			default:("invalid choice");
			
			}
		}
      
The choices will be repetating we choose 4 or default numbers for that cases we used an while loop for,
 iterative statement for user felxibility and the choices are kept in switch case.

      
      




