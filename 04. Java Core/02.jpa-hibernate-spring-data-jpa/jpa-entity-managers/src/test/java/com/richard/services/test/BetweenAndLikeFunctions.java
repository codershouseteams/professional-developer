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
public class BetweenAndLikeFunctions {
	public static void main( String[ ] args ) {
		   
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      
	      //Between
	      Query query = entitymanager.createQuery( "Select e " + "from Employee e " + "where e.salary " + "Between 30000 and 40000" );
	      
	      @SuppressWarnings("unchecked")
		List<Employee> list=(List<Employee>)query.getResultList( );

	      for( Employee e:list ){
	         System.out.print("Employee ID :" + e.getEid( ));
	         System.out.println("\t Employee salary :" + e.getSalary( ));
	      }

	      //Like
	      Query query1 = entitymanager.createQuery("Select e " + "from Employee e " + "where e.ename LIKE 'M%'");
	      
	      @SuppressWarnings("unchecked")
		List<Employee> list1=(List<Employee>)query1.getResultList( );
	      
	      for( Employee e:list1 ) {
	         System.out.print("Employee ID :"+e.getEid( ));
	         System.out.println("\t Employee name :"+e.getEname( ));
	      }
	   }
}
