/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.programacion;
//Estructura de lo que se va mostrar en el menú//
class BibliotecaVista {
    public void mostrarMenu() {
        System.out.println("Bienvenido al Sistema de Gestión de Biblioteca");
        System.out.println("1. Agregar un nuevo libro a ala biblioteca");
        System.out.println("2. Registrar un nuevo usuario");
        System.out.println("3. Buscar libros disponibles");
        System.out.println("4. Prestar libro a un usuario");
        System.out.println("5. Devolver Libro");
        System.out.println("6. Salir");
    }
    // Método para mostrar los mensajes en la consola//
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
