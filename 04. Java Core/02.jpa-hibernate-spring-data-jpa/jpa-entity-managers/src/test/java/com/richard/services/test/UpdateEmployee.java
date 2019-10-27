/**
 * -----Coder's House Teams-----
 * Skype: luongvu.work@gmail.com
 * Mail: codershouseteams@gmail.com
 * Phone Number: (+84) 0935710974 - (+84) 0935810974
 * Project Name: jpa-entity-managers
 * Create Date: Oct 26, 2019
 */
package com.richard.services.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.richard.app.entities.Employee;

/**
 * @author richard
 *
 */
public class UpdateEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Employee employee = entitymanager.find(Employee.class, 2);

		// before update
		System.out.println(employee);
		employee.setDeg("Teachnical Manager");
		employee.setSalary(500000);
		entitymanager.getTransaction().commit();

		// after update
		System.out.println(employee);
		entitymanager.close();
		emfactory.close();
	}
}
