package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.User;
import StudentDomen.UserComparator;

/**
 * Класс, представляющий сервис для работы с объектами типа Emploee.
 * 
 * @param <T> - тип объекта для работы с сервисом.
 */
public class EmploeeService<T extends User> implements iUserService<Emploee> {

    private int count;
    private List<Emploee> emploees;

    /**
     * Конструктор класса EmploeeService. Создает новый ArrayList для хранения
     * объектов Emploee.
     */
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Emploee> getEmploees() {
        return emploees;
    }

    public void setEmploees(List<Emploee> emploees) {
        this.emploees = emploees;
    }

    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    /**
     * Создает новый объект Emploee и добавляет его в список объектов Emploee.
     * 
     * @param firstName  - имя нового объекта Emploee.
     * @param secondName - фамилия нового объекта Emploee.
     * @param adress     - адрес нового объекта Emploee.
     * @param age        - возраст нового объекта Emploee.
     */
    @Override
    public void create(String firstName, String secondName, String adress, int age) {
        Emploee per = new Emploee(firstName, secondName, adress, age, count);
        count++;
        emploees.add(per);
    }

    /**
     * Возвращает отсортированный по ФИО список объектов Emploee.
     * 
     * @param numberGroup - номер группы сотрудников.
     * @return - отсортированный по ФИО список объектов Emploee.
     */
    public List<Emploee> getSortedByFIOEmploees(int numberGroup) {
        List<Emploee> emp = new ArrayList<Emploee>(emploees);
        emp.sort(new UserComparator<>());
        return emp;
    }
}
