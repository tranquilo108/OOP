package Controllers;

import StudentDomen.Student;
import StudentService.StudentGroupSevice;
import StudentService.StudentService;

/** Класс-контроллер для управления сервисом студентов */
public class iStudentController implements iUserController<Student> {

    private final StudentService dataService = new StudentService();

    /** Сервис для работы со студенческими группами */
    private final StudentGroupSevice groupSevice = new StudentGroupSevice();

    /**
     * Создает нового студента
     * 
     * @param firstName Имя студента
     * @param lastName  Фамилия студента
     * @param adress    Адрес студента
     * @param age       Возраст студента
     */
    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        dataService.create(firstName, lastName, adress, age);
    }

}
