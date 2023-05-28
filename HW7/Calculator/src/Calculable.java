/**
 * Интерфейс Calculable определяет методы для выполнения базовых арифметических
 * операций с комплексными числами.
 */
public interface Calculable {
    /**
     * Метод sum возвращает новый объект Calculable, который является суммой
     * текущего объекта и входного объекта Calculable.
     * 
     * @param calculator объект Calculable для сложения @return новый объект
     *                   Calculable, представляющий сумму двух объектов
     */
    Calculable sum(Calculable calculator);

    /**
     * Метод multi возвращает новый объект Calculable, который является
     * произведением текущего объекта и входного объекта Calculable.
     * 
     * @param calculator2 объект Calculable для умножения @return новый объект
     *                    Calculable, представляющий произведение двух объектов
     */
    Calculable multi(Calculable calculator2);

    /**
     * Метод difference возвращает новый объект Calculable, который является
     * разностью текущего объекта и входного объекта Calculable.
     * 
     * @param calculator объект Calculable для вычитания @return новый объект
     *                   Calculable, представляющий разность двух объектов
     */
    Calculable difference(Calculable calculator);

    /**
     * Метод division возвращает новый объект Calculable, который является частным
     * текущего объекта и входного объекта Calculable.
     * 
     * @param calculator объект Calculable для деления @return новый объект
     *                   Calculable, представляющий частное двух объектов
     */
    Calculable division(Calculable calculator);

    /**
     * Метод getImaginary возвращает мнимую часть комплексного числа.
     * 
     * @return мнимая часть комплексного числа
     */
    double getImaginary();

    /**
     * Метод getReal возвращает действительную часть комплексного числа.
     * 
     * @return действительная часть комплексного числа
     */
    double getReal();
}
