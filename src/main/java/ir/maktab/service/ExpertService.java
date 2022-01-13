package ir.maktab.service;

import ir.maktab.data.dao.*;
import ir.maktab.data.model.entity.orderStuff.Order;
import ir.maktab.data.model.entity.role.Expert;
import ir.maktab.data.model.entity.services.SubService;
import ir.maktab.exception.InvalidEmailException;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class ExpertService {
    private ExpertDao expertDao;
    private CustomerDao customerDao;
    private SubServiceDao subServiceDao;
    private SuggestionDao suggestionDao;
    private OrderDao orderDao;

    @Autowired
    public ExpertService(ExpertDao expertDao, CustomerDao customerDao, SubServiceDao subServiceDao,
                         SuggestionDao suggestionDao, OrderDao orderDao) {
        this.expertDao = expertDao;
        this.customerDao = customerDao;
        this.subServiceDao = subServiceDao;
        this.suggestionDao = suggestionDao;
        this.orderDao = orderDao;
    }

    public void save(Expert expert) {
        expertDao.save(expert);
    }

    public Expert findByEmail(String email) {
        Optional<Expert> expert = expertDao.findByEmail(email);
        if (expert.isPresent())
            return expert.get();
        else throw new InvalidEmailException("NOT FOUND!!");
    }

    public List<Order> getOrderList(Expert expert) {
        //TODO
        return null;
    }

    public void saveSubServiceToExpertList(String email, String subService) {
        Expert expert = findByEmail(email);
        Optional<SubService> subServicesOptional = subServiceDao.findByName(subService);
        if (subServicesOptional.isPresent() && expert != null) {
            SubService subServices = subServicesOptional.get();
            expert.getMainServices().add(subServices);
        } else
            throw new RuntimeException("NOT FOUND!!");
    }
}

