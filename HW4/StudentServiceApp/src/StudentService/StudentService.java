package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.UserComparator;

/** Сервис для работы со студентами */
public class StudentService implements iUserService<Student> {

    private long countStudents = 0;
    private List<Student> students = new ArrayList<>();

    /**
     * Конструктор класса StudentService
     */
    public StudentService() {
        this.countStudents = countStudents;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public long getCount() {
        return countStudents;
    }

    public void setCount(int councountStudentst) {
        this.countStudents = countStudents;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAll() {
        return students;
    }

    /**
     * Метод для создания нового объекта Student
     * 
     * @param firstName имя студента
     * @param lastName  фамилия студента
     * @param adress    адрес студента
     * @param age       возраст студента
     */
    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        Student per = new Student(firstName, lastName, adress, age, countStudents);
        // if(!(students.indexOf(per) != -1) && !students.isEmpty()){
        countStudents++;
        students.add(per);
    }

    /**
     * Метод для получения списка студентов, отсортированных по полному имени
     * 
     * @return список объектов Student, отсортированный по полному имени
     */
    public List<Student> getSortedByFIOStudentGroup() {
        List<Student> stu = new ArrayList<Student>(students);
        stu.sort(new UserComparator<>());
        return stu;
    }
}
