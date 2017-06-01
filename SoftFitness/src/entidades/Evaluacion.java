/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Ariel
 */
public class Evaluacion {
    
    private int id;
    private Date fecha;
    private Date hora;
    private double peso;
    private double indice_Grasa;
    private int rm;
    private int id_cliente;

    public Evaluacion(int id, Date fecha, Date hora, double peso, double indice_Grasa, int rm, int id_Cliente) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.peso = peso;
        this.indice_Grasa = indice_Grasa;
        this.rm = rm;
        this.id_cliente = id_Cliente;
    }

    public Evaluacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIndice_Grasa() {
        return indice_Grasa;
    }

    public void setIndice_Grasa(double indice_Grasa) {
        this.indice_Grasa = indice_Grasa;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    
    
    
}
