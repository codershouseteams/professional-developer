/**
 * -----Coder's House Teams-----
 * Skype: luongvu.work@gmail.com
 * Mail: codershouseteams@gmail.com
 * Phone Number: (+84) 0935710974 - (+84) 0935810974
 * Project Name: jpa-entity-managers
 * Create Date: Oct 27, 2019
 */
package com.richard.services.test;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 * @author richard
 *
 */
public class ScalarandAggregateFunctions {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();

		// Scalar function
		Query query = entitymanager.createQuery("Select UPPER(e.ename) from Employee e");
		@SuppressWarnings("unchecked")
		List<String> list = query.getResultList();

		for (String e : list) {
			System.out.println("Employee NAME :" + e);
		}

		// Aggregate function
		Query query1 = entitymanager.createQuery("Select MAX(e.salary) from Employee e");
		Double result = (Double) query1.getSingleResult();
		System.out.println("Max Employee Salary :" + result);
	}
}
