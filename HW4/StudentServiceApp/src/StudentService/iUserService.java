package StudentService;

import java.util.List;

/** Интерфейс описывающий сервис для работы с пользователями. */
public interface iUserService<T> {

    List<T> getAll();

    /**
     * Создает нового пользователя.
     *
     * @param firstName имя пользователя.
     * @param lastName  фамилия пользователя.
     * @param adress    адрес пользователя.
     * @param age       возраст пользователя.
     */
    void create(String firstName, String lastName, String adress, int age);
}
