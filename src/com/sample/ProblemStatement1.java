/**
 * 
 */
package com.sample;

import java.util.ArrayList;
import java.util.List;

public class ProblemStatement1 {

	public static void main(String[] args) {
		List<Employee> employeeList = populateEmployeeList();
		for (int i = 0; i < employeeList.size() - 1; i++) {
			for (int j = i + 1; j < employeeList.size(); j++) {
				if (employeeList
						.get(i)
						.getEmployeeName()
						.equalsIgnoreCase(employeeList.get(j).getEmployeeName())) {
					System.out.println("Found employee with same name : "
							+ employeeList.get(j).getEmployeeName());
				}
			}
		}
	}

	private static List<Employee> populateEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();
		Employee emp1 = new Employee(1, "James White", "Accounts", 5000);
		Employee emp2 = new Employee(1, "Abcd Efgh", "Accounts", 4000);
		Employee emp3 = new Employee(1, "Qweerty hhss", "Sales", 3500);
		Employee emp4 = new Employee(1, "James White", "Security", 6000);
		Employee emp5 = new Employee(1, "ZXCV Huuak", "Accounts", 4800);
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		return employeeList;
	}

}
