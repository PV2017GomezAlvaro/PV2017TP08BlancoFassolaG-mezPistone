/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.modelo.dominio.Libros;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ConjuntoLibro implements Serializable {
    private  ArrayList<Libros> libro;

    public ConjuntoLibro() {
        libro = new ArrayList();
    }
    
    public void AgregarLibro(Libros unLibro){
        libro.add(unLibro);
    }
    

    /**
     * @return the libro
     */
    public ArrayList<Libros> getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(ArrayList<Libros> libro) {
        this.libro = libro;
    }
    
}
