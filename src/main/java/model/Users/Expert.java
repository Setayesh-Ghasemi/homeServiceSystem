package model.Users;

import lombok.Data;
import model.service.SubService;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Expert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int score;
    @ManyToMany
    List<SubService> homeServices = new ArrayList<>();

    public Expert(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Expert() {

    }
}
