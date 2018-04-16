package cg.com;

	import java.util.Scanner;

import employeeDetails.Employee;

import java.util.ArrayList;
	import java.util.List;

	public class EntryEmp
	{
		  public static int pempid;
		  public static int tempid;
	      public static void main(String args[])
	      {
			  /*List<Emp> employeeList= new ArrayList<Emp>();*/
			  Scanner SC=new Scanner(System.in);
			  
			  /*List<Date> dateList= new ArrayList<Date>;
			  Scanner SC1=new Scanner(System.in);*/
			  
	          String name=null;
	          
			  String grade=null;
			  int joiningday;
			  int joiningmonth;
			  int joiningyear;
			  int salary;
			  String choice=null;
			  
			  System.out.print("Enter Your Choice: ");
			  choice=SC.next();
			  
			  
			  while(choice.charAt(0) == 'Y')  
			 {
				  if (employeeType == 'P')
				  {
					  int count = 0;
						Employee employees[]=new Employee[5];
	          
				      int count=++pempid;
					  System.out.print("Enter Name: ");
					  name=SC.next();
					  System.out.print("Enter Grade: ");
					  grade=SC.next();
					  System.out.print("Enter Joining Day: ");
					  joiningday=SC.nextInt();
					  System.out.print("Enter Joining Month: ");
					  joiningmonth=SC.nextInt();
					  System.out.print("Enter Joining Year: ");
					  joiningyear=SC.nextInt();
					  System.out.print("Enter salary: ");
					  salary=SC.nextInt();
				  
		         
				      System.out.print("Enter Your Choice ");
				      choice=SC.next();
				      
				      
				      Date doj=new Date(joiningday,joiningmonth,joiningyear);
				      Employee emp = new Employee();
				      emp.setName(name);
				      emp.setSalary(salary);
				      emp.setDesignation(grade);
				  }
				  
				  else
				  {
					  int count=++tempid;
					  System.out.print("Enter Name: ");
					  name=SC.next();
					  System.out.print("Enter Grade: ");
					  grade=SC.next();
					  System.out.print("Enter Joining Day: ");
					  joiningday=SC.nextInt();
					  System.out.print("Enter Joining Month: ");
					  joiningmonth=SC.nextInt();
					  System.out.print("Enter Joining Year: ");
					  joiningyear=SC.nextInt();
					  System.out.print("Enter salary: ");
					  salary=SC.nextInt();
				  
		         
				      System.out.print("Enter Your Choice ");
				      choice=SC.next();
				      
				      Date doj=new Date(joiningday,joiningmonth,joiningyear);
				      
				  }
			      
			      /*dateList.add(new Date(joiningday,joiningmonth,joiningyear));
				  
				  employeeList.add(new Emp(count,name,grade,joiningday,joiningmonth, joiningyear, salary));*/
				  
				  /*for (Emp s : employeeList) 
					 {
						System.out.println("Employee Number:" + s.count + "\tName: " + s.name + "\tEmployee Grade:" + s.grade + "\tJoining Date: " + s.joining + "\tSalary: " + s.salary );
					 }*/
				  
			      e.display();
			      
				 if(choice.charAt(0) == 'N')
				 {
					 break;
				 }
				 else
					 continue;
			 }
		  }
	}

}
