package dao;

import model.services.MainService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainServiceDao {
    static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void save(MainService mainService) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(mainService);
        transaction.commit();
        session.close();
    }

    public void update(MainService mainService) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(mainService);
        transaction.commit();
        session.close();
    }

    public void delete(MainService mainService) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(mainService);
        transaction.commit();
        session.close();
    }

    /*public Optional<MainService> findByName(String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from MainService mainService where mainService.name=:name";
        Query<MainService> query = session.createQuery(hql, MainService.class);
        query.setParameter("name", name);
        Optional<MainService> mainService = Optional.ofNullable(query.uniqueResult());
        transaction.commit();
        session.close();
        return mainService;
    }*/

}
