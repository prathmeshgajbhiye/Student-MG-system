package com.example.sms;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = scanner.next();

                    System.out.print("Enter Admission Year: ");
                    int year = scanner.nextInt();

                    Student student = new Student();
                    student.setName(name);
                    student.setAdmissionYear(year);

                    studentDao.saveStudent(student);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    studentDao.getAllStudents().forEach(s -> {
                        System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", Year: " + s.getAdmissionYear());
                    });
                    break;

                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    int id = scanner.nextInt();
                    studentDao.deleteStudent(id);
                    System.out.println("Student deleted successfully!");
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
