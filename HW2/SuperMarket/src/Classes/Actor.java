package Classes;


import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Абстрактный класс покупателя
 * Поля: name (String), isTakeOrder (boolean), isMakeOrder (boolean)
 * Метод: getName()
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder  {
    protected int qualityOfOrder;
    protected String name;
    protected String nameOfPromo;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * Конструктор класса
     * @param name
     */
    public Actor(String name) {
        this.name = name;
    }
    
}
