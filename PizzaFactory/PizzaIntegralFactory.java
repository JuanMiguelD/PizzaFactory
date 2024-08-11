public class PizzaIntegralFactory  extends PizzaFactory{

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaI();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaI();
    }

    @Override
    public Moldeador creaMoldeador() {
        return new MoldeadorPizzaI();
    }

    
}