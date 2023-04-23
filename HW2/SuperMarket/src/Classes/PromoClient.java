package Classes;

/**
 * Класс акционный клиент
 */
public class PromoClient extends Actor {
    private static int numberOfPromo;
    private String nameOfPromo;

    @Override
    public void returnOrder() {
        System.out.println(name + " вернул заказ");
        setTakeOrder(false);
    }

    public void setNameOfPromo(String nameOfPromo) {
        this.nameOfPromo = nameOfPromo;
    }

    public String getNameOfPromo() {
        return nameOfPromo;
    }

    public static int getNumberOfPromo() {
        return numberOfPromo;
    }

    /**
     * Конструктор класса PromoClient(String name)
     * 
     * @param name
     */
    public PromoClient(String name, String nameOfPromo) {
        super(name);
        this.nameOfPromo = nameOfPromo;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    public int getQuality() {
        return qualityOfOrder;
    }

    public void setQuality(int quality) {
        this.qualityOfOrder = quality;
    }
}
