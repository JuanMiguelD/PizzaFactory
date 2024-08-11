
public class PrepararPizza {

    private PizzaFactory factory;

    public PrepararPizza(PizzaFactory factory){
        this.factory = factory;
    }

    private void aplicarIngredientes(String[] ingredientes){

        for (String i : ingredientes){
            System.out.println(i+" Agregado...");
        }
        System.out.println("Ingredientes agregados con éxito!");

    }

    public void prepararPizza(String[] ingredientes, String tam) {
        
            Amasador am= factory.crearAmasador();
            Horneador hpd= factory.crearHorneador();
            Moldeador mp=factory.creaMoldeador();
            am.amasar();
            if (tam.equalsIgnoreCase("pequeña")){
                mp.moldearPizzaPequena();
            }
            else if(tam.equalsIgnoreCase("mediana")){
                mp.moldearPizzaMediana();
            }
            else{
               System.out.println("Tamaño de piza invalido");
            }
                aplicarIngredientes(ingredientes);
                hpd.hornear();
        

    }  



}
