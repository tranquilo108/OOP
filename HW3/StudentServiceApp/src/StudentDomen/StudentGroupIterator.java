package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;

    /**
     * Конструктор класса.
     * 
     * @param students группа студентов, которую будем перебирать.
     */
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    /**
     * Метод проверяет наличие следующего элемента в списке студентов.
     * 
     * @return true, если есть следующий элемент, false - в противном случае.
     */
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    /**
     * Метод перебирает следующий элемент из списка студентов.
     * 
     * @return следующий элемент списка студентов.
     */
    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return students.get(counter++);
    }
}
