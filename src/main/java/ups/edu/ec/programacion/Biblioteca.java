/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.programacion;

import java.util.ArrayList;
import java.util.Iterator;

//Clase Principa//
public class Biblioteca {

//Atributos//
    private String nombre;
    private String direccion;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Usuario> listaUsuarios;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaLibros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }
//método para agregar el libro//
    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }
//Método para registrar el libro//
    public void registrarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public Libro buscarLibro(String criterio) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(criterio) ||
                libro.getAutor().equalsIgnoreCase(criterio) ||
                String.valueOf(libro.getAño()).equalsIgnoreCase(criterio)) {
                return libro;
            }
        }
        return null;
    }

//Método para prestar el libro//

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (libro.isDisponible()) {
            Prestamo prestamo = new Prestamo(libro, usuario);
            usuario.agregarPrestamo(prestamo);
            libro.prestar();
            System.out.println("Préstamo exitoso.");
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }

// Método para obtener la lista de usuarios (usado en el controlador)
 
 Iterable<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
//Metodo para devolver el libro prestado//
    void devolverLibro(Libro libroDevolver, Usuario usuarioDevolucion) {
      
        boolean libroPrestado = false;

// metodo para verificar si el usuario tiene el libro prestado//

        for (Prestamo prestamo : usuarioDevolucion.getListaPrestamos()) {
            if (prestamo.getLibro().equals(libroDevolver) && prestamo.esPrestamoVigente()) {
                libroPrestado = true;
                break;
            }
        }

        if (libroPrestado) {
//Marcar como libro disponible//
            libroDevolver.setDisponible(true);

          
            Iterator<Prestamo> iterator = usuarioDevolucion.getListaPrestamos().iterator();
            while (iterator.hasNext()) {
                Prestamo prestamo = iterator.next();
                if (prestamo.getLibro().equals(libroDevolver) && prestamo.esPrestamoVigente()) {
                    iterator.remove();
                    break;
                }
            }

            System.out.println("Devolución exitosa. Libro marcado como disponible.");
        } else {
            System.out.println("Error: El usuario no tiene el libro prestado o el préstamo ha expirado.");
        }
    }
}
