package model.orderStuff;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float cost;
    private String description;
    private Date startDate;
    private Date endDate;
    private String address;

    public Order(float cost, String description, Date startDate, Date endDate, String address) {
        this.cost = cost;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.address = address;
    }

    public Order() {
    }
}
