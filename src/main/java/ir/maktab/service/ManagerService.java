package ir.maktab.service;

import ir.maktab.data.dao.ManagerDao;
import ir.maktab.data.model.entity.role.Manager;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class ManagerService {
    private ManagerDao managerDao;

    public void save(Manager manager) {
        managerDao.save(manager);
    }
}
