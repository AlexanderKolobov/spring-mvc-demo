package com.luv2code.springdemo.mvc;

import com.luv2code.springdemo.mvc.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CreateStudentDemo
{
    public static void main( String[] args )
    {
        //create session factory
        SessionFactory factory = new Configuration()
            .configure( "resources/hibernate.cfg.xml" )
            .addAnnotatedClass( Student.class )
            .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();

        try
        {
            session.beginTransaction();

            String hql = "from Student";
            List<Student> list = session.createQuery( hql ).list();
            System.out.println("Size : " + list.size());
            session.getTransaction().commit();

            System.out.println("DONE!!!");
        }
        finally
        {
            factory.close();
        }
    }
}
