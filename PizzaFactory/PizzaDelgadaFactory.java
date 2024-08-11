public class PizzaDelgadaFactory extends PizzaFactory{

    @Override
    public Moldeador creaMoldeador() {
        // TODO Auto-generated method stub
        return new MoldeadorPizzaD();
    }

    @Override
    public Amasador crearAmasador() {
        // TODO Auto-generated method stub
        return new AmasadorPizzaD();
    }

    @Override
    public Horneador crearHorneador() {
        // TODO Auto-generated method stub
        return new HorneadorPizzaD();
    }
    
    
}
