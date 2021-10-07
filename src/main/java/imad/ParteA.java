/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad;

import java.util.Scanner;

/**
 *
 * @author imad
 */
public class ParteA {

    public static void main(String[] args) {
        //Declaracion de variables
        double calculoHorasTotalesNecesarias;
        int profesoresTotalesNumeroEntero;
        //El numero de profesores lo declaro como double ya que si lo declaramos como entero siempre va a estar redondeando hacia abajo
        double profesoresTotalesNecesarios;
        //un profesor no puede tener más de 150 horas de clase anuales
        final double HORAS_MAXIMAS_PROFESOR = 150;
        //los másteres tienen 975 horas de clase al año
        final double HORAS_TOTALES_MASTER = 975;
        //dato introducido por el usuario
        double mastersAimpartir;
        //Declaracion de objetos
        Scanner teclado = new Scanner(System.in);
        //mensaje informativo por pantalla para la introduccion de datos
        System.out.println("Introduce el numero de masters que se van a impartir este año");
        mastersAimpartir = teclado.nextInt();
        //algoritmo necesario
        //multiplicamos los masters que vamos a impartir por las horas que tiene cada master que son 975
        calculoHorasTotalesNecesarias = mastersAimpartir * HORAS_TOTALES_MASTER;
        //Dividimos las horas totales de los masters introducidos por el usuario entre el numero de horas maximas de cada usuario
        profesoresTotalesNecesarios = calculoHorasTotalesNecesarias / HORAS_MAXIMAS_PROFESOR;
        //Imprimimos el resultado usando la clase Math para que nos muestre por pantalla solo el numero entero redondeando hacia arriba
        
        //mostramos la variable entera por pantalla
        profesoresTotalesNumeroEntero  = (int) Math.ceil(profesoresTotalesNecesarios);
        System.out.println("Se necesitaran un total de " + profesoresTotalesNumeroEntero + " profesores");

    }
}
