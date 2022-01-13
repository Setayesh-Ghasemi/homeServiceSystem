package dao;

import model.services.SubService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class SubServiceDao {
    static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void save(SubService subService) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(subService);
        transaction.commit();
        session.close();
    }

    public SubService read(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        SubService subService = session.get(SubService.class, id);
        transaction.commit();
        session.close();
        return subService;
    }

    public void update(SubService subService) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(subService);
        transaction.commit();
        session.close();
    }

    public void delete(SubService subService) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(subService);
        transaction.commit();
        session.close();
    }

    public List<SubService> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query<SubService> query = session.createQuery("FROM SubService");
        List<SubService> subServices = query.list();
        transaction.commit();
        session.close();
        return subServices;
    }
}
