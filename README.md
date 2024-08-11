# PizzaFactory

El Diagrama UML muestra una propuesta de como se podría usar el Factory Method para el ejercicio propuesto. esta pensado para modificar lo menos posible el metodo prepararPizza dado en el enunciado.

En la carpeta se encuentra una posible implementación en Java con algunos ajustes.

Se agregó la clase Main para realizar pruebas del funcionamiento, si se quiere observar el comportamiento en las distintas fábricas es necesario únicamente alternar la linea 4 por alguna de las siguientes opciones: 
  * PizzaFactory factory = new PizzaDelgadaFactory();
  * PizzaFactory factory = new PizzaGruesaFactory();
  * PizzaFactory factory = new PizzaIntegralFactory();


