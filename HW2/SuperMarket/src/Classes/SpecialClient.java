package Classes;
/**
 * Класс VIP клиент
 */
public class SpecialClient extends Actor {
    /**
     * idVip (int) идентификатор VIP клиента
     */
    private int idVip;
    /**
     * qualityOfOrder (int) качество товара полученного клиентом
     */
    private int qualityOfOrder;
    /**
     * Конструктор класса SpecialClient(String name, int idVip)
     */
    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
        this.nameOfPromo = "None";
    }

    @Override
    public String getName() {
        return "VIP " + super.name;
    }
    public int getIdVip() {
        return idVip;
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
    @Override
    public Actor getActor() {
        return this;
    }
    @Override
    public void returnOrder() {
        System.out.println(name + " вернул заказ");
        setTakeOrder(false);
    }
    public int getQuality() {
        return qualityOfOrder;
    }

    public void setQuality(int quality) {
        this.qualityOfOrder = quality;
    }
    @Override
    public void setNameOfPromo(String nameOfPromo) {
        
    }

    @Override
    public String getNameOfPromo() {
        return this.nameOfPromo;
    }
}
