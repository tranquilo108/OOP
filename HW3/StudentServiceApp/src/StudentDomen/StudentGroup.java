package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    int groupId;

    /**
     * Конструктор, создающий новый объект группы студентов с заданными значениями
     * полей.
     * 
     * @param students      Студенты.
     * @param numberOfSteam Идентификатор группы.
     */
    public StudentGroup(List<Student> students, int groupId) {
        this.students = students;
        this.groupId = groupId;
    }

    /**
     * @return строка с номером группы, количество студентов в группе и список
     *         студентов
     */
    @Override
    public String toString() {
        return String.format("ID of group: %d \nNumber of students in group: %s \nStudents: \n", this.groupId,
                this.getStudents().size()) + printStudents();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Метод возвращает новый объект итератора типа StudentGroupIterator,
     * который принимает список студентов studentsGroups в качестве параметра.
     * 
     * @param students Студенты.
     */
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this.students);
    }

    /**
     * Переопределение метода сравнения для сортировки сначала по размеру группы
     * потом по идентификатору
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.getStudents().size() > o.getStudents().size()) {
            return 1;
        } else if (this.getStudents().size() < o.getStudents().size()) {
            return -1;
        } else {
            if (this.groupId > o.groupId) {
                return 1;
            } else if (this.groupId < o.groupId) {
                return -1;
            }
            return 0;
        }

    }

    /**
     * @return строку со списком студентов
     */
    public String printStudents() {
        String s = "";
        for (Student student : students) {
            s += student + "\n";
        }
        return s;
    }

    /**
     * Метод для добавления студента в список студентов. Проверяет есть ли такой
     * студент
     * в списке и если такого нет то добавляет
     * 
     * @param student Студент которого будем добавлять
     */
    public void addStudent(Student student) {
        if (!(this.students.indexOf(student) != -1))
            this.students.add(student);
    }

}
