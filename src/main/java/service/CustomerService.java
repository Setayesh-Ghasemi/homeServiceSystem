package service;

import dao.CustomerDao;
import model.role.Customer;

public class CustomerService {
    CustomerDao customerDao = new CustomerDao();

    public void createCustomer(String firstName, String lastName, String address, String email, String password) {
        Customer customer = new Customer(firstName, lastName, address, email, password);
        customerDao.saveCustomer(customer);
    }

}
