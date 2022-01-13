package ir.maktab.service;

import ir.maktab.data.dao.OrderDao;
import ir.maktab.data.model.entity.orderStuff.Order;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class OrderService {
    private OrderDao orderDao;

    public void save(Order order) {
        orderDao.save(order);
    }
}
