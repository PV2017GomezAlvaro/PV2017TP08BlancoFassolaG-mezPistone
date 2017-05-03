/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;


/**
 *
 * @author Alumno
 */
public class Rectangulo {
    private double x1;
    private double x2;
    private double base;
    private double altura;

    public Rectangulo() {
    }
     

    public Rectangulo(double x1, double x2, double base, double altura) {
        this.x1 = x1;
        this.x2 = x2;
        this.base = base;
        this.altura = altura;
    }

     public double obtenerSuperficie(double base, double alt){
        double superficie;
        setBase(base);
        setAltura(alt);
        superficie=base*alt;
        return superficie;
    }
    
     public double obtenerPerimetro(double base, double alt){
        double perimetro;
        setBase(base);
        setAltura(alt);
        perimetro=((base*2)+(alt*2));
        return perimetro;
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
     * @return the x2
     */
    public double getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(double x2) {
        this.x2 = x2;
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
