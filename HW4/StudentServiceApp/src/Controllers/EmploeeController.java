package Controllers;

import StudentDomen.Emploee;
import StudentService.EmploeeService;
import StudentService.iUser;

/**
 * Класс для управления сервисом работников
 */
public class EmploeeController implements iUserController<Emploee> {
    
    private final EmploeeService empService = new EmploeeService();

    /**
     * Создает нового работника
     * 
     * @param firstName Имя работника
     * @param lastName  Фамилия работника
     * @param adress    Адрес работника
     * @param age       Возраст работника
     */
    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        empService.create(firstName, lastName, adress, age);
    }

    /**
     * Выдаёт зарплату
     * 
     * @param <T>    Тип работника
     * @param person Работник, которому необходимо выдать зарплату
     */
    static public <T extends Emploee> void paySalary(T person) {
        System.out.println(((iUser) person).getFirstName() + " " + ((iUser) person).getLastName()
                + " за добростовестно выполненную работу получил заработную плату в размере 100.000.000 долларов США");
    }

    /**
     * Вычисляет среднее значение числового массива
     * 
     * @param <T> Тип числа
     * @param num Массив чисел
     * @return Среднее значение массива чисел
     */
    public static <T extends Number> Double mean(T[] num) {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
}
