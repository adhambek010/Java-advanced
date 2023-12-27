package com.advanced;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.advanced.entity.Users;

public class App3 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cng.xml").addAnnotatedClass(Users.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			// Execute the update query using executeUpdate()
			int updatedRows = session.createQuery("update Users set password = 'super_pssword' where password like '%1234%'")
					.executeUpdate();

			System.out.println("Updated rows: " + updatedRows);

			// Commit the transaction
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}

	}
}
