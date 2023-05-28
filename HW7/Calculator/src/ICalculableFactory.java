/**
 * Интерфейс ICalculableFactory представляет фабрику, которая создает объекты
 * типа Calculable,
 * используя переданные значения действительной и мнимой частей.
 */
public interface ICalculableFactory {

    /**
     * Метод create создает новый объект типа Calculable с заданными значениями
     * действительной и мнимой частей.
     * 
     * @param real      действительная часть комплексного числа
     * @param imaginary мнимая часть комплексного числа
     * @return объект типа Calculable с заданными значениями действительной и мнимой
     *         частей.
     */
    Calculable create(double real, double imaginary);
}
