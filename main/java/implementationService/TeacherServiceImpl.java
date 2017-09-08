package implementationService;


import DAO.GroupDAO;
import DAO.GroupDAOImpl;
import DAO.TeacherDAO;
import DAO.TeacherDAOImpl;
import model.Group;
import model.Student;
import model.Teacher;
import service.TeacherService;

import java.util.Random;

public class TeacherServiceImpl implements TeacherService {


    public void checkGroup() {
        GroupDAO groupDAO = GroupDAOImpl.getInstance();
        TeacherDAO teacherDAO = TeacherDAOImpl.getInstance();
        for (Group group : groupDAO.getGroups()) {
            for (Teacher teacher : teacherDAO.getTeachers()) {
                checkGroup(group, teacher);

            }

        }
    }

    private void checkGroup(Group group, Teacher teacher) {
        Random random = new Random();
        int present = 0;
        System.out.println("Presence on lesson of " + teacher + "\n" + group + "\n" + group.getCaptain());

        for (Student student : group.getStudents()) {
            if (random.nextBoolean()) {
                System.out.println(student + " is present");
                present++;
            } else {
                System.out.println(student + " is absent");
            }

        }
        System.out.println("Today are " + present + " students present ");
    }
}
