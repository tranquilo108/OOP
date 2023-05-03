package StudentDomen;

import java.util.Comparator;

import StudentService.iUser;

/**
 * Класс, реализующий интерфейс компаратора для сравнения объектов типа iUser.
 */
public class UserComparator<T extends iUser> implements Comparator<T> {
    /**
     * Объекты сравниваются по полю firstName, а в случае совпадения - по полю
     * lastName.
     */
    @Override
    public int compare(T o1, T o2) {
        int resultComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultComparing == 0) {
            resultComparing = o1.getLastName().compareTo(o2.getLastName());
            return resultComparing;
        } else {
            return resultComparing;
        }
    }

}