package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.iGetModel;

/** Класс ModelHM реализует интерфейс iGetModel и хранит список студентов. */
public class ModelHM implements iGetModel {
    /**
     * Хранит список студентов типа HashMap<Integer, Student>
     */
    private HashMap<Integer, Student> students;

    /**
     * Конструктор класса ModelHM инициализирует его передаваемым списком
     * студентов.
     * 
     * @param students список студентов типа List<Student>.
     */
    public ModelHM(List<Student> students) {
        HashMap<Integer, Student> hm = new HashMap<>();
        students.forEach(el -> hm.put((int) el.getStudentID(), el));
        this.students = hm;
    }

    public List<Student> getAllStudents() {
        List<Student> ls = new ArrayList<>();
        this.students.values().forEach(el -> ls.add(el));
        return ls;
    }

    @Override
    public boolean delete() {
        boolean f = false;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (this.students.keySet().contains(n)) {
            this.students.remove(n);
            f = true;
        }
        return f;
    }

}
