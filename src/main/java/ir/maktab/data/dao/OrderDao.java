package ir.maktab.data.dao;

import ir.maktab.data.model.entity.orderStuff.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {

}
