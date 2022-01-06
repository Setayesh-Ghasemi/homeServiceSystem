package service;

import dao.ExpertDao;
import model.role.Expert;

import java.util.List;

public class ExpertService {
    ExpertDao expertDao = new ExpertDao();

    public void createExpert(String firstName, String lastName, String email) {
        Expert expert = new Expert(firstName, lastName, email);
        expertDao.saveExpert(expert);
    }

    public void deleteExpert(String email) {
        Expert expert = expertDao.findExpertByEmail(email);
        expertDao.removeExpert(expert);

    }

    public void printShowExperts() {
        List<Expert> experts = expertDao.showExperts();
        experts.stream().forEach(i -> System.out.println(i.getLastName()));
    }
}
