package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    /**
     * Возвращает строку с номером потока, количество групп и список студентов с
     * указанием идентификатора группы
     */
    @Override
    public String toString() {
        return String.format("ID of steam: %d", this.numberOfSteam) + "\n" + printGroup();
    }

    private int numberOfSteam;

    public int getNumberOfSteam() {
        return numberOfSteam;
    }

    public void setNumberOfSteam(int numberOfSteam) {
        this.numberOfSteam = numberOfSteam;
    }

    public List<StudentGroup> getStudentsGroups() {
        return studentsGroups;
    }

    public void setStudentsGroups(List<StudentGroup> studentsGroups) {
        this.studentsGroups = studentsGroups;
    }

    private List<StudentGroup> studentsGroups;

    /**
     * Конструктор, создающий новый объект потока студентов с заданными значениями
     * полей.
     * 
     * @param studentsGroups Группа студентов.
     * @param numberOfSteam  Идентификатор потока.
     */
    public StudentSteam(List<StudentGroup> studentsGroups, int numberOfSteam) {
        this.studentsGroups = studentsGroups;
        this.numberOfSteam = numberOfSteam;
    }

    /**
     * Метод возвращает новый объект итератора типа StudentSteamIterator,
     * который принимает список групп студентов
     * 
     * @param studentsGroups Группа студентов
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentSteamIterator(studentsGroups);
    }

    /**
     * Возвращает строку с номером потока, количество групп и
     * список студентов с указанием идентификатора группы
     */
    public String printGroup() {
        String s = "";
        for (StudentGroup group : studentsGroups) {
            s += group + "\n";
        }
        return s;
    }

}
