/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.programacion;

// Implementa la interfaz Prestable para gestionar el estado de disponibilidad del libro.
 
public class Libro implements Prestable {
    private String titulo;
    private String autor;
    private int año;
    private boolean disponible;

    // Constructor que inicializa los atributos del libro//

    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.disponible = true;
    }

    // Método de la interfaz Prestable para marcar el libro como prestado

    @Override
    public void prestar() {
        disponible = false;
    }

    // Método de la interfaz Prestable para marcar el libro como devuelto

    @Override
    public void devolver() {
        disponible = true;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
//SETTERS AND GETTERS//
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAño() {
        return año;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAño(int año) {
        this.año = año;
    }

   
}
