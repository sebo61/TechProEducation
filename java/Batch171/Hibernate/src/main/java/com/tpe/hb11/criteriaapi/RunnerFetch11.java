package com.tpe.hb11.criteriaapi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RunnerFetch11 {
    public static void main(String[] args) {

        Configuration config=new Configuration().configure().
                addAnnotatedClass(Student11.class);


        SessionFactory sf=config.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx =session.beginTransaction();

/*
C: session.persist/save
R: session.get, HQL,SQL
U:
D: session.delete, HQL, SQL

 */

// İD Sİ 2 OLAN STUDENTİ GÜNCELLEYELİM.

        Student11 student=session.get(Student11.class,2);
        student.setName("updated"+student.getName());
        // session.update(student);
        // grade i 30 dan küçük olan kayırların gradeini 50 olarak güncelleyelim
        String hql="UPDATE Student11 s set s.grade=:newValue where s.grade<:oldValue";
        Query query= session.createQuery(hql);
        query.setParameter("newValue",50);
        query.setParameter("oldValue",30);

        int updatedrecord=query.executeUpdate();
        System.out.println("updatedrecord: "+updatedrecord);





        tx.commit();
        session.close();
        sf.close();

    }
}