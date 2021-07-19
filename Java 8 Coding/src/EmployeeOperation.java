import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVisor s1=new SuperVisor(1,"Debayan");
		SuperVisor s2=new SuperVisor(2,"Mrinmoy");
		
		Role r1=new Role("Admin");
		Role r2=new Role("Manager");
		Role r3=new Role("User");
		List<Role> roles1=new ArrayList<Role>();
		List<Role> roles2=new ArrayList<Role>();
		List<Role> roles3=new ArrayList<Role>();
		List<Role> roles4=new ArrayList<Role>();
		roles1.add(r2);
		roles2.add(r1);
		roles2.add(r2);
		roles3.add(r1);
		roles3.add(r2);
		roles3.add(r3);
		roles4.add(r1);
		roles4.add(r3);
		
		
		Employee emp1=new Employee(1, "Arvind",25, 5000,s1,roles1);
		//roles.add(r2);
		Employee emp2=new Employee(2, "Susanta",27, 10000,s2, roles2);
		//roles.add(r3);
		Employee emp3=new Employee(3, "Barnasha",30, 8000,s1, roles4);
		//roles.remove(r1);
		Employee emp4=new Employee(4, "Tamal",24, 15000,s2, roles3);
		//roles.remove(r3);
		Employee emp5=new Employee(5, "Sagnik",28, 7000,s1, roles4);
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		//retrieveing all employees
		empList.forEach(emp->System.out.println("Employees-->"+emp));
		//retrieving all names
		empList.forEach(emp->System.out.println("Emp names-->"+emp.getName()));
		//Sorting the list using names
		//List<Employee> sortedList;
		empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()).forEach(emp->System.out.println("Sorted List"+emp));
		
		//sorting descending age
		empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(emp->System.out.println("Reverse Sorted Age List"+emp));
		// finding any of  the employess whose name start with S
		Optional<Employee> emp=empList.stream().filter(employee->employee.getName().startsWith("S")).findAny();
		if(emp.isPresent()) {
			System.out.println(emp.get());
		}
		//finding max salary
		Employee maxSalary=empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println("Max salary-->" +maxSalary.getSalary());
		
		//filter the employees whose supervisor is debayan
		empList.stream().filter(employee->employee.getSupervisor().getName().equals("Debayan")).forEach(i->System.out.println(i));
		// filter the employees whose role is manager
		empList.stream().filter(employee->employee.getRoles().stream().anyMatch(role->role.getName().equalsIgnoreCase("Manager"))).forEach(System.out::println);
		
		

	}

}
