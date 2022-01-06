package service;

import dao.ExpertDao;
import model.role.Expert;

public class ExpertService {
    ExpertDao expertDao = new ExpertDao();

    public void createExpert(String firstName, String lastName, String email) {
        Expert expert = new Expert(firstName, lastName, email);
        expertDao.saveExpert(expert);
    }

}
