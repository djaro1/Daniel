package com.hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	static SessionFactory sessionFactory=null;
	static {
		Configuration cfg=new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrBuilder=new StandardServiceRegistryBuilder();
		StandardServiceRegistry ssRegistry=ssrBuilder.applySettings(cfg.getProperties()).build();
		sessionFactory=cfg.buildSessionFactory(ssRegistry);
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
