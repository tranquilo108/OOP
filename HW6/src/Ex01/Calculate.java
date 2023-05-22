package Ex01;

public class Calculate {
    private int baseSalary;

    public Calculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}