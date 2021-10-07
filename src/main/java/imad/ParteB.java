/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad;

import javax.swing.JOptionPane;

/**
 *
 * @author imad
 */
public class ParteB {

    public static void main(String[] args) {
        //Declaracion de variables
        double calculoHorasTotalesNecesarias;
        double profesoresTotalesNecesarios;
        //un profesor no puede tener más de 150 horas de clase anuales
        final double HORAS_MAXIMAS_PROFESOR = 150;
        //los másteres tienen 975 horas de clase al año
        String HorasTotalesMasterIntroducidasPorUsuario;
        //dato introducido por el usuario
        String mastersAimpartir;
        //Declaracion de objetos
        //mensaje informativo por pantalla para la introduccion de datos
        mastersAimpartir = JOptionPane.showInputDialog("Introduce el numero de masters que se van a impartir este año");
        HorasTotalesMasterIntroducidasPorUsuario = JOptionPane.showInputDialog("Introduce las horas totales del Master");
        //algoritmo necesario
        //multiplicamos los masters que vamos a impartir por las horas que tiene cada master que son 975
        //hacemos una conversion para pasar un string a double 
        calculoHorasTotalesNecesarias = Double.parseDouble(mastersAimpartir) * Double.parseDouble(HorasTotalesMasterIntroducidasPorUsuario);
        //Dividimos las horas totales de los masters introducidos por el usuario entre el numero de horas maximas de cada usuario
        profesoresTotalesNecesarios = calculoHorasTotalesNecesarias / HORAS_MAXIMAS_PROFESOR;
        //Mostramos el resultado usando la clase Math para que nos muestre por pantalla solo el numero entero rodeado hacia arriba
        JOptionPane.showMessageDialog(null, "Cada master tendrá " + HorasTotalesMasterIntroducidasPorUsuario + "\n Se necesitaran un total de " + Math.ceil(profesoresTotalesNecesarios) + " profesores");

    }
}
