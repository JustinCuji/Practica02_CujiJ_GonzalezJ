/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.programacion;

// Clase principal que contiene el método main para ejecutar la aplicación//
public class Main {
    public static void main(String[] args) {

        // Crear instancias del modelo, vista y controlador//

        BibliotecaModelo model = new BibliotecaModelo();
        BibliotecaVista view = new BibliotecaVista();
        BibliotecaControlador controller = new BibliotecaControlador(model, view);
        
// Ejecutar el controlador para iniciar la aplicación//

        controller.ejecutar();
    }
}
