package com.onetomany.foreginkey;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class TestStudents {
       
	   @Test
	   public void init()
	   {
		   Configuration config = new Configuration().configure();
		   
		   ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		   
		   SessionFactory sessionfactory = config.buildSessionFactory(serviceRegistry);
		   
		   SchemaExport export = new SchemaExport(config);
		   export.create(true,true);
	   }
	   
	   @Test
	   public void addStudents()
	   {
		   Configuration config = new Configuration().configure();
		   
		   ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		   
		   SessionFactory sessionfactory = config.buildSessionFactory(serviceRegistry);
		   
		   Session session = sessionfactory.openSession();
		   
		   Transaction transaction = session.beginTransaction();
		   
		   ClassRoom cr1 = new ClassRoom("C0001111","JAVA班");
		   ClassRoom cr2 = new ClassRoom("C0002222","C++班");
		   
		   Students s1 = new Students("三蹦子","男",new Date());
		   Students s2 = new Students("四溜子","男",new Date());
		   Students s3 = new Students("李淑芬","女",new Date());
		   Students s4 = new Students("李淑凤","女",new Date());
		   
		   Set<Students> set1 = new HashSet<Students>();
		   set1.add(s1);
		   set1.add(s2);
		   
		   Set<Students> set2 = new HashSet<Students>();
		   set2.add(s3);
		   set2.add(s4);
		   
		   cr1.setStudent(set1);
		   cr2.setStudent(set2);
		   
		   session.save(s1);
		   session.save(s2);
		   session.save(s3);
		   session.save(s4);
		   
		   session.save(cr1);
		   session.save(cr2);
		   
		   transaction.commit();
	   }
}
