package com.tpe.hb05.manytoone_uni;

import com.tpe.hb04.bi_onetoone.Diary04;
import com.tpe.hb04.bi_onetoone.Student04;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave05 {
    public static void main(String[] args) {

        University university1=new University(11,"Hibernate university");
        University university2=new University(22,"JPA University");

        Student05 student1=new Student05(1001,"ayşe",97,university1);
        Student05 student2=new Student05(1002,"ömer",97,university1);
        Student05 student3=new Student05(1003,"mustafa",99,university1);
        Student05 student4=new Student05(1004,"zeynep",93,university2);
        Student05 student5=new Student05(1005,"kübra",98,university2);



        Configuration config=new Configuration().configure().
                addAnnotatedClass(Student05.class).
                addAnnotatedClass(University.class);


        SessionFactory sf=config.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx =session.beginTransaction();

        session.persist(student1);
        session.persist(student2);
        session.persist(student3);
        session.persist(student4);
        session.persist(student4);

        session.persist(university1);
        session.persist(university2);



        tx.commit();
        session.close();
        sf.close();


    }
}