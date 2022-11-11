/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author Augusto
 */
public class Trabajador extends Persona {
    private int salario;

    public Trabajador(int salario, int edad, String nombre, int telefono) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
    
    public void mostarDatos(){
        System.out.println("\nNombre: "+getNombre()+ 
                "\nEdad: "+getEdad()+
                "\nTelefono: "+getTelefono()+
                "\nSalario: "+salario);
                
    }
}
