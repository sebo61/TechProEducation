package com.tpe.hb05.manytoone_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RunnerFetch05 {
    public static void main(String[] args) {

        Configuration config=new Configuration().configure().
                addAnnotatedClass(Student05.class).
                addAnnotatedClass(University.class);


        SessionFactory sf=config.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx =session.beginTransaction();


        // id:1001 olnan öğrencinin tüm bilgilerini yazdırınız.

       Student05 student= session.get(Student05.class,1001);
        System.out.println(student);

        System.out.println(student.getUniversity());

        // HQL ile idsi 11 olan üniye giden tüö örencileri listeleyelim.

        String hql="SELECT s FROM Student05 s WHERE s.university.id=11";

            List<Student05> resultList = session.createQuery(hql, Student05.class).getResultList();
            resultList.forEach(System.out::println);

        //üniye giden öğrencilerin isimlerini, notlarını ve üniversitelerinin isimlerini yazdıralım
        String hql2="SELECT s.name,s.grade, u.name FROM Student05 s INNER JOIN University u ON s.university=u.id ";
        List<Object[]> resultList2=session.createQuery(hql2).getResultList();
        resultList2.forEach(t-> System.out.println(Arrays.toString(t)));

        tx.commit();
        session.close();
        sf.close();
    }

}
