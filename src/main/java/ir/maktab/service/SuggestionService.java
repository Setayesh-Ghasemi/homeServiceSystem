package ir.maktab.service;

import ir.maktab.data.dao.SuggestionDao;
import ir.maktab.data.model.entity.orderStuff.Suggestion;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class SuggestionService {
    private SuggestionDao suggestionDao;

    public void saveSuggestion(Suggestion suggestion) {
        suggestionDao.save(suggestion);
    }
}
