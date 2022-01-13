package ir.maktab.dto;

import ir.maktab.data.model.enums.TypeOfRole;
import ir.maktab.data.model.enums.TypeOfUserStatus;
import lombok.Data;

import java.util.Calendar;

@Data
public class UserDto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private Calendar registerDate;
    private TypeOfRole typeOfRole;
    private TypeOfUserStatus typeOfUserStatus;
}
