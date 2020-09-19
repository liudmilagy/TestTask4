package com.gly.TestTask4.dao;

import com.gly.TestTask4.models.Value;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.gly.TestTask4.utils.HibernateSessionFactoryUtil;
import org.springframework.stereotype.Repository;

@Repository
public class ValueDao {

    public void save(Value value) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(value);
        tx1.commit();
        session.close();
    }

    public static void createTable() {
         // создать, если не существует, и очистить от старых данных.
        String queryText = "create table if not exists value (v float, id serial not null constraint value_pk primary key); delete from value;";
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction txn = session.beginTransaction();
        Query query = session.createSQLQuery(queryText);
        query.executeUpdate();
        txn.commit();
        session.close();
    }
}
