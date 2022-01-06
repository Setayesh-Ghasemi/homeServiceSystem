package dao;

import model.services.SubService;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ServiceDao {
    static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public SubService findServiceByName(String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String sql = "select * from SubService where name = :name ";
        SQLQuery sqlQuery = session.createSQLQuery(sql);
        sqlQuery.addEntity(SubService.class);
        sqlQuery.setParameter("name", name);
        SubService homeServices= (SubService) sqlQuery.list().get(0);
        session.close();
        return homeServices;
    }


}
