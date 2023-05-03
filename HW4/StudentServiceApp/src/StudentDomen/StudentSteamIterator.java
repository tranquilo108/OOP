package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> studentsGroup;

    /**
     * Конструктор класса.
     * 
     * @param studentsGroup группы которые будем перебирать.
     */
    public StudentSteamIterator(List<StudentGroup> studentsGroup) {
        this.studentsGroup = studentsGroup;
        this.counter = 0;
    }

    /**
     * Метод проверяет наличие следующего элемента в списке групп.
     * 
     * @return true, если есть следующий элемент, false - в противном случае.
     */
    @Override
    public boolean hasNext() {
        return counter < studentsGroup.size();
    }

    /**
     * Метод перебирает следующий элемент из списка групп.
     * 
     * @return следующий элемент списка групп.
     */
    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        return studentsGroup.get(counter++);
    }
}