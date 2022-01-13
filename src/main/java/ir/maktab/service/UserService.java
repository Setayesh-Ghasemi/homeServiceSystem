package ir.maktab.service;

import ir.maktab.data.dao.UserDao;
import ir.maktab.data.model.entity.role.User;
import ir.maktab.exception.InvalidEmailException;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class UserService {
    private UserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }

    public void delete(User user) {
        String email = user.getEmail();
        String password = user.getPassword();
        if (userDao.findByEmailAndPassword(email, password).isPresent())
            userDao.delete(user);
        else
            throw new RuntimeException("USER NOT FOUND!!");
    }

    public User findByEmail(String email) {
        Optional<User> user = userDao.findByEmail(email);
        if (user.isPresent())
            return user.get();
        else
            throw new InvalidEmailException("EMAIL NOT EXIST!!");
    }

    public User findByEmailAndPassword(String email, String password) {
        Optional<User> user = userDao.findByEmailAndPassword(email, password);
        if (user.isPresent())
            return user.get();
        else
            throw new RuntimeException("NOT FOUND WITH THIS EMAIL AND PASSWORD");
    }

    public void changePassword(String email, String newPass) {
        //TODO
    }

}
