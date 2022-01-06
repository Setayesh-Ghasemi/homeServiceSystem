package dao;

import model.Users.Customer;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CustomerDao {

    static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void addCustomer(Customer customer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }

    public Customer findCustomerByEmail(String email) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String sql = "select * from customer where email = :email";
        SQLQuery sqlQuery = session.createSQLQuery(sql);
        sqlQuery.addEntity(Customer.class);
        sqlQuery.setParameter("email", email);
        Customer customer = (Customer) sqlQuery.list().get(0);
        session.close();
        return customer;
    }

    public void updateCustomerPassword(Customer customer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(customer);
        transaction.commit();
        session.close();
    }

    public List<Customer> showCustomer() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String sql = "select * from person where DTYPE =customer";
        SQLQuery sqlQuery = session.createSQLQuery(sql);
        sqlQuery.addEntity(Customer.class);
        List<Customer> customerList = sqlQuery.list();
        return customerList;
    }
}
