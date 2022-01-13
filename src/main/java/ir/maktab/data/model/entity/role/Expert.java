package ir.maktab.data.model.entity.role;

import ir.maktab.data.model.entity.services.MainService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class Expert extends User {
    @Lob
    @Column(nullable = false, columnDefinition = "BLOB", length = 300)
    private byte[] image;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<MainService> mainServices = new ArrayList<>();
    private long credit;
    private double score;
}
