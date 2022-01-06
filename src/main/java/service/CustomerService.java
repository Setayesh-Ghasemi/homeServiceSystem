package service;

import dao.CustomerDao;
import dao.ExpertDao;
import model.Users.Customer;

import java.util.List;

public class CustomerService {
    CustomerDao customerDao = new CustomerDao();
    ExpertDao expertDao = new ExpertDao();

    public void createCustomer(String firstName, String lastName, String address, String email, String password) {
        Customer customer = new Customer(firstName, lastName, address, email, password);
        customerDao.addCustomer(customer);
    }

    public void changePassword(String password, String email) {
        Customer customer = customerDao.findCustomerByEmail(email);
        customer.setPassword(password);
        customerDao.updateCustomerPassword(customer);
    }

    public void printShowCustomer() {
        List<Customer> customers = customerDao.showCustomer();
        customers.stream().forEach(i -> System.out.println(i.getLastName()));
    }
}
