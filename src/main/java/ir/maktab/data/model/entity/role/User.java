package ir.maktab.data.model.entity.role;

import ir.maktab.data.model.enums.TypeOfUserStatus;
import ir.maktab.data.model.enums.TypeOfRole;
import ir.maktab.data.model.entity.orderStuff.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private TypeOfUserStatus typeOfUserStatus;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date registerDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Address> addresses = new HashSet<>();
    @Enumerated(value = EnumType.STRING)
    private TypeOfRole typeOfRole;
}
