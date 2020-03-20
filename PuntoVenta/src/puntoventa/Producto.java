/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;
/**
 * @author ASUS
 */
public class Producto {

    // Declaracion de variables

    protected String nombre;
    protected String unidad_medida;
    protected int cantidad;
    protected double precio;
  /**
   * Metodo constructor con datos del producto
   * @param nombre
   * @param unidad_medida
   * @param cantidad
   * @param precio 
   */

    public Producto(String nombre, String unidad_medida, int cantidad,
            double precio) {
        this.nombre = nombre;
        this.unidad_medida = unidad_medida;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the unidad_medida
     */
    public String getUnidad_medida() {
        return unidad_medida;
    }

    /**
     * @param unidad_medida the unidad_medida to set
     */
    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
