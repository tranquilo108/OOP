package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.iGetModel;

/**
 * Класс, реализующий интерфейс iGetModel, для работы с данными студентов из
 * файла.
 */
public class FileRepo implements iGetModel {
    /**
     * Хранит имя файла с данными студентов.
     */
    private String fileName;
    /**
     * Хранит список студентов типа List<Student>.
     */
    private List<Student> students;

    /**
     * Конструктор класса FileRepo инициализирует его именем файла.
     * 
     * @param fileName имя файла, через который будут происходить операции
     *                 ввода-вывода.
     */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Добавляет переданный объект Student в список студентов.
     * 
     * @param student новый студент типа Student.
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }

    /**
     * Читает список всех студентов из файла fileName и добавляет их в список
     * students.
     */
    public void readAllStudentsFromFile() {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                Boolean f = true;
                for (Student s : students) {
                    if (s.getStudentID() == pers.getStudentID()) {
                        f = false;
                    }
                }
                if (f) {
                    students.add(pers);
                }

                line = reader.readLine();
            }
            reader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Сохраняет список всех студентов из списка students в файл fileName.
     */
    public void saveAllStudentsToFile() {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for (Student s : students) {
                fw.write(s.getFirstName() + " " + s.getSecondName() + " " + s.getAge() + " " + s.getStudentID());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        readAllStudentsFromFile();
        return students;
    }

    @Override
    public boolean delete() {
        boolean f = false;
        List<Student> st = getAllStudents();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).getStudentID() == n) {
                st.remove(i);
                f = true;
            }
        }
        if (f) {
            try (FileWriter fw = new FileWriter(fileName, false)) {
                for (Student s : students) {
                    fw.write(s.getFirstName() + " " + s.getSecondName() + " " + s.getAge() + " " + s.getStudentID());
                    fw.append('\n');
                }
                fw.flush();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return f;
    }
}
