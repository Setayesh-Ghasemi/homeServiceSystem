package model.Users;

import enums.TypeOfUserStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    @Temporal(TemporalType.TIME)
    @CreationTimestamp
    private Date registration;
    private String password;
    @Enumerated(EnumType.STRING)
    TypeOfUserStatus typeOfUserStatus;

    public Customer(String firstName, String lastName, String address, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public Customer() {

    }
}
