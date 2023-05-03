package StudentService;

/** Интерфейс, описывающий модель пользователя с основными характеристиками. */
public interface iUser {

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getAdress();

    void setAdress(String adress);

    int getAge();

    void setAge(int age);

    long getId();

    void setId(long id);

}