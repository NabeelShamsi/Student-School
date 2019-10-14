package com.world.Student.School;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class Util {

private static SessionFactory sessionFactory;
public static SessionFactory getSessionFactory() {
	
	if (sessionFactory == null) {
	
			Configuration configuration = new Configuration();
		    Properties settings = new Properties();
		    settings.put(Environment.DRIVER, "com.sql.jc.jdbc.Driver");
		    settings.put(Environment.URL, "jdbc:mysql://localhost:3306/world?serverTimezone=UTC");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "arianaya23");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			settings.put(Environment.SHOW_SQL, "true");
			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			
			configuration.setProperties(settings);
			configuration.addAnnotatedClass(Student.class);
			configuration.addAnnotatedClass(School.class);
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}
	return sessionFactory;
	}

}