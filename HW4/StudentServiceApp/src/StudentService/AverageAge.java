package StudentService;

import java.util.List;
import StudentDomen.User;

/** Класс, вычисляющий средний возраст пользователей */
public class AverageAge<T extends User> {

    private List<T> list;

    public AverageAge(List<T> list) {
        this.list = list;
    }

    /** Метод, вычисляющий средний возраст пользователей в списке list */
    public double avgAge() {
        double sum = 0;
        for (T t : list) {
            sum += t.getAge();
        }
        return sum / (double) list.size();
    }
}
