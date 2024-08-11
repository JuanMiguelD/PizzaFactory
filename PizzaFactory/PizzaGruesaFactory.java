public class PizzaGruesaFactory extends PizzaFactory{
    @Override
    public Moldeador creaMoldeador() {
        // TODO Auto-generated method stub
        return new MoldeadorPizzaG();
    }

    @Override
    public Amasador crearAmasador() {
        // TODO Auto-generated method stub
        return new AmasadorPizzaG();
    }

    @Override
    public Horneador crearHorneador() {
        // TODO Auto-generated method stub
        return new HorneadorPizzaG();
    }
}
