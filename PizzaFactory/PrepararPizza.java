
public class PrepararPizza {

    public void prepararPizza(String[] ingredientes, String tam, String tipo) {
        

        if( tipo.equalsIgnoreCase("Delgada")){
            Amasador am=new PizzaDelgadaFactory().crearAmasador();
            Horneador hpd=new PizzaDelgadaFactory().crearHorneador();
            Moldeador mp=new PizzaDelgadaFactory().creaMoldeador();
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
                //aplicarIngredientes(ingredientes);
                hpd.hornear();
        }
        
        else{
            Amasador am=new PizzaGruesaFactory().crearAmasador();
            Horneador hpd=new PizzaGruesaFactory().crearHorneador();
            Moldeador mp=new PizzaGruesaFactory().creaMoldeador();
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
                //aplicarIngredientes(ingredientes);
                hpd.hornear();
        }

    }  
}
