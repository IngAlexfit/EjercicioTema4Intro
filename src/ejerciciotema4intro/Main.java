/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema4intro;

/**
 *
 * @author Ing_Puello
 */
public class Main {

    /* En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
    ///****segundo punto****///
/*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, 
    el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.*/
    //*********Tercer Punto*********//
/*Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
                     //*********Cuarto Punto*********
/*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea 
    igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/
    /**
     * ************Quinto punto********
     */
    /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
    Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en 
    la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
     */
    public static void main(String[] args) {
        int numeroIf = -3, numeroWhile = 0, numeroFor = 0, estacion = 3;

        if (numeroIf > 0) {
            System.out.println("numeroif es positivo");
        } else if (numeroIf < 0) {
            System.out.println("numero if es negativo");

        } else {

            System.out.println("numeroif es igual a 0");
        }
        //**********Segundo Punto*************///////////
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile: " + numeroWhile);
        }
        //*****************Tercer Punto****************//
        do {
            numeroWhile++;
            System.out.println("numeroWhile dowhile " + numeroWhile);
        } while (numeroWhile < 3);
        //*****************Cuarto Punto****************//
        for (int i = 0; i <= 3; i++) {
            numeroFor++;
            System.out.println("numeroFor: " + numeroFor);
        }
        //*****************Quinto Punto****************//
        switch (estacion) {
            case 1:
                System.out.println("Se encuentra en Primavera");
                break;
            case 2:
                System.out.println("Se encuentra en Verano");
                break;
            case 3:
                System.out.println("Se encuentra en Otoño");
                break;
            case 4:
                System.out.println("Se encuentra en Invierno");
                break;
            default:
                System.out.println("El valor de la variable no es una estacion valida");
        }

    }

}
