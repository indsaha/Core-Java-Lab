package employeeDetails;

import java.util.Scanner;

public class EntryEmployee {

	public static void main(String[] args) {
		
		int count = 0;
		Employee employees[]=new Employee[5];
		
		//Employee 1
		City ct= new City();
		ct.setName("Pune");
		
		Country con=new Country();
		con.setName("India");
		con.setCity(ct);
		
		Address add= new Address();
		add.setLine("10 Baner Highway Road.");
		add.setCountry(con);
		
		employees[count]=new Employee();
		employees[count].setName("Indranil");
		employees[count].setAddress(add);
		count++;
		
		
		//employee 2
		
		
		ct= new City();
		ct.setName("Pune");
		
		con=new Country();
		con.setName("India");
		con.setCity(ct);
		
		add= new Address();
		add.setLine("50 Baner Highway Road.");
		add.setCountry(con);
		
		employees[count]=new Employee();
		employees[count].setName("Indra");
		employees[count].setAddress(add);
		
		count++;
		
		//employee 3
		
		ct= new City();
		ct.setName("Pune");
		
		con=new Country();
		con.setName("India");
		con.setCity(ct);
		
		add= new Address();
		add.setLine("20 Baner Highway Road.");
		add.setCountry(con);
		
		employees[count]=new Employee();
		employees[count].setName("Bindra");
		employees[count].setAddress(add);
		count++;
		
		//Employees 4
		
		ct= new City();
		ct.setName("Chennai");
		
		con=new Country();
		con.setName("India");
		con.setCity(ct);
		
		add= new Address();
		add.setLine("50 Mallapakkam Road.");
		add.setCountry(con);
		
		employees[count]=new Employee();
		employees[count].setName("Rudrajit");
		employees[count].setAddress(add);
		
		count++;
		
		//Employee 5
		
		ct= new City();
		ct.setName("Kolkata");
		
		con=new Country();
		con.setName("India");
		con.setCity(ct);
		
		add= new Address();
		add.setLine("20 Rajani Sen Road.");
		add.setCountry(con);
		
		employees[count]=new Employee();
		employees[count].setName("Satyajit");
		employees[count].setAddress(add);
		
		
		for (Employee emp : employees)
		{
			System.out.println("Name: " + emp.getName());
			System.out.println("Address : " +emp.getAddress().getLine());
			System.out.println("Country : " +emp.getAddress().getCountry().getName());
			System.out.println("City: " +emp.getAddress().getCountry().getCity().getName());
			System.out.println("*********************************************************");
			System.out.println("\n");
		}
		
		// TODO Auto-generated method stub

	}

}
