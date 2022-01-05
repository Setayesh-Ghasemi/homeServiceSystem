package model.Users;

import enums.TypeOfUserStatus;
import lombok.Data;

import javax.persistence.*;

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
    private String password;
    @Enumerated(EnumType.STRING)
    TypeOfUserStatus typeOfUserStatus;
}
