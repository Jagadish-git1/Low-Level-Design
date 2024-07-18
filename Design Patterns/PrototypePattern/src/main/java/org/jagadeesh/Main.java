package org.jagadeesh;

public class Main {
    public static void main(String[] args) {
        Student originalStudent = new Student(21, 21, "Jagadeesh");
        Student clonedStudent = (Student) originalStudent.clone();
        System.out.println(clonedStudent);
    }
}