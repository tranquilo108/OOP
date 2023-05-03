package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;
/** Класс контроллера для управления сервисом, отвечающим за данные о преподавателях */
public class TeacherController  implements iUserController<Teacher>{
    
    private final TeacherService teachService = new TeacherService();
    /**
     * Создает нового учителя
     * 
     * @param firstName Имя учителя
     * @param lastName  Фамилия учителя
     * @param adress    Адрес учителя
     * @param age       Возраст учителя
     */
    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        teachService.create(firstName, lastName, adress, age);
    }
    
}
