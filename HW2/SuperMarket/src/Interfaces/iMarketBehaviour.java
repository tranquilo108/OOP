package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehaviour {
    /**
    * Добавляет клиента в очередь и записывает его прибытие в журнал
    */
    void acceptToMarket(iActorBehaviour actor);
    /**
    * Удаляет клиентов из очереди, записывает их уход в журнал
    */
    void releaseFromMarket(List<Actor> actors);
    /**
    * Вызывает методы takeOrder, giveOrder и releaseFromQueue
    */
    void update();
}
