package ir.maktab.dto;

import ir.maktab.data.model.entity.orderStuff.Order;
import ir.maktab.data.model.entity.role.Expert;
import lombok.Data;

import java.util.Date;

@Data
public class SuggestionDto {
    private int id;
    private Date submitDateSuggestion;
    private long priceSuggested;
    private long durationOfWorkTime;
    private Date starTime;
    private Order order;
    private Expert expert;
}
