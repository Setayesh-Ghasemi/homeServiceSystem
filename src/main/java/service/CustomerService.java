package service;

import dao.CustomerDao;
import model.role.Customer;

import java.util.List;

public class CustomerService {
    CustomerDao customerDao = new CustomerDao();

    public void createCustomer(String firstName, String lastName, String address, String email, String password) {
        Customer customer = new Customer(firstName, lastName, address, email, password);
        customerDao.saveCustomer(customer);
    }

    public void changePassword(String password, String email) {
        Customer customer = customerDao.findCustomerByEmail(email);
        customer.setPassword(password);
        customerDao.updateCustomerPassword(customer);
    }

    public void printShowCustomer() {
        List<Customer> customers = customerDao.showCustomers();
        customers.stream().forEach(i -> System.out.println(i.getLastName()));
    }
}
