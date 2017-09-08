package DAO;

import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherDAOImpl implements TeacherDAO {
    private List<Teacher> teachers = new ArrayList<Teacher>();
    private static TeacherDAOImpl instance = new TeacherDAOImpl();

    public TeacherDAOImpl() {
        for(int i = 0; i<3; i++){
            teachers.add(new Teacher("teacher",String.valueOf(i),"subject"+i));
        }
    }

    public static TeacherDAOImpl getInstance() {
        return instance;
    }

    public List<Teacher> getTeachers() {

        return teachers;
    }
}
