package com.rj.noonesbook.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.SessionFactoryServiceRegistryBuilderImpl;

public abstract class AbstractDao {

	private static SessionFactory sessionFactory;
	static {
		loadSessionFactory();
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	private static void loadSessionFactory() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("application.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Configuration configuration = new Configuration();
		configuration.addProperties(properties);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
		        configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
}
