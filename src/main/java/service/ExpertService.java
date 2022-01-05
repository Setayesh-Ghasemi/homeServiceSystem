package service;

import dao.ExpertDao;
import model.Users.Expert;

public class ExpertService {
    ExpertDao expertDao = new ExpertDao();

    public void createExpert(String firstName, String lastName, String email) {
        Expert expert = new Expert(firstName, lastName, email);
        expertDao.addExpert(expert);
    }

    public void deleteExpert(String email) {
        Expert expert = expertDao.findExpertByEmail(email);
        expertDao.deleteExpert(expert);
    }
}
