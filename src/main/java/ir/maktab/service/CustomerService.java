package ir.maktab.service;

import ir.maktab.data.dao.*;
import ir.maktab.data.model.entity.orderStuff.Order;
import ir.maktab.data.model.entity.role.Customer;
import ir.maktab.data.model.entity.role.Expert;
import ir.maktab.data.model.enums.TypeOfOrder;
import ir.maktab.data.model.enums.TypeOfUserStatus;
import ir.maktab.exception.InvalidEmailException;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class CustomerService {
    private ExpertDao expertDao;
    private CustomerDao customerDao;
    private MainServiceDao mainServiceDao;
    private SubServiceDao subServices;
    private SuggestionDao suggestionDao;
    private OrderDao orderDao;

    @Autowired
    public CustomerService(ExpertDao expertDao, CustomerDao customerDao, MainServiceDao mainServiceDao,
                           SubServiceDao subServices, SuggestionDao suggestionDao, OrderDao orderDao) {
        this.expertDao = expertDao;
        this.customerDao = customerDao;
        this.mainServiceDao = mainServiceDao;
        this.subServices = subServices;
        this.suggestionDao = suggestionDao;
        this.orderDao = orderDao;
    }

    public void save(Customer customer) {
        if (customerDao.findByEmail(customer.getEmail()).isEmpty()) {
            customer.setTypeOfUserStatus(TypeOfUserStatus.WAITING_FOR_APPROVAL);
            customerDao.save(customer);
        } else throw new RuntimeException("NOT FOUND!!");
    }

    public void saveOrder(Order order) {
        order.setTypeOfOrder(TypeOfOrder.WAITING_FOR_EXPERT_SUGGESTION);
        orderDao.save(order);
    }

    public Customer findByEmail(String email) {
        Optional<Customer> customer = customerDao.findByEmail(email);
        if (customer.isPresent())
            return customer.get();
        else throw new InvalidEmailException("EMAIL NOT EXIST!!");
    }

    public Customer findByEmailAndPassword(String email, String password) {
        Optional<Customer> customer = customerDao.findByEmailAAndPassword(email, password);
        if (customer.isPresent())
            return customer.get();
        else
            throw new RuntimeException("NOT FOUND WITH THIS EMAIL AND PASSWORD");
    }

    public void selectExpertToOrder(int expertId, int orderId) {
        Optional<Order> order = orderDao.findById(orderId);
        if (order.isPresent()) {
            Order verifiedOrder = order.get();
            Expert expert = expertDao.findById(expertId).get();
            verifiedOrder.setExpert(expert);
            verifiedOrder.setTypeOfOrder(TypeOfOrder.WAITING_FOR_THE_SPECIALIST_COME);
            orderDao.save(verifiedOrder);
        }
    }

    public List<Order> getOrdersList(String email) {
        //TODO
        return null;
    }


}
