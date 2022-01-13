package ir.maktab.dto;

import ir.maktab.data.model.entity.orderStuff.Address;
import ir.maktab.data.model.entity.orderStuff.Suggestion;
import ir.maktab.data.model.entity.role.Customer;
import ir.maktab.data.model.entity.role.Expert;
import ir.maktab.data.model.enums.TypeOfOrder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class OrderDto {
    private int id;
    private long priceSuggested;
    private long definitivePrice;
    private Date registrationDate;
    private TypeOfOrder typeOfOrder;
    private Address address;
    private Expert expert;
    private Customer customer;
    private List<Suggestion> suggestions = new ArrayList<>();
}
