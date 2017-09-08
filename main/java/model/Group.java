package model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students = new ArrayList<Student>();
    private Student captain;

    public Group(String name) {
        this.name = name;
    }

    public Group addStudent(Student student) {
        students.add(student);
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getCaptain() {
        return captain;
    }

    public void setCaptain(Student captain) {
        this.captain = captain;
    }

    @Override
    public String toString() {
        return "Group " +
                name;
    }
}
