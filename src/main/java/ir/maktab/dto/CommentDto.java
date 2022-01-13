package ir.maktab.dto;

import ir.maktab.data.model.entity.orderStuff.Order;
import ir.maktab.data.model.entity.role.Customer;
import ir.maktab.data.model.entity.role.Expert;
import lombok.Data;

@Data
public class CommentDto {
    private int id;
    private String comment;
    private Customer customer;
    private Expert expert;
    private Order order;
}
