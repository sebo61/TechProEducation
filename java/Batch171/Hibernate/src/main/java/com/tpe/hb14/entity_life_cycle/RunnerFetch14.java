package com.tpe.hb14.entity_life_cycle;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerFetch14 {
    public static void main(String[] args) {


        Configuration config=new Configuration().configure().
                addAnnotatedClass(Student14.class);


        SessionFactory sf=config.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx =session.beginTransaction();




        tx.commit();
        session.close();
        sf.close();


    }

}