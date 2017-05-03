/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.datos.ConjuntoRectangulo;
import aplicacion.modelo.dominio.Rectangulo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class RectanguloFormBean implements Serializable {
    private ConjuntoRectangulo rectangulos;
    private Rectangulo rect;
    private double x1;
    private double y1;
    private double base;
    private double altura;
    
    public void agregarRectangulo(){
        setRect(new Rectangulo (getX1(),getY1(),getBase(),getAltura()));
        rectangulos.AgregarRectangulo(rect);
    }

    
     public double calcularSuperficie(){
    Rectangulo sup= new Rectangulo();
    return sup.obtenerSuperficie(getBase(), getAltura());
 }
  
  public double calcularPerimetro(){
    Rectangulo per= new Rectangulo();
    return per.obtenerPerimetro(getBase(), getAltura());
 }
    /**
     * Creates a new instance of RectanguloFormBean
     */
    public RectanguloFormBean() {
    rectangulos = new ConjuntoRectangulo();}

     public void eliminarRectangulo(){
        rectangulos.BorrarRectangulo(rect);
    }
    /**
     * @return the rectangulos
     */
    public ConjuntoRectangulo getRectangulos() {
        return rectangulos;
    }

    /**
     * @param rectangulos the rectangulos to set
     */
    public void setRectangulos(ConjuntoRectangulo rectangulos) {
        this.rectangulos = rectangulos;
    }

    /**
     * @return the rect
     */
    public Rectangulo getRect() {
        return rect;
    }

    /**
     * @param rect the rect to set
     */
    public void setRect(Rectangulo rect) {
        this.rect = rect;
    }

    /**
     * @return the x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * @return the y1
     */
    public double getY1() {
        return y1;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
