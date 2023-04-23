package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {
    /**
     * Название промо-акции (String)
     */
    private static String nameOfPromo;
    /**
     * Количество акционных товаров (int)
     */
    private static int numberOfPromo;
    /**
     * Список посетителей (List<iActorBehaviour>)
     */
    private List<iActorBehaviour> queue;
    public Random r = new Random();
    /**
     * Логгеры
     */
    Log all = new LogAll("C:\\Projects\\GB\\Java[GB]\\OOP\\HW2\\SuperMarket\\src\\LogOfAllClients.txt");
    Log ret = new LogReturn("C:\\Projects\\GB\\Java[GB]\\OOP\\HW2\\SuperMarket\\src\\LogOfReturns.txt");
    /**
     * Геттер класса Market
     * getNameOfPromo String(nameOfPromo)
     */
    public static String getNameOfPromo() {
        return nameOfPromo;
    }
    /**
     * Геттер класса Market
     * getnumberOfPromo String(numberOfPromo)
     */
    public static int getNumberOfPromo() {
        return numberOfPromo;
    }


    /**
     * Cеттер класса Market
     * setNameOfPromo String(nameOfPromo)
     */
    public static void setNumberOfPromo(int numberOfPromo) {
        Market.numberOfPromo = numberOfPromo;
    }
    /**
     * Cеттер класса Market
     * setNumberOfPromo String(numberOfPromo)
     */
    public static void setNameOfPromo(String nameOfPromo) {
        Market.nameOfPromo = nameOfPromo;
    }

    /**
     * Конструктор класса Market
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришёл в магазин ");
        takeInQueue(actor);
        all.logInfo(actor.getActor().getName() + " клиент пришёл в магазин ");
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
        all.logInfo(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушёл из магазина ");
            all.logInfo(actor.getName() + " клиент ушёл из магазина ");
            this.queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
    @Override
    public void giveOrder() {
        for (int i = 0; i < queue.size(); i++) {
            if (queue.get(i).isMakeOrder()) {
                if ((queue.get(i).getActor()).getNameOfPromo().equals(getNameOfPromo()) &&
                        numberOfPromo > 0) {
                    numberOfPromo--;
                    queue.get(i).setTakeOrder(true);
                    System.out.println(queue.get(i).getActor().getName()
                            + " получил свой заказ. Дарёному коню в зубы не смотрят) ");
                    all.logInfo(queue.get(i).getActor().getName()
                            + " получил свой заказ. Дарёному коню в зубы не смотрят) ");
                } else if ((queue.get(i).getActor()).getNameOfPromo().equals(getNameOfPromo()) && numberOfPromo == 0) {
                    System.out.println(
                            queue.get(i).getActor().getName() + " в заказе отказано. Закончился акционный товар");
                    all.logInfo(queue.get(i).getActor().getName() + " в заказе отказано. Закончился акционный товар");
                    queue.get(i).setTakeOrder(true);
                }else if(!(queue.get(i).getActor()).getNameOfPromo().equals(getNameOfPromo()) && !(queue.get(i).getActor()).getNameOfPromo().equals("None")){
                    System.out.println(
                            queue.get(i).getActor().getName() + " в заказе отказано. Такая акция в данный момент не проводится");
                    all.logInfo(queue.get(i).getActor().getName() + " в заказе отказано. Такая акция в данный момент не проводится");
                    queue.get(i).setTakeOrder(true);
                } else {
                    queue.get(i).setTakeOrder(true);
                    System.out.println(queue.get(i).getActor().getName() + " получил свой заказ. Качество заказа: "
                            + queue.get(i).getQuality() + "%");
                    all.logInfo(queue.get(i).getActor().getName() + " получил свой заказ. Качество заказа: "
                            + queue.get(i).getQuality() + "%");
                    if (queue.get(i).getQuality() < 70) {
                        queue.get(i).returnOrder();
                        int quality = r.nextInt(60, 100);
                        queue.get(i).setQuality(quality);
                        queue.add(i, queue.get(i));
                        queue.remove(i);
                        ret.logInfo(queue.get(i).getActor().getName() + " вернул заказ");
                        i--;
                    }
                }

            }

        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушёл из очереди ");
                all.logInfo(actor.getActor().getName() + " клиент ушёл из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
                all.logInfo(actor.getActor().getName() + " клиент сделал заказ ");
                int quality = r.nextInt(60, 100);
                actor.setQuality(quality);
            }
        }
    }
}
