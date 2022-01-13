package ir.maktab.service;

import ir.maktab.data.dao.MainServiceDao;
import ir.maktab.data.model.entity.services.MainService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class MainServiceService {
    private MainServiceDao mainServiceDao;

    public void saveService(MainService mainService) {
        mainServiceDao.save(mainService);
    }

    public MainService findByName(String name) {
        Optional<MainService> mainServices = mainServiceDao.findByName(name);
        if (mainServices.isPresent())
            return mainServices.get();
        else
            throw new RuntimeException("NOT FOUND MAIN SERVICE!!");
    }
}
