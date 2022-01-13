package ir.maktab.data.dao;

import ir.maktab.data.model.entity.role.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpertDao extends JpaRepository<Expert, Integer> {
    Optional<Expert> findByEmail(String email);

}
