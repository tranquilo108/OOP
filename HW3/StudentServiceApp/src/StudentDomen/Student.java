package StudentDomen;

public class Student extends User implements Comparable<Student> {

    private long id;

    /**
     * Конструктор класса.
     *
     * @param firstName имя студента.
     * @param lastName  фамилия студента.
     * @param address   адрес студента.
     * @param age       возраст студента.
     * @param id        идентификатор студента.
     */
    public Student(String firstName, String lastName, String adress, int age, long id) {
        super(firstName, lastName, adress, age);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * Выводит информацию о студенте.
     * 
     * @return строка - имя, фамилия, адрес, возраст, идентификатор.
     */
    @Override
    public String toString() {
        return super.toString() + ", ID: " + id;
    }

    /**
     * Переопределённый метод для сравнения студентов сначала по возрасту потом по
     * идентификатору.
     * Переопределение производится для возможности использования сортировки.
     * 
     * @param o студент, с которым будет производиться сравнение.
     */
    @Override
    public int compareTo(Student o) {
        if (this.getAge() > o.getAge()) {
            return 1;
        } else if (this.getAge() < o.getAge()) {
            return -1;
        } else {
            if (this.id > o.id)
                return 1;
            else if (this.id < o.id)
                return -1;
            return 0;
        }
    }

    /**
     * Переопределенный метод equals() для сравнения объектов по имени и фамилии.
     * 
     * @param obj студент, с которым будет производиться сравнение.
     * @return true, если имена и фамилии студентов равны, и false - в противном
     *         случае.
     */
    @Override
    public boolean equals(Object obj) {
        Student t = (Student) obj;
        return t.getFirstName() == this.getFirstName() && this.getLastName() == t.getLastName();
    }
}
