package Interfaces;

import Classes.Actor;
/**
 * Интерфейс
 */
public interface iActorBehaviour {
    /**
    * Сеттер 
    * setMakeOrder(boolean makeOrder)
    */
    void setMakeOrder(boolean makeOrder);
    /**
    * Сеттер 
    * setTakeOrder(boolean pickUpOrder)
    */
    void setTakeOrder(boolean pickUpOrder);
    /**
    * Геттер
    * isMakeOrder() return boolean
    */
    boolean isMakeOrder();
    /**
    * Геттер 
    * isTakeOrder() return boolean
    */
    boolean isTakeOrder();
    /**
    * Геттер
    * getActor() return Actor
    */
    Actor getActor();
    /**
    * Сеттер 
    * setQuality(int quality)
    */
    void setQuality(int quality);
    /**
    * Геттер 
    * getQuality() return int
    */
    int getQuality();
    /**
     * Метод возврата товара 
     * Переводит isTakeOrder  в положение false
     */
    void returnOrder();
    /**
    * Сеттер класса
    * setNameOfPromo(String nameOfPromo)
    */
    void setNameOfPromo(String string);
    /**
    * Геттер 
    * getNameOfPromo() return String
    */
    String getNameOfPromo();
    /**
    * Геттер
    * getName() return String
    */
    public abstract String getName();
}
