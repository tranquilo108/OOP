/**
 * Класс ConsoleLogger реализует интерфейс Loggable
 * Содержит единственный метод log для записи сообщений в консоль с префиксом
 * "LOG:"
 */
public class ConsoleLogger implements Loggable {
    /**
     * Выводит сообщение в консоль с префиксом "LOG:"
     * 
     * @param message сообщение, которое нужно записать в лог
     */
    @Override
    public void log(String message) {
        System.out.println("LOG:" + message);
    }
}
