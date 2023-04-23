package Classes;

/**
 * Класс обычный клиент
 */
public class OrdinaryClient extends Actor {
    /**
     * Конструктор класса OrdinaryClient(String name)
     * @param name
     */
    public OrdinaryClient(String name) {
        super(name);
        this.nameOfPromo = "None";
    }
    @Override
    public Actor getActor() {
        return this;
    }
    @Override
    public String getName() {
        return super.name;
    }
    @Override
    public String getNameOfPromo() {
        return this.nameOfPromo;
    }   
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    public int getQuality() {
        return qualityOfOrder;
    }
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }
    public void setQuality(int quality) {
        this.qualityOfOrder = quality;
    }
    @Override
    public void setNameOfPromo(String nameOfPromo) {    
        this.nameOfPromo = nameOfPromo;
    }
    @Override
    public void returnOrder() {
        System.out.println(name + " вернул заказ");
        setTakeOrder(false);
    }
}