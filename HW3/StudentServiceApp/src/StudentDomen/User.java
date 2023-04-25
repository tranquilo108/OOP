package StudentDomen;

public class User {
    private String firstName;
    private String lastName;
    private String adress;
    private int age;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
