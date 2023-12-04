/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.programacion;

// Clase abstracta que representa a una Persona//
public abstract class Persona {
    protected String nombre;
    protected String identificacion;

    public Persona(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }
    // Método abstracto para mostrar información de la persona, implementado por las clases hijas//
    public abstract void mostrarInformacion();
}
