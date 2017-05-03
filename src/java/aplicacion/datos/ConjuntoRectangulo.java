/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.modelo.dominio.Rectangulo;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ConjuntoRectangulo implements Serializable {
     private  ArrayList<Rectangulo> rectangulo;

    public ConjuntoRectangulo() {
        rectangulo = new ArrayList();
    }


    
    public void AgregarRectangulo(Rectangulo unRectangulo){
        getRectangulo().add(unRectangulo);
    }
    public void BorrarRectangulo (Rectangulo unRectangulo){
        getRectangulo().remove(unRectangulo);
    }
    /**
     * @return the rectangulo
     */
    public ArrayList<Rectangulo> getRectangulo() {
        return rectangulo;
    }

    /**
     * @param rectangulo the rectangulo to set
     */
    public void setRectangulo(ArrayList<Rectangulo> rectangulo) {
        this.rectangulo = rectangulo;
    }
}
