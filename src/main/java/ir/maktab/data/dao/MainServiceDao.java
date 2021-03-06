package ir.maktab.data.dao;

import ir.maktab.data.model.entity.services.MainService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MainServiceDao extends JpaRepository<MainService, Integer> {

    Optional<MainService> findByName(String name);
}
