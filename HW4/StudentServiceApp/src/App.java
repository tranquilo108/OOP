import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentService.AverageAge;
import StudentService.StudentService;
import StudentService.TeacherService;

/**
 * Класс App создает несколько объектов классов Student -> StudentGroup ->
 * StudentStream,
 * заполняет их данными и добавляет в связанные списки. Затем они добавляются в
 * список объектов StudentSteam.
 * В методе main происходит сортировка объектов StudentGroup внутри объекта
 * StudentStream методом
 * Collections.sort() по их номеру, после чего отсортированные объекты
 * StudentGroup выводятся на экран.
 */
public class App {
    public static void main(String[] args) {

        StudentService stService1 = new StudentService();
        StudentService stService2 = new StudentService();
        StudentService stService3 = new StudentService();

        stService1.create("asd", "aasdsd", "asdas", 12);
        stService1.create("Vasyliy", "Alexandrov", "Barnaul", 22);
        stService1.create("Victor", "Vasyllyev", "Barnaul", 21);
        stService1.create("Vitalyi", "Genadiev", "Tomsk", 21);
        stService2.create("Volfgan", "Drechsler", "Moscow", 34);
        stService2.create("Vandar", "Elunov", "Moscow", 41);
        stService2.create("Vyacheslav", "Georgiev", "Barnaul", 23);
        stService2.create("Oleg", "Nerozya", "Arhangelsk", 38);
        stService2.create("Stas", "Vasilyev", "Tomsk", 34);
        stService2.create("Evgeniy", "Batikov", "Moscow", 37);
        stService2.create("Irina", "Polzunova", "Tomsk", 34);
        stService2.create("Veniamin", "Zaharov", "Barnaul", 42);
        stService2.create("Alexander", "Alexandrov", "Barnaul", 43);
        stService3.create("Ekaterina", "Smirnova", "Moscow", 23);
        stService3.create("Mariya", "Zdanova", "Moscow", 31);
        stService3.create("Olga", "Senchenko", "Moscow", 25);
        stService3.create("Petr", "Pechkin", "Arhangelsk", 35);
        stService3.create("Veniamin", "Zaharov", "Moscow", 32);
        stService3.create("Veniamin", "Zaharov", "Arhangelsk", 24);
        stService3.create("Veniamin", "Zaharov", "Moscow", 23);
        stService3.create("Jesse", "Pinkman", "Albukerque", 31);

        StudentGroup group1 = new StudentGroup(stService1.getStudents(), 1);
        StudentGroup group2 = new StudentGroup(stService2.getStudents(), 2);
        StudentGroup group3 = new StudentGroup(stService3.getStudents(), 3);

        List<StudentGroup> listGroup = new ArrayList<>();
        listGroup.add(group1);
        listGroup.add(group2);
        listGroup.add(group3);

        StudentSteam steam1 = new StudentSteam(listGroup, 1);

        System.out.println();
        System.out.println("********   До сортировки   *********");
        System.out.println();
        System.out.println(steam1);
        System.out.println();
        System.out.println("*******   После сортировки   *******");
        System.out.println();
        Collections.sort(steam1.getStudentsGroups());
        System.out.println(steam1);

        AverageAge avg1 = new AverageAge<>(group1.getStudents());
        AverageAge avg2 = new AverageAge<>(group2.getStudents());
        AverageAge avg3 = new AverageAge<>(group3.getStudents());
        System.out.println("Средний возраст группы 1: " + avg1.avgAge());
        System.out.println("Средний возраст группы 2: " + avg2.avgAge());
        System.out.println("Средний возраст группы 3: " + avg3.avgAge());

        TeacherService teachers = new TeacherService();
        teachers.create("Petr", "Ivanov", "Sochi", 65);
        teachers.create("Alexey", "Petrov", "new-York", 35);
        teachers.create("Walter", "White", "Albukerque", 55);
        System.out.println();
        System.out.println("********   До сортировки   *********");
        System.out.println();
        teachers.printWithoutSortTeachers();
        System.out.println();
        System.out.println("*******   После сортировки   *******");
        System.out.println();
        teachers.printSortedByFIOTeachers();

    }
}
