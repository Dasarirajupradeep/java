package com.wipro.java.java8.usecase;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EmployeeManagement {
	public static void main(String[] args) {
	EmployeeService service = new EmployeeService();
	Scanner scanner = new Scanner(System.in);
	// Adding some employees for testing
	service.addEmployee(new Employee(1, "Pradeep", "Software", 80000, LocalDate.of(2021, 7, 27)));
	service.addEmployee(new Employee(2, "Darshan", "Finance", 87000, LocalDate.of(2022, 9, 19)));
	service.addEmployee(new Employee(3, "Swathi Saaho", "Marketing", 71000, LocalDate.of(2023, 1,29)));
	while (true) {
		System.out.println("\n------ Employee Management System ------");
		System.out.println("1. Add Employee");
		System.out.println("2. Remove Employee");
		System.out.println("3. Search Employee");
		System.out.println("4. Update Salary");
		System.out.println("5. Display All Employees");
		System.out.println("6. Filter by Department");
		System.out.println("7. Sort by Name");
		System.out.println("8. Get Average Salary");
		System.out.println("9. Exit");
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();
		switch (choice) {
			case 1:
				// Add Employee
				System.out.print("Enter ID: ");
				int id = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				System.out.print("Enter Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Department: ");
				String dept = scanner.nextLine();
				System.out.print("Enter Salary: ");
				double salary = scanner.nextDouble();
				service.addEmployee(new Employee(id, name, dept, salary, LocalDate.now()));
				break;
			case 2:
				// Remove Employee
				System.out.print("Enter Employee ID to Remove: ");
				int removeId = scanner.nextInt();
				service.removeEmployee(removeId);
				break;
			case 3:
				// Search For Employee
				System.out.print("Enter Employee ID to Search: ");
				int searchId = scanner.nextInt();
				Optional<Employee> emp = service.searchEmployee(searchId);
				System.out.println(emp.orElse(null));
				break;
			case 4:
				// Update salary
				System.out.print("Enter Employee ID to Update Salary: ");
				int updateId = scanner.nextInt();
				System.out.print("Enter New Salary: ");
				double newSalary = scanner.nextDouble();
				service.updateSalary(updateId, newSalary);
				break;
			case 5:
				// Display all Employees
				service.displayEmployees();
				break;
			case 6:
				// Filter By Department
				System.out.print("Enter Department: ");
				scanner.nextLine();
				String department = scanner.nextLine();
				List<Employee> filtered = service.filterByDepartment(department);
				filtered.forEach(System.out::println);
				break;
			case 7:
				// Sort by name
				List<Employee> sorted = service.sortByName();
				sorted.forEach(System.out::println);
				break;
			case 8:
				// Get average salary
				System.out.println("Average Salary: " + service.getAverageSalary());
				break;
				case 9:
					// Exit
				System.out.println("Exiting...");
				scanner.close();
				return;
				default:
				System.out.println("Invalid choice! Try again.");
		   }
		}
	}
}