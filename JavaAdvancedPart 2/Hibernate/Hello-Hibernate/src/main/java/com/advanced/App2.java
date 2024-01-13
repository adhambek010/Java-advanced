package com.advanced;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.advanced.entity.Users;

public class App2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cng.xml")
				.addAnnotatedClass(Users.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			// Create object of entity class type.
			Users user = new Users();
			
			// Start transaction.
			session.beginTransaction();
			
			// Perform operation.
			user = session.get(Users.class, 5);
			/* Update the value of the table's column.
			user.setPassword("password1234");*/
			// Delete the column of the table.
			session.delete(user);
			// Commit the transaction.
			session.getTransaction().commit();
			System.out.println(user);
		} finally {
			session.close();
			factory.close();
		}

	}

}
