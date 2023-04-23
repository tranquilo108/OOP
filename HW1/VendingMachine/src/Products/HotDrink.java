package Products;

public class HotDrink extends Product {

    private int volume;
    private int temperature;

    public HotDrink(String name, double price, int volume, int temperature)
    {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

        /**
     * переопределение вывода продукта
     */
    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + volume + ", temperature=" + temperature +
        '}';
    }
    
}