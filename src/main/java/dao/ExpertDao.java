package dao;

import model.Users.Expert;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import service.ExpertService;

import java.util.List;

public class ExpertDao {
    ExpertService expertService = new ExpertService();
    static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void addExpert(Expert expert) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(expert);
        transaction.commit();
        session.close();
    }

    public void deleteExpert(Expert expert) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(expert);
        transaction.commit();
        session.close();
    }

    public Expert findExpertByEmail(String email) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String sql = "select * from expert where email = :email";
        SQLQuery sqlQuery = session.createSQLQuery(sql);
        sqlQuery.addEntity(Expert.class);
        sqlQuery.setParameter("email", email);
        Expert expert = (Expert) sqlQuery.list().get(0);
        session.close();
        return expert;
    }

    public List<Expert> showExpert() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String sql = "select * from person where DTYPE =Expert";
        SQLQuery sqlQuery = session.createSQLQuery(sql);
        sqlQuery.addEntity(Expert.class);
        List<Expert> expertList = sqlQuery.list();
        return expertList;
    }

}
