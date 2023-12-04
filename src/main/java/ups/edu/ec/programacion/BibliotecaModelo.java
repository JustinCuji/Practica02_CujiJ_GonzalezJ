/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.programacion;

class BibliotecaModelo {

    // Instancia de la biblioteca que forma parte del modelo//

    private Biblioteca biblioteca;

    // Constructor que inicializa la biblioteca con valores predeterminados//

    public BibliotecaModelo() {
        this.biblioteca = new Biblioteca("Biblioteca Central", "123 Calle Principal");
    }

    // Método para obtener la instancia de la biblioteca//

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
}