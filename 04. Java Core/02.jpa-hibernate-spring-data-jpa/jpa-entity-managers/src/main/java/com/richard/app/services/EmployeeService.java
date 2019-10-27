/**
 * -----Coder's House Teams-----
 * Skype: luongvu.work@gmail.com
 * Mail: codershouseteams@gmail.com
 * Phone Number: (+84) 0935710974 - (+84) 0935810974
 * Project Name: jpa-entity-managers
 * Create Date: Oct 26, 2019
 */
package com.richard.app.services;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.richard.app.entities.Employee;

/**
 * @author richard
 *
 */
public class EmployeeService {
	private Scanner updateEm;

	public String getAllEmployee() {
		return "Get All Employee Method was called!";
	}

	public String getEmployeeById(int id) {
		return "Get Employee By Id Method was called!";
	}

	public String createEmployee(Employee em) {
		String message = null;
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.persist(em);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();

		return message;
	}

	public String updateEmployee(int id) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Employee employee = entitymanager.find(Employee.class, id);

		// before update
		System.out.println(employee);

		updateEm = new Scanner(System.in);

		System.out.print("Change Name: ");
		employee.setEname(updateEm.nextLine());

		System.out.print("Change Salary: ");
		employee.setSalary(updateEm.nextInt());

		System.out.print("Change Salary: ");
		employee.setDeg(updateEm.nextLine());

		entitymanager.getTransaction().commit();

		// after update
		System.out.println(employee);
		entitymanager.close();
		emfactory.close();

		return null;
	}

	public String deleteEmployee(int id) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Employee employee = entitymanager.find(Employee.class, id);

		// before update
		System.out.println(employee);

		updateEm = new Scanner(System.in);

		System.out.print("Change Name: ");
		employee.setEname(updateEm.nextLine());

		System.out.print("Change Salary: ");
		employee.setSalary(updateEm.nextInt());

		System.out.print("Change Salary: ");
		employee.setDeg(updateEm.nextLine());

		entitymanager.getTransaction().commit();

		// after update
		System.out.println(employee);
		entitymanager.close();
		emfactory.close();

		return null;
	}
}
