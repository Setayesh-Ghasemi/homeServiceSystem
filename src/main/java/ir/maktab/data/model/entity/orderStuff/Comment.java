package ir.maktab.data.model.entity.orderStuff;

import ir.maktab.data.model.entity.role.Customer;
import ir.maktab.data.model.entity.role.Expert;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double score;
    private String comment;
    @OneToOne
    private Order order;
    private Expert expert;
    private Customer customer;
}
