/**
 * Класс LogCalculator реализует интерфейс Calculable и интерфейс Loggable, для
 * логгирования действий,
 * произведенных над объектами класса Calculable.
 */
public class LogCalculator implements Calculable {
    private Calculable decorated;
    private Loggable logger;

    /**
     * Конструктор класса LogCalculator принимает обьект decorated типа Calculable,
     * который содержит объект, над которым будет производиться операция, и объект
     * logger типа Loggable, который определяет, какие действия будут логгироваться.
     */
    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public Calculable sum(Calculable arg) {
        String firstArg = decorated.toString();
        if (decorated.getImaginary() == 0) {
            firstArg = String.valueOf(decorated.getReal());
        }
        logger.log(firstArg);
        Calculable result = decorated.sum(arg);
        logger.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    @Override
    public Calculable multi(Calculable arg) {
        String firstArg = decorated.toString();
        if (decorated.getImaginary() == 0) {
            firstArg = String.valueOf(decorated.getReal());
        }
        logger.log(firstArg);
        Calculable result = decorated.multi(arg);
        logger.log(String.format("Вызов метода multi произошел"));
        return result;
    }

    /** метод getResult возвращает строковое представление объекта decorated */
    public String getResult() {
        String result = decorated.toString();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }

    @Override
    public Calculable difference(Calculable arg) {
        String firstArg = decorated.toString();
        if (decorated.getImaginary() == 0) {
            firstArg = String.valueOf(decorated.getReal());
        }
        logger.log(firstArg);
        Calculable result = decorated.difference(arg);
        logger.log(String.format("Вызов метода difference произошел"));
        return result;
    }

    @Override
    public Calculable division(Calculable arg) {
        String firstArg = decorated.toString();
        if (decorated.getImaginary() == 0) {
            firstArg = String.valueOf(decorated.getReal());
        }
        logger.log(firstArg);
        Calculable result = decorated.division(arg);
        logger.log(String.format("Вызов метода division произошел"));
        return result;
    }

    @Override
    public double getImaginary() {
        return decorated.getImaginary();
    }

    @Override
    public double getReal() {
        return decorated.getReal();
    }
}
