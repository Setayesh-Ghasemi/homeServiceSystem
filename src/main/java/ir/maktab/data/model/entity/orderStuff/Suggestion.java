package ir.maktab.data.model.entity.orderStuff;

import ir.maktab.data.model.entity.role.Expert;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
    private Calendar submitDateSuggestion;
    @Temporal(TemporalType.TIME)
    private Calendar startTime;
    private long priceSuggested;
    private long durationOfWorkTime;
    @ManyToOne
    private Expert expert;
    @ManyToOne
    private Order order;
}
