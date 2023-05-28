/**
 * Класс Calculator реализует интерфейс Calculable и представляет собой объект
 * комплексного числа. Комплексное число состоит из действительной и мнимой
 * частей, которые хранятся в полях real и imaginary соответственно.
 */
public final class Calculator implements Calculable {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    {
        imaginary = 0;
    }

    /**
     * Конструктор Calculator позволяет создавать объекты класса, принимая
     * действительную и мнимую части комплексного числа в качестве параметров.
     */
    public Calculator(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Calculator(double real) {
        this.real = real;
        imaginary = 0;
    }

    @Override
    public Calculable sum(Calculable other) {
        double newReal = this.real + other.getReal();
        double newImaginary = this.imaginary + other.getImaginary();
        return new Calculator(newReal, newImaginary);
    }

    @Override
    public Calculable multi(Calculable other) {
        double newReal = this.real * other.getReal() - this.imaginary * other.getImaginary();
        double newImaginary = this.real * other.getImaginary() + this.imaginary * other.getReal();
        return new Calculator(newReal, newImaginary);
    }

    @Override
    public Calculable difference(Calculable other) {
        double newReal = this.real - other.getReal();
        double newImaginary = this.imaginary - other.getImaginary();
        return new Calculator(newReal, newImaginary);
    }

    @Override
    public Calculable division(Calculable other) {
        double denominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        double newReal = (this.real * other.getReal() + this.imaginary * other.getImaginary()) / denominator;
        double newImaginary = (this.imaginary * other.getReal() - this.real * other.getImaginary()) / denominator;
        return new Calculator(newReal, newImaginary);
    }

    /**
     * Метод toString представляет комплексное число в виде строки. Если мнимая
     * часть равна 0, метод вернет только действительную часть в виде строки. Если
     * мнимая часть отрицательная, метод вернет строку в формате
     * "<действительная часть> - <мнимая часть>i". В противном
     * случае, метод вернет строку в формате "<действительная_часть> +
     * <мнимая_часть>i".
     */
    @Override
    public String toString() {
        if (imaginary == 0) {
            return String.valueOf(real);
        } else if (imaginary < 0) {
            return String.format("%s - %si", real, -imaginary);
        } else {
            return String.format("%s + %si", real, imaginary);
        }
    }
}
