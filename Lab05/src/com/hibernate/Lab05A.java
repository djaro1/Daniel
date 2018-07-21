package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Lab05A {
	public static void main(String args[]) {
		try{

			System.err.println("I am changing the code3");

			System.out.println("commit from eclipse");

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			//Adding Student
			Student stu = new Student ("Arvind", "Banglore", "InActive", 17000);
			Integer it = (Integer) session.save(stu);
			System.out.println(it.intValue());
			//Adding CurrentStudent
			CurrentStudent cstu = new CurrentStudent("Dhiraj","LKR", "Active", 17000, 2000, "1.30PM", "Marathalli");
			Integer it1=(Integer)session.save(cstu);
			System.out.println(it1.intValue());
			//Adding OldStudent
			OldStudent ostu=new OldStudent("Vivek","BGP","Inactive",2000,"AEC","vvk@aec",5000);
			System.out.println(session.save(ostu));
			tx.commit();
			session.close();
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
}
