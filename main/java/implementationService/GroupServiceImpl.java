package implementationService;


import DAO.GroupDAO;
import DAO.GroupDAOImpl;
import DAO.StudentDAO;
import DAO.StudentDAOImpl;
import model.Group;
import model.Student;
import service.GroupService;

import java.util.List;
import java.util.Random;


public class GroupServiceImpl implements GroupService {

    GroupDAO groupDAO = GroupDAOImpl.getInstance();

    public void selectCaptain() {
        fillGroups();
        List<Group> groups = groupDAO.getGroups();
        for (Group group : groups) {
            Student captain = group.getStudents().get(0);
            for (Student student : group.getStudents()) {
                captain = selectCaptain(captain, student);

            }
            group.setCaptain(captain);

        }
    }

    private Student selectCaptain(Student captain, Student student) {
        int sum = student.getActivity() + student.getHard_working() + student.getResponsibility() + student.getSuccess();
        int sum2 = captain.getActivity() + captain.getHard_working() + captain.getResponsibility() + captain.getSuccess();
        return sum > sum2 ? student : captain;
    }

    private void fillGroups() {
        Random random = new Random();
        StudentDAO studentDAO = StudentDAOImpl.getInstance();
        for (Student student : studentDAO.getStudents()) {
            student.setGroup(groupDAO.getGroups().get(random.nextInt(3)).addStudent(student));

        }
    }


}
