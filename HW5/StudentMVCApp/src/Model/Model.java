package Model;

import java.util.List;
import java.util.Scanner;

import Controller.iGetModel;
/**Класс Model реализует интерфейс iGetModel и хранит список студентов. */
public class Model implements iGetModel{
    /**
    * Хранит список студентов типа List<Student>
    */
    private List<Student> students;
    /**
     * Конструктор класса Model инициализирует его передаваемым списком
     * студентов.
     * @param students список студентов типа List<Student>.
     */
    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents(){
        return students;
    }

    @Override
    public boolean delete() {
        boolean f = false;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < this.students.size(); i++) {
            if(this.students.get(i).getStudentID() == n){
                this.students.remove(i);
                f = true;
            }
        }
        return f;
    }
}
