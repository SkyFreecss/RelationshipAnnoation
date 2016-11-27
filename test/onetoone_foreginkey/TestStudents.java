package onetoone_foreginkey;

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
	   public void testStudents()
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
		      
		      IdCard card = new IdCard("429006199603025115","三蹦子");
		      Students stu = new Students(card,"男",new Date(),"电气化");
		      //先保存身份证类的对象
		      session.save(card);
		      session.save(stu);
		      transaction.commit();
	   }
}
