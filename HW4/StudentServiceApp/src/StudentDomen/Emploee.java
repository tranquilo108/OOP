package StudentDomen;

public class Emploee<T extends User> extends User {
    
    private int empId;

    /**
     * Конструктор класса работник
     * 
     * @param firstName Имя работника
     * @param lastName  Фамилия работника
     * @param adress    Адрес работника
     * @param age       Возраст работника
     * @param empId     Идентификатор работника
     */
    public Emploee(String firstName, String lastName, String adress, int age, int empId) {
        super(firstName, lastName, adress, age);
        this.empId = empId;
    }

    /**
     * 
     * @return Идентификатор работника
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * 
     * @param empId Идентификатор работника
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

}
