package edu.usac.ipc1e.Student;

public class Student {
    private int id;
    private String name;
    private String lastName;

    public Student(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
