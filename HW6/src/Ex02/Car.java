package Ex02;

// 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
// Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle),
// напишите метод calculateAllowedSpeed(). Использование этого метода позволит
// сделать класс SpeedCalculation соответствующим OCP

public class Car extends Vehicle implements SpeedCalculation {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * 0.8;
    }
}
