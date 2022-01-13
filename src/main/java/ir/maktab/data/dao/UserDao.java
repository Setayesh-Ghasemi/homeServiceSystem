package ir.maktab.data.dao;


import ir.maktab.data.model.entity.role.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

}
