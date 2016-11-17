/**
 * 
 */
package com.sample;

/**
 * @author Naveen Chintala
 *
 */
public class ProblemStatement2 {

	public static void main(String[] args) {
		float currentSalary = 5000;
		for (int i = 1; i <= 5; i++) {
			currentSalary = currentSalary + (currentSalary * 15) / 100f;
			if (i == 5) {
				System.out
						.println("Salary of employee with $5000 after 5 years : "
								+ "$" + currentSalary);
			}
		}
	}

}
