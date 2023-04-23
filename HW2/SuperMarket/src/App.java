import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        Market.setNumberOfPromo(2);
        Market.setNameOfPromo("Акция");
        iActorBehaviour item1 = new OrdinaryClient("Boris");
        iActorBehaviour item2 = new SpecialClient("Fedor", 12312);
        iActorBehaviour item3 = new OrdinaryClient("Vasya");
        iActorBehaviour item4 = new PromoClient("One", "Акция2");
        iActorBehaviour item5 = new PromoClient("Two", "Акция");
        iActorBehaviour item6 = new PromoClient("Three", "Акция");
        iActorBehaviour item7 = new PromoClient("Four", "Акция");
        iActorBehaviour item8 = new PromoClient("Five", "Акция");
        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        market.acceptToMarket(item5);
        market.acceptToMarket(item6);
        market.acceptToMarket(item7);
        market.acceptToMarket(item8);

        market.update();
    }
}
