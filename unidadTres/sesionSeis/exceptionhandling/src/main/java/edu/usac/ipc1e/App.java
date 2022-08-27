package edu.usac.ipc1e;

import edu.usac.ipc1e.Student.Student;
import edu.usac.ipc1e.Student.StudentNotFound;

/**
 * Este proyecto ejemplifica el uso de excepciones personalizadas
 */
public class App {

    public static Student[] students = new Student[2];

    public static void main(String[] args) {
        students[0] = new Student(201602782, "Sergio", "Otzoy");
        students[1] = new Student(201602783, "Fernando", "Gonzalez");

        App app = new App();
        app.findStudent("Melissa");
    }

    public Student findStudent(String name) throws StudentNotFound {
        for (Student student : App.students) {
            if(student.getName().equals(name)) {
                return student;
            }
        }
        throw new StudentNotFound(String.format("No se encontró al estudiante con nombre %s", name));
    }
}
