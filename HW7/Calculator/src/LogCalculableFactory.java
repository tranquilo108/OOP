/**
 * Класс LogCalculableFactory реализует интерфейс ICalculableFactory для
 * создания объектов типа Calculable c логгированием действий над объектами типа
 * Calculable.
 */
public class LogCalculableFactory implements ICalculableFactory {
    private Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    /**
     * @param logger интерфейс, позволяющий логгировать действия в методе create
     *               создает новый объект типа LogCalculator с объектом типа
     *               Calculator и объектом логгера.
     * 
     * @return объект типа Calculable с объектом типа LogCalculator, который
     *         содержит объект типа Calculator для работы с комплексными числами и
     *         объект логгера для сохранения действий.
     */
    @Override
    public Calculable create(double real, double imaginary) {
        return new LogCalculator(new Calculator(real, imaginary), logger);
    }
}
