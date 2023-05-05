package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.Student;
import View.View;
import View.ViewEng;

/**
 * Класс, реализующий контроллер приложения, который обрабатывает ввод и вывод
 * данных приложения
 * и взаимодействует с моделью и отображением.
 */
public class Controller {
    /**
     * Хранит список студентов типа List.
     */
    private List<Student> students;
    /** Хранит представление типа iGetView. */
    private iGetView view;
    /**
     * Хранит модель типа iGetModel.
     */
    private iGetModel model;

    /**
     * Конструктор класса Controller, принимает объекты типов iGetView и iGetModel.
     * 
     * @param view  view объект типа iGetView
     * @param model model объект типа iGetModel
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    /**
     * Получает список всех студентов из модели.
     */
    public void getAllStudents() {
        students = model.getAllStudents();
    }

    /**
     * Проверяет наличие данных в списке студентов.
     * 
     * @return true - если список студентов не пустой, иначе false
     */
    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Обновляет View, получая новый список студентов из модели.
     */
    public void updateView() {
        // MVP
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            view.emptyList();
        }
    }

    /** Удаляет студента и обновляет список студентов в модели и файле */
    public void delete() {
        view.delete();
        view.resultOfDelete(model.delete());
    }

    /**
     * Запускает работу контроллера и приложения, и выполняет команды, введенные
     * пользователем.
     */
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        view.greeting();
        while (getNewIteration) {
            String command = view.prompt();
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    view.exit();
                    break;
                case LIST:
                    updateView();
                    break;
                case RU:
                    this.view = new View();
                    break;
                case ENG:
                    this.view = new ViewEng();
                    break;
                case HELP:
                    view.help();
                    break;
                case DELETE:
                    delete();
                    break;
                default:
                    break;
            }
        }
    }

}
