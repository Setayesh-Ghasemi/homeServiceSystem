package model.service;

import enums.TypeOfService;
import lombok.Data;
import model.Users.Expert;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
public class Cleaning extends SubService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    TypeOfService typeOfService;
    @ManyToMany
    private List<Expert> expertList = new ArrayList<>();
    @Transient
    private static List<TypeOfService> TypeOfServices = Arrays.asList(TypeOfService.CLEANING, TypeOfService.LAUNDRY,
            TypeOfService.CARPET_WASHING, TypeOfService.SOFA_WASHING, TypeOfService.HOME_SPRAYING);
}
