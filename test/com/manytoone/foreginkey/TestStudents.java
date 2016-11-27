package com.manytoone.foreginkey;

import java.util.Date;

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
		   
		   ClassRoom cr1 = new ClassRoom("C0001111","JAVA��");
		   ClassRoom cr2 = new ClassRoom("C0002222","C++��");
		   
		   Students s1 = new Students("������",new Date(),"java se");
		   Students s2 = new Students("������",new Date(),"java ee");
		   Students s3 = new Students("�����",new Date(),"C++����");
		   Students s4 = new Students("�����",new Date(),"C++Ӧ��");
		   
		   s1.setCr(cr1);
		   s2.setCr(cr1);
		   s3.setCr(cr2);
		   s4.setCr(cr2);
		   
		   session.save(cr1);
		   session.save(cr2);
		   
		   session.save(s1);
		   session.save(s2);
		   session.save(s3);
		   session.save(s4);
		   
		   transaction.commit();
	   }
}
