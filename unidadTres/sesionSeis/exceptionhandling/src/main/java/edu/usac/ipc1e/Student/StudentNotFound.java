package edu.usac.ipc1e.Student;

public class StudentNotFound extends RuntimeException{

    public StudentNotFound(String message) {
        super(message);
    }

    public StudentNotFound(String message, Throwable cause) {
        super(message, cause);
    }
    
}
