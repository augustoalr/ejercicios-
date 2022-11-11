/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema4;

import javax.swing.JOptionPane;

/**
 *
 * @author Augusto
 */
public class EjercicioTema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        /* Ejercicio if
        
        int numero, dato = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor escriba un numero"));
        
        if(numero < dato){
            JOptionPane.showMessageDialog(null, "El numero es negativo");
        }
        else if(numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es cero");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es positivo");
        }
        */
        
        /*Ejercicio con el bucle while
        int numeroWhile = 1;
        
        while(numeroWhile <= 10){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        */
        
        /*Ejercicio con el bucle do while
        int numeroWhile = 10;
        
        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while(numeroWhile<=10);
        */
        
        /*Ejercicio con el bucle for for(inicializacion ; condicion ; aumento o decremento{
            instrucciones
        }
        
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        
        */
        
        /*Ejercicio con Switch
        switch(dato){
        case 1: intrucciones1:
                break;
        case 2: Intrucciones2:
                break;
        
        default: CasoContrario:
                  break;
        

        }

        */
        
        int estacion;
        estacion = Integer.parseInt(JOptionPane.showInputDialog("Por favor introduzca el numero de la estacion, recuerde que solo hay 3 disponible."));
        
        switch(estacion){
            case 1: JOptionPane.showMessageDialog(null, "Usted se encuentra en la estacion PLAZA VENEZUELA");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "Usted se encuentra en la estacion CAPITOLIO");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "Usted se encuentra en la estacion CHACAO");
                    break;
            default: JOptionPane.showMessageDialog(null, "El numero de la estacio no se encuentra disponible");
                    
        }
        
        
        
        
    }
    
}
