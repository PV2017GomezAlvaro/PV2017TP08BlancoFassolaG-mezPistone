/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.datos.ConjuntoLibro;
import aplicacion.modelo.dominio.Libros;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@SessionScoped
public class LibrosFormBean implements Serializable {
    private ConjuntoLibro libr;
    private Libros libro;
    private String titulo;
    private String autor;
    private int ISBN;
    private int precio;

    public void agregarLibro(){
        libro = new Libros (getTitulo(),getAutor(),getPrecio(),getISBN());
        libr.AgregarLibro(libro);
    }
    
    /**
     * Creates a new instance of LibrosFormBean
     */
    public LibrosFormBean() {
        libr = new ConjuntoLibro();
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the ISBN
     */
    public int getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
        
    }

    

    

    /**
     * @return the libr
     */
    public ConjuntoLibro getLibr() {
        return libr;
    }

    /**
     * @param libr the libr to set
     */
    public void setLibr(ConjuntoLibro libr) {
        this.libr = libr;
    }

    /**
     * @return the libro
     */
    public Libros getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libros libro) {
        this.libro = libro;
    }
    
}
