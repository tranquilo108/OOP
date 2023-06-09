/**
 * Интерфейс Loggable содержит один метод log.
 */
public interface Loggable {
    /**
     * Метод log ринимает сообщение типа String и определяет, как логгировать действия над
     * объектами класса Calculable. Реализация данного интерфейса позволяет
     * сохранять сообщения о действиях, произведенных над объектами, например, в
     * текстовый файл, базу данных или на консоль.
     */
    void log(String message);
}
