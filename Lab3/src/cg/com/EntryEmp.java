package cg.com;

import java.util.Scanner;


	public class EntryEmp
	{
		  public static int pempid;
		  public static int tempid;
		  public static String employeeType;
		  public static Contractor con;
		  public static PermanentEmployee perm;
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
			  int hours;
			  String choice=null;
			  
			  System.out.print("Enter Your Choice: ");
			  choice=SC.next();
			  
			  
			  while(choice.charAt(0) == 'Y')  
			 {
				  System.out.print("Enter Your Choice for Permanent(P) or Other: ");
				  employeeType=SC.next();
				  
				  if (employeeType.charAt(0) == 'P')
				  {
					  int count = 0;
	          
				      int count1=++pempid;
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
				      
				      
				      Date doj=new Date(joiningday,joiningmonth,joiningyear);
				      PermanentEmployee emp = new PermanentEmployee();
				      emp.setName(name);
				      emp.setSalary(salary);
				      emp.setDesignation(grade);
				      emp.setJoiningDate(doj);
				      emp.display();
				      
				      
				      
				      
				  }
				  
				  else
				  {
					  //ContractEmployee employees[]=new ContractEmployee[5];
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
					  System.out.print("Enter Hours: ");
					  hours=SC.nextInt();
					  /*System.out.print("Enter Rate: ");
					  rate=SC.nextInt();*/
					  
				  
		         
				      /*System.out.print("Enter Your Choice: ");
				      choice=SC.next();*/
				      
				      Date doj=new Date(joiningday,joiningmonth,joiningyear);
				      ContractEmployee conemp = new ContractEmployee();
				      conemp.setName(name);
				      conemp.setDesignation(grade);
				      conemp.setJoiningDate(doj);
				      conemp.setNoOfHours(hours); ;
				      
				      
				      
				  }
			      
			      /*dateList.add(new Date(joiningday,joiningmonth,joiningyear));
				  
				  employeeList.add(new Emp(count,name,grade,joiningday,joiningmonth, joiningyear, salary));*/
				  
				  /*for (Emp s : employeeList) 
					 {
						System.out.println("Employee Number:" + s.count + "\tName: " + s.name + "\tEmployee Grade:" + s.grade + "\tJoining Date: " + s.joining + "\tSalary: " + s.salary );
					 }*/
				  
			      //e.display();
				  System.out.print("Enter Your Choice:  ");
			      choice=SC.next();
			      
				 if(choice.charAt(0) == 'N')
				 {
					 break;
				 }
				 else
					 continue;
			 }
		  }
	}


