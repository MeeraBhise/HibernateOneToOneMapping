package com.Practice;

//  ONE TO ONE MAPPING OR RELATIONSHIP
//OneToOne Mapping

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String args[]) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        //Creating question object
        Question q1 = new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("what is java ?");
        //Creating Answer object
        Answer answer = new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("java is programming language");
        q1.setAnswer(answer);
        //session
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        s.save(q1);
        s.save(answer);
        tx.commit();
        s.close();
        factory.close();
    }
}
