/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author Augusto
 */
public class Cliente extends Persona {
    private int credito;

    public Cliente(int credito, int edad, String nombre, int telefono) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }
    
    public void mostarDatos(){
        System.out.println("Nombre: "+getNombre()+ 
                "\nEdad: "+getEdad()+
                "\nTelefono: "+getTelefono()+
                "\nCredito "+credito);
                
    }
}
