package service;

import dao.CustomerDao;
import dao.ExpertDao;
import model.Users.Customer;

public class CustomerService {
    CustomerDao customerDao = new CustomerDao();
    ExpertDao expertDao = new ExpertDao();

    public void createCustomer(String firstName, String lastName, String address, String email, String password) {
        Customer customer = new Customer(firstName, lastName, address, email, password);
        customerDao.addCustomer(customer);
    }

}
