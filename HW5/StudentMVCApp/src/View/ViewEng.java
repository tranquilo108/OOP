package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/** Класс для вывода информации в консоль на английском языке */
public class ViewEng implements iGetView {

    public void printAllStudents(List<Student> students) {
        System.out.println("Output of the list of students");
        students.forEach(el -> System.out.println(el));
        System.out.println("End of the list");
    }

    public String prompt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("To display the full list of commands, type HELP \nEnter the command: ");
        return sc.nextLine();
    }

    public void exit() {
        System.out.println("Exiting the program");
    }

    public void help() {
        System.out.println("RU - change the language to Russian \n" +
                "ENG - change the language to English \n" +
                "HELP - display all available commands \n" +
                "LIST - display the list on the screen \n" +
                "DELETE - delete a list item by id \n" +
                "EXIT - exiting the program ");
    }

    public void emptyList() {
        System.out.println("The list of students is empty");
    }

    @Override
    public void delete() {
        System.out.println("Enter the student ID to delete: ");
    }

    @Override
    public void resultOfDelete(boolean f) {
        System.out.println(f ? "The student was successfully removed from the list "
                : "A student with this ID was not found in the list ");
    }

    @Override
    public void greeting() {
        System.out.println("Выберите язык/Choice language: Введите RU - русский/Enter ENG - английский");
    }
}
