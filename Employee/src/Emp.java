import java.util.Scanner;

public class Emp
{
  String name=null;
  int count;
  String grade=null;
  Date joining=null;
  int salary;
  String choice=null;
  
  //empid=1000;
  
  public Emp(int count,String name,String grade,Date doj, int salary)
  {
	  this.name=name;
	  this.grade=grade;
	  this.joining=doj;
	  this.salary=salary;
	  this.count= count;
  }
  
  public void display()
  {
	  System.out.println("Employee Number:" + count + "\tName: " + name + "\tEmployee Grade:" + grade + "\tJoining Date: " + joining + "\tSalary: " + salary );
  }
  
  //public void display()
  //{
//	  System.out.println("Employee Number:" + empid + "\tName: " + name + "\tEmployee Grade:" + grade + "\tJoining Date: " + joining + "Salary: " + salary );
//  }
  
  //empid++;
	  
  
  
}
