package com.Cache2;

//import java.lang.module.Configuration;
//import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        
        
        SessionFactory fatory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
		Session s1= fatory.openSession();
		
		//stud1
		Student stud1 =s1.get(Student.class, 222);
		System.out.println(stud1);
        s1.close();
        
        //stud2
        Session s2= fatory.openSession();
        Student stud2 =s1.get(Student.class, 222);
		System.out.println(stud2);
        s2.close();
        
        
    }
}
