package model.orderStuff;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.role.Expert;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Suggestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    private Calendar creationDateOfSuggestion;
    private long suggestedPrice;
    private long periodOfWorkTime;
    @Temporal(TemporalType.TIME)
    private Calendar startTime;
    @ManyToOne
    private Expert expert;
    @ManyToOne
    private Order order;
}
