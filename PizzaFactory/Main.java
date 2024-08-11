public class Main {
    public static void main(String[] args) {
    
        PizzaFactory factory = new PizzaGruesaFactory();

        PrepararPizza Preparador = new PrepararPizza(factory);

        String[] ingredientes = {"Piña","Jamón","Queso"} ;

        Preparador.prepararPizza(ingredientes,"Mediana");

    }
}
