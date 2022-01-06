package model.role;

import enums.TypeOfUserStatus;
import lombok.Data;
import model.orders.Order;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Customer extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;
    private String email;
    @Temporal(TemporalType.TIME)
    @CreationTimestamp
    private Date registration;
    private String password;
    private int username;
    private double customerCredit;
    @Enumerated(EnumType.STRING)
    TypeOfUserStatus typeOfUserStatus;
    @OneToMany
    private List<Order> orders = new ArrayList<>();

    public Customer() {
    }

    public Customer(String firstName, String lastName, String address, String email, String password) {
        super(firstName, lastName);
        this.address = address;
        this.email = email;
        this.password = password;
    }

}
