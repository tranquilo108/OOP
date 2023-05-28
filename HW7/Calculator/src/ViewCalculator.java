import java.util.Scanner;

/**
 * Класс ViewCalculator предназначен для перехвата пользовательского ввода,
 * создания объектов типа Calculable с помощью ICalculableFactory и вызова
 * методов объектов Calculable.
 */
public class ViewCalculator {
    private Scanner in = new Scanner(System.in);
    private ICalculableFactory calculableFactory;

    /**
     * Конструктор класса ViewCalculator принимается объект calculableFactory типа
     * ICalculableFactory для дальнейшего использования при создании объектов типа
     * Calculable.
     */
    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    /**
     * Метод запуска приложения, позволяющего производить вычисления с комплексными
     * числами.
     * Предназначен для получения ввода от пользователя и вывода результата.
     * Для работы с приложением пользователь должен вводить комплексные числа в
     * формате "Действительная_часть - Мнимая_часть"
     * На каждом шаге пользователь может ввести арифметическую операцию из списка
     * (+, -, *, /) либо выход,
     * в результате чего приложение выведет результат вычисления.
     * Если пользователю требуется продолжить вычисления, он может ввести "Y".
     */
    public void run() {

        System.out.println(
                "Для произведения вычислительных операций с комплексными числами вводить их как указано в примере\nПример: 5 - 1\nГде 5 это действительная часть, 1 это мнимая часть");
        while (true) {
            Calculable calculator = calculableFactory.create(parseReal("Введите первый аргумент: "), parseImaginary());
            while (true) {
                String cmd = prompt("Введите команду (*, /, +, =) : ");
                if (cmd.equals("*")) {
                    Calculable calculator2 = calculableFactory.create(parseReal("Введите второй аргумент: "),
                            parseImaginary());
                    calculator = calculator.multi(calculator2);
                    continue;
                }
                if (cmd.equals("/")) {
                    Calculable calculator2 = calculableFactory.create(parseReal("Введите второй аргумент: "),
                            parseImaginary());
                    calculator = calculator.division(calculator2);
                    continue;
                }
                if (cmd.equals("+")) {
                    Calculable calculator2 = calculableFactory.create(parseReal("Введите второй аргумент: "),
                            parseImaginary());
                    calculator = calculator.sum(calculator2);
                    continue;
                }
                if (cmd.equals("-")) {
                    Calculable calculator2 = calculableFactory.create(parseReal("Введите второй аргумент: "),
                            parseImaginary());
                    calculator = calculator.difference(calculator2);
                    continue;
                }
                if (cmd.equals("=")) {
                    System.out.println(calculator);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.toUpperCase().equals("Y")) {
                continue;
            }
            break;
        }
    }

    /**
     * Метод prompt() используется для вывода сообщения на экран и получения ответа
     * от пользователя. Возвращает строку, которую ввел пользователь.
     */
    private String prompt(String message) {
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * Метод parseReal() используется для парсинга вещественного числа, введенного
     * пользователем. Возвращает введенное пользователем значение.
     */
    private double parseReal(String message) {
        System.out.print(message);
        return in.nextDouble();
    }

    /**
     * Метод parseImaginary() используется для парсинга мнимой части числа,
     * введенной пользователем. Разделяет строку введенного значения и возвращает
     * число, соответствующее мнимой части. Если мнимая часть не указана, возвращает
     * 0.
     */
    private double parseImaginary() {
        String[] s = in.nextLine().split(" ");
        return s.length > 1 ? Double.parseDouble(s[1] + s[2]) : 0;
    }
}
