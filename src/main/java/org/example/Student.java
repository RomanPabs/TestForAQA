package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    String name;
    int age;
    int[] grades;

    public Student(String name, int age, int[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

        public static double getAvgGrades(int[] grades) {
            int sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum = sum + grades[i];
            }
            double average = (double) sum / grades.length;
            return average;
        }
        public static void main(String[] args) {

            Student student1 = new Student("Ivan", 22, new int[] {5, 4, 4});
            Student student2 = new Student("Petr", 23, new int[] {4, 3, 4});
            Student student3 = new Student("Oleg", 23, new int[] {3, 3, 5});

            double avg1 = getAvgGrades(student1.grades);
            double avg2 = getAvgGrades(student2.grades);
            double avg3 = getAvgGrades(student3.grades);

            System.out.println("Средний балл " + student1.name + ": " + avg1);
            System.out.println("Средний балл " + student2.name + ": " + avg2);
            System.out.println("Средний балл " + student3.name + ": " + avg3);

            ArrayList<Student> students = new ArrayList<>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            System.out.println("Студенты со средним баллом больше 4.1: ");

            for (Student student : students) {
                double avg = student.getAvgGrades(student.grades);
                if (avg > 4.1) {
                    System.out.println(student.name + " — средний балл: " + avg);
                }
            }
            }
        }







