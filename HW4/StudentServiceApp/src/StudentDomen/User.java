package StudentDomen;

import StudentService.iUser;

public class User<T> implements iUser {

    protected String firstName;
    protected String lastName;
    protected String adress;
    protected int age;
    protected long id;

    /**
     * Конструктор, создающий новый объект пользователя с заданными значениями
     * полей.
     * 
     * @param firstName Имя пользователя.
     * @param lastName  Фамилия пользователя.
     * @param adress    Адрес пользователя.
     * @param age       Возраст пользователя.
     */
    public User(String firstName, String lastName, String adress, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.age = age;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Возвращает строковое представление объекта, содержащее информацию об имени,
     * фамилии, адресе и возрасте пользователя.
     * 
     * @return Строковое представление объекта.
     */
    @Override
    public String toString() {
        return String.format("firstName: %s, lastName: %s, adress: %s, age: %d", firstName, lastName, adress, age);
    }
}
