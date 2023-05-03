package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.User;
import StudentDomen.UserComparator;

/** Сервис для работы с учителями */
public class TeacherService<T extends User> implements iUserService<Teacher> {

    private int count;
    private String academicDegree;
    private List<Teacher> teachers;

    /** Конструктор класса TeacherService */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void setTeacher(T teacher) {
        teachers.add((Teacher) teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Метод для создания нового объекта Teacher
     * 
     * @param firstName      имя учителя
     * @param lastName       фамилия учителя
     * @param adress         адрес учителя
     * @param academicDegree ученая степень учителя
     * @param age            возраст учителя
     */
    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        Teacher teach = new Teacher(firstName, lastName, adress, academicDegree, age, count);
        count++;
        teachers.add(teach);
    }

    /** Метод для вывода списка учителей, отсортированных по полному имени */
    public void printSortedByFIOTeachers() {
        List<Teacher> teach = new ArrayList<Teacher>(teachers);
        teach.sort(new UserComparator<>());
        teach.forEach(el -> System.out.println(el));
    }

    /** Метод для вывода списка учителей без сортировки */
    public void printWithoutSortTeachers() {
        teachers.forEach(el -> System.out.println(el));
    }

}
