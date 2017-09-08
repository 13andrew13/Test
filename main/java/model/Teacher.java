package model;

public class Teacher {
    private String name;
    private String surname;
    private String subject;

    public Teacher(String name, String surname, String subject) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
    }


    @Override
    public String toString() {
        return name + surname + " subject-" + subject;
    }
}
