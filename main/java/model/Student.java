package model;

public class Student {
    private String name;
    private String surname;
    private Group group;

    private int hardWorking;
    private int responsibility;
    private int activity;
    private int success;


    public Student(String name, String surname, Group group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public Student(String name, String surname, int hardWorking, int responsibility, int activity, int success) {
        this.name = name;
        this.surname = surname;

        this.hardWorking = hardWorking;
        this.responsibility = responsibility;
        this.activity = activity;
        this.success = success;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getHard_working() {
        return hardWorking;
    }

    public int getResponsibility() {
        return responsibility;
    }

    public int getActivity() {
        return activity;
    }

    public int getSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return name + " " + surname;

    }
}
