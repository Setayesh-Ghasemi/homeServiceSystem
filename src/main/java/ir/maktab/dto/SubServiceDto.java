package ir.maktab.dto;

import ir.maktab.data.model.entity.services.MainService;
import lombok.Data;

@Data
public class SubServiceDto {
    private int id;
    private String name;
    private MainService mainService;
    private String description;
    private long price;
}
