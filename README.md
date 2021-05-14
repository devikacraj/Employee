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
This method the logic is convert the current salary to 1000 hike and the sal is displayed along with the message that the Salary is raised by 1000.

  void raisesalary()
	{
		this.salary=salary+1000;
		System.out.println("salary raised by 1000.0");
	}
      
      
      




