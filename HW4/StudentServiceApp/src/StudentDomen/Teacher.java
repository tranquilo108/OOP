package StudentDomen;

import java.util.List;

public class Teacher<T extends User> extends User {

    private int teacherId;
    private String academicDegree;

    /**
     * Конструктор класса.
     *
     * @param firstName имя учителя.
     * @param lastName  фамилия учителя.
     * @param address   адрес учителя.
     * @param level     учёная степень учителя.
     * @param age       возраст учителя.
     * @param teacherId идентификатор учителя.
     */
    public Teacher(String firstName, String lastName, String adress, String academicDegree, int age, int teacherId) {
        super(firstName, lastName, adress, age);
        this.academicDegree = academicDegree;
        this.teacherId = teacherId;
    }

    public int getAge() {
        return super.getAge();
    }

    public int getteacherId() {
        return teacherId;
    }

    public void setteacher(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setcAdemicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    /**
     * Выводит информацию о учителе.
     * 
     * @return строка - имя, фамилия, адрес, возраст, идентификатор.
     */
    @Override
    public String toString() {
        return super.toString() + ", ID: " + teacherId;
    }

}
