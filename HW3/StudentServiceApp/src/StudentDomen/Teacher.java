package StudentDomen;

public class Teacher extends User {
    private long id;

    /**
     * Конструктор класса.
     *
     * @param firstName имя учителя.
     * @param lastName  фамилия учителя.
     * @param address   адрес учителя.
     * @param age       возраст учителя.
     * @param id        идентификатор учителя.
     */
    public Teacher(String firstName, String lastName, String adress, int age, long id) {
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
     * Выводит информацию о учителе.
     * 
     * @return строка - имя, фамилия, адрес, возраст, идентификатор.
     */
    @Override
    public String toString() {
        return super.toString() + ", ID: " + id;
    }

}
