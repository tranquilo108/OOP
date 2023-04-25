import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Vasyliy", "Alexandrov", "Barnaul", 22, 1);
        Student s2 = new Student("Victor", "Vasyllyev", "Barnaul", 21, 2);
        Student s3 = new Student("Vitalyi", "Genadiev", "Tomsk", 21, 3);
        Student s4 = new Student("Volfgan", "Drechsler", "Moscow", 34, 4);
        Student s5 = new Student("Vandar", "Elunov", "Moscow", 41, 6);
        Student s6 = new Student("Vyacheslav", "Georgiev", "Barnaul", 23, 7);
        Student s7 = new Student("Oleg", "Nerozya", "Arhangelsk", 38, 11);
        Student s8 = new Student("Stas", "Vasilyev", "Tomsk", 34, 15);
        Student s9 = new Student("Evgeniy", "Batikov", "Moscow", 37, 16);
        Student s10 = new Student("Irina", "Polzunova", "Tomsk", 34, 9);
        Student s11 = new Student("Veniamin", "Zaharov", "Barnaul", 42, 17);
        Student s12 = new Student("Alexander", "Alexandrov", "Barnaul", 43, 5);
        Student s13 = new Student("Ekaterina", "Smirnova", "Moscow", 23, 10);
        Student s14 = new Student("Mariya", "Zdanova", "Moscow", 31, 13);
        Student s15 = new Student("Olga", "Senchenko", "Moscow", 25, 19);
        Student s16 = new Student("Petr", "Pechkin", "Arhangelsk", 35, 14);
        Student s17 = new Student("Veniamin", "Zaharov", "Moscow", 32, 18);
        Student s18 = new Student("Veniamin", "Zaharov", "Arhangelsk", 24, 12);
        Student s19 = new Student("Veniamin", "Zaharov", "Moscow", 23, 8);
        List<Student> listStud1 = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();
        List<Student> listStud3 = new ArrayList<Student>();
        StudentGroup group1 = new StudentGroup(listStud1, 1);
        StudentGroup group2 = new StudentGroup(listStud2, 2);
        StudentGroup group3 = new StudentGroup(listStud3, 3);
        List<StudentGroup> listGroup = new ArrayList<>();
        StudentSteam steam1 = new StudentSteam(listGroup, 1);
        group1.addStudent(s1);
        group1.addStudent(s2);
        group1.addStudent(s3);
        group1.addStudent(s4);
        group1.addStudent(s5);
        group1.addStudent(s6);
        group1.addStudent(s7);
        group2.addStudent(s8);
        group2.addStudent(s9);
        group2.addStudent(s10);
        group2.addStudent(s11);
        group3.addStudent(s12);
        group3.addStudent(s13);
        group3.addStudent(s14);
        group3.addStudent(s15);
        group3.addStudent(s16);
        group3.addStudent(s17);
        group3.addStudent(s18);
        group3.addStudent(s19);
        listGroup.add(group1);
        listGroup.add(group2);
        listGroup.add(group3);
        System.out.println("************************************");
        System.out.println();
        System.out.println("********   До сортировки   *********");
        System.out.println();
        System.out.println("************************************");
        System.out.println(steam1);
        System.out.println("************************************");
        System.out.println();
        System.out.println("*******   После сортировки   *******");
        System.out.println();
        System.out.println("************************************");
        Collections.sort(steam1.getStudentsGroups());
        System.out.println(steam1);

    }
}
