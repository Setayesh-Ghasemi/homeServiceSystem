package ir.maktab.service;

import ir.maktab.data.dao.SubServiceDao;
import ir.maktab.data.model.entity.services.SubService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class SubServiceService {
    private SubServiceDao subServiceDao;

    public void addSubService(SubService subService) {
        subServiceDao.save(subService);
    }

    public SubService findSubServiceByName(String name) {
        Optional<SubService> subService = subServiceDao.findByName(name);
        if (subService.isPresent())
            return subService.get();
        else
            throw new RuntimeException("NOT FOUND SUB SERVICE!!");
    }


}
