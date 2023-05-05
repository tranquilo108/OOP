package Controller;

import java.util.List;

import Model.Student;
/** Интерфейс с методами getAllStudents(), delete() которые реализованы в классах типа Model*/
public interface iGetModel {
    /**
     * Метод getAllStudents() возвращает список всех студентов, находящихся в списке students
     * @return список всех студентов, находящихся в списке students
     */
    public List<Student> getAllStudents();
    /**
     * Метод запрашивает у пользователя ввод ID студента для удаления и удаляет его в случае если он его находит. 
     * @return  возвращает true при успешном удалении студента и false, если указанный студент не найден
     */
    public boolean delete();
}
