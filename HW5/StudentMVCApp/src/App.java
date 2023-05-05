import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;
import Model.ModelHM;
import Model.Student;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> students1 = new ArrayList<Student>();
        Student s1 = new Student("asd", "aasdsd", 22, 1);
        Student s2 = new Student("Vasyliy", "Alexandrov", 23, 2);
        Student s3 = new Student("Victor", "Vasyllyev", 33, 3);
        Student s4 = new Student("Vitalyi", "Genadiev", 32, 4);
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);
        students1.add(s4);

        List<Student> students2 = new ArrayList<Student>();
        Student s5 = new Student("Andrey", "Neefyodov", 32, 5);
        Student s6 = new Student("Stanislav", "Potrepaylo", 33, 6);
        Student s7 = new Student("Georgiy", "Syrodelov", 32, 7);
        Student s8 = new Student("Konstantin", "Korolyov", 34, 8);
        students2.add(s5);
        students2.add(s6);
        students2.add(s7);
        students2.add(s8);

        FileRepo mFileRepo = new FileRepo("C:\\Projects\\GB\\Java[GB]\\OOP\\HW5\\StudentMVCApp\\StudentDB.txt");// Не
                                                                                                                // смог
                                                                                                                // разобраться
                                                                                                                // почему
                                                                                                                // приходится
                                                                                                                // прописывать
                                                                                                                // полный
                                                                                                                // путь
                                                                                                                // до
                                                                                                                // файла.
                                                                                                                // Видимо
                                                                                                                // дело
                                                                                                                // в
                                                                                                                // настройках
                                                                                                                // VSCode
        // students.forEach(el -> mFileRepo.addStudent(el));
        // for (Student student : students) {
        // mFileRepo.addStudent(student);
        // }
        // mFileRepo.saveAllStudentsToFile();

        iGetModel model = new Model(students1);
        iGetModel mh = new ModelHM(students2);
        iGetModel modeFileRepo = mFileRepo;

        iGetView view = new View();
        Controller control = new Controller(view, model);
        control.run();
    }
}
