package Controllers;

import StudentService.iUser;

/** Класс-интерфейс для контроллера, управляющего сервисом пользователей. */
public interface iUserController<T extends iUser> {
    /**
     * Создает нового пользователя
     * 
     * @param firstName Имя пользователя
     * @param lastName  Фамилия пользователя
     * @param adress    Адрес пользователя
     * @param age       Возраст пользователя
     */
    void create(String firstName, String lastName, String adress, int age);
}
