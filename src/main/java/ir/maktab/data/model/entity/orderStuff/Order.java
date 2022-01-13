package ir.maktab.data.model.entity.orderStuff;

import ir.maktab.data.model.enums.TypeOfOrder;
import ir.maktab.data.model.entity.role.Customer;
import ir.maktab.data.model.entity.role.Expert;
import ir.maktab.data.model.entity.services.SubService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long suggestedPrice;
    private String DescriptionOfWork;
    @Enumerated(value = EnumType.STRING)
    private TypeOfOrder typeOfOrder;
    @CreationTimestamp
    private Date registrationDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @ManyToOne
    private SubService subService;
    @ManyToOne
    private Address address;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Customer customer;
    @ManyToOne
    private Expert expert;
    @OneToMany(mappedBy = "order")
    private Set<Suggestion> suggestions = new HashSet<>();
}
