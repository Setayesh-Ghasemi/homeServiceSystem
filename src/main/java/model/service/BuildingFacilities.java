package model.service;

import enums.TypeOfService;
import lombok.Data;
import model.Users.Expert;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class BuildingFacilities extends SubService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    TypeOfService typeOfService;
    @ManyToMany
    private List<Expert> expertList = new ArrayList<>();
}
