/**
 * Фабрика для создания объектов класса Calculator, который реализует интерфейс
 * Calculable.
 */
public class CalculableFactory implements ICalculableFactory {
    /**
     * 
     * Создает объект Calculator с заданными действительной и мнимой частью
     * комплексного числа.
     * @param real      действительная часть комплексного числа.
     * @param imaginary мнимая часть комплексного числа.
     * @return возвращает новый объект Calculator с заданными параметрами.
     */
    public Calculable create(double real, double imaginary) {
        return new Calculator(real, imaginary);
    }
}
