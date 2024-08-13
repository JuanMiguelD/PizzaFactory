# Parte 1 - PizzaFactory

El Diagrama UML muestra una propuesta de como se podría usar el Factory Method para el ejercicio propuesto. esta pensado para modificar lo menos posible el metodo prepararPizza dado en el enunciado.

En la carpeta se encuentra una posible implementación en Java con algunos ajustes.
Se agregó la clase Main para realizar pruebas del funcionamiento, si se quiere observar el comportamiento en las distintas fábricas es necesario únicamente cambar la linea 4 por alguna de las siguientes opciones según se quiera: 
  * PizzaFactory factory = new PizzaDelgadaFactory();
  * PizzaFactory factory = new PizzaGruesaFactory();
  * PizzaFactory factory = new PizzaIntegralFactory();

#Parte 2 - Game

Se crearon interfaces y uso de clases con algunos métodos abstractos para respetar el requisito de no duplicar código. Todo el material de esta parte se encuentra en la carpeta DYAS-GoF-CreationalPatterns-GameRefactoring


#Diagramas UML
![UML PizzaFactory](https://github.com/user-attachments/assets/6d4278f7-ebdb-407c-8bbb-a371f7533ccf)


![GameRefactor UML](https://github.com/user-attachments/assets/bd4985e6-2b84-4793-8c42-33c4648d7ebd)
