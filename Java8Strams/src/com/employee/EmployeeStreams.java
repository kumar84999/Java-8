package com.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreams {
	public static void main(String[] args) {
		
		List<Employee>emp=Arrays.asList(new Employee(117,"kumar",20000.00),new Employee(118,"kumar",20000.00),
				new Employee(101,"kumar",20000.00),new Employee(102,"pooja",30000.00),new Employee(103,"Ramya",25000.00),
			    new Employee(104,"Sriman",40000.00),new Employee(105,"shaan",23000.00),new Employee(106,"mahesh",26000.00),
				new Employee(107,"kumar",28000.00),new Employee(108,"Sweety",26000.00),new Employee(109,"pooja",29000.00),
			    new Employee(110,"srima",38000.00),new Employee(112,"shaan",25000.00),new Employee(113,"mahesh",32000.00),
				new Employee(114,"Ramya",35000.00),new Employee(115,"ravi",29000.00),new Employee(116,"kumar",75000.00));
		//based on salary
		List<Employee>empsort=emp.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).
				collect(Collectors.toList());
		System.out.println(empsort);
//		//highest n th salary
		List<Employee>empsalary=(List<Employee>)empsort.stream().skip(3).limit(1).collect(Collectors.toList());
//		//count the employee
		long count=emp.stream().count();
		System.out.println(empsalary);
		System.out.println(count);
		//find duplicates
		List<Employee>duplicate=emp.stream().filter(s->s.getName().equals("Kumar")).collect(Collectors.toList());
		System.out.println(duplicate);
		//find salary range
		List<Employee>range=emp.stream().filter(h->h.getSalary()>=25000.00&&h.getSalary()<=50000.00).collect(Collectors.toList());
		System.out.println(range);
		//list to map with stream
		Map<Integer,String>empName=emp.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println(empName);
				
		
		
	}

}
