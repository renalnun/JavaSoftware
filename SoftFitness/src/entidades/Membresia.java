/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Ariel
 */
public class Membresia {
    
     private int id;
     private String tipo;
     private double precio;
     private String duracion;
     private String descripcion;

    public Membresia(int id, String tipo, double precio, String duracion, String descripcion) {
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public Membresia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     
     
}
