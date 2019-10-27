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

import com.richard.app.entities.Employee;


/**
 * @author richard
 *
 */
public class Ordering {
	public static void main( String[ ] args ) {
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      
	      //Between
	      Query query = entitymanager.createQuery( "Select e " + "from Employee e " + "ORDER BY e.ename ASC" );

		@SuppressWarnings("unchecked")
		List<Employee> list = (List<Employee>) query.getResultList();

	      for( Employee e:list ) {
	         System.out.print("Employee ID :" + e.getEid( ));
	         System.out.println("\t Employee Name :" + e.getEname( ));
	      }
	   }
}
