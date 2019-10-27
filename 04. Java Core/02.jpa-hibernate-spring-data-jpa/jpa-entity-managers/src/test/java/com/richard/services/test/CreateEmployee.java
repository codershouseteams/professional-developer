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
public class CreateEmployee {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Employee employee = new Employee();
		employee.setEid(1201);
		employee.setEname("Hung Ngo");
		employee.setSalary(40000);
		employee.setDeg("Member");

		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
	}
}
