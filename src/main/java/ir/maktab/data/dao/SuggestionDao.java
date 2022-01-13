package ir.maktab.data.dao;

import ir.maktab.data.model.entity.orderStuff.Suggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuggestionDao extends JpaRepository<Suggestion, Integer> {

    List<Suggestion> getSuggestionListByExpertId();
}
