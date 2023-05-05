package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/** Класс для вывода информации в консоль на русском языке */
public class View implements iGetView {
    public void printAllStudents(List<Student> students) {
        System.out.println("Вывод списка студентов");
        students.forEach(el -> System.out.println(el));
        System.out.println("Конец списка");
    }

    public String prompt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для отображения полного списка команд введите HELP\nВведите команду: ");
        return sc.nextLine();
    }

    public void exit() {
        System.out.println("Выход из программы");
    }

    public void help() {
        System.out.println("RU - сменить язык на русский \n" +
                "ENG - сменить язык на английский \n" +
                "HELP - отобразить все доступные команды \n" +
                "LIST - вывести список на экран \n" +
                "DELETE - удалить элемент списка по идентификатору \n" +
                "EXIT - выход из программы ");
    }

    public void emptyList() {
        System.out.println("Список студентов пуст");
    }

    @Override
    public void delete() {
        System.out.println("Введите идентификатор студента для удаления: ");
    }

    @Override
    public void resultOfDelete(boolean f) {
        System.out.println(
                f ? "Студент успешно удалён из списка " : "Студент с таким идентификатором не найден в списке ");
    }

    @Override
    public void greeting() {
        System.out.println("Выберите язык/Choice language: Введите RU - русский/Enter ENG - английский");
    }

}
