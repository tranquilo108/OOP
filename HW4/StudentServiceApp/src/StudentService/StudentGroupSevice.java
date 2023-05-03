package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

/** Сервис для работы с группами студентов */
public class StudentGroupSevice {

    private List<StudentGroup> groups;

    /**
     * Конструктор по умолчанию инициализирует поле groups новым пустым списком.
     */
    public StudentGroupSevice() {
        this.groups = new ArrayList<StudentGroup>();
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    /**
     * Метод для получения отсортированного по ФИО списка студентов для заданной
     * группы.
     * 
     * @param numberGroup Номер группы в списке groups.
     * @return Отсортированный список объектов Student.
     */
    public List<Student> getSortedByFIOStudentGroup(int numberGroup) {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
