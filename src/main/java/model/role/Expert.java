package model.role;

import lombok.Data;
import model.services.SubService;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Expert extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private int score;
    private float expertCredit;
    @ManyToMany
    List<SubService> subServices = new ArrayList<>();

    public Expert(String firstName, String lastName, String email) {
        super(firstName, lastName);
        this.email = email;
    }

    public Expert() {
    }
}
