package Controller;

import java.util.List;

import Model.Student;
/** Интерфейс с методами: printAllStudents(List<Student> students), prompt(), help(), exit(), emptyList(), delete(), resultOfDelete(boolean f), greeting() которые реализованы в классах типа View*/
public interface iGetView {
    /**
     * Метод выводит список студентов на консоль, принимая список студентов List<> в качестве параметра
     * List<>
     */
    void printAllStudents(List<Student> students);
    /**Метод приглашает пользователя ввести команду и возвращает строку с командой. */
    String prompt();
    /**Метод отображает все доступные команды в консоль. */
    void help();
    /**Метод приглашает пользователя ввести команду и возвращает строку с командой. */
    void exit();
    /**Метод отображает сообщение о пустом списке студентов. */
    void emptyList();
    /**Метод запрашивает у пользователя ввод ID студента для удаления. */
    void delete();
    /**Метод отображает результат операции удаления студента из списка. */
    void resultOfDelete(boolean f);
    /**Метод приглашает пользователя выбрать язык. */
    void greeting();
}
