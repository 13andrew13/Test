package DAO;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentDAOImpl implements StudentDAO {
    private List<Student> students = new ArrayList<Student>();

    private static StudentDAOImpl instance = new StudentDAOImpl();

    public StudentDAOImpl(){
        Random random = new Random();
        for(int i  = 0;i<100;i++){
            Student student = new Student("name" + i, "surname" + i, random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10));
            students.add(student);
        }

    }

    public static StudentDAOImpl getInstance() {
        return instance;
    }

    public List<Student> getStudents() {


        return students;
    }
}
