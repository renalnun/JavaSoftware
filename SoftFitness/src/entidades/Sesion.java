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
public class Sesion {
    
    private int id;
    private Date hora_In;
    private Date hora_Fn;
    private Date fecha;
    private String estado;
    private String id_Cliente;
    private int id_instructor;

    public Sesion(int id, Date hora_In, Date hora_Fn, Date fecha, String estado, String id_Cliente, int id_instructor) {
        this.id = id;
        this.hora_In = hora_In;
        this.hora_Fn = hora_Fn;
        this.fecha = fecha;
        this.estado = estado;
        this.id_Cliente = id_Cliente;
        this.id_instructor = id_instructor;
    }

    public Sesion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getHora_In() {
        return hora_In;
    }

    public void setHora_In(Date hora_In) {
        this.hora_In = hora_In;
    }

    public Date getHora_Fn() {
        return hora_Fn;
    }

    public void setHora_Fn(Date hora_Fn) {
        this.hora_Fn = hora_Fn;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public int getId_instructor() {
        return id_instructor;
    }

    public void setId_instructor(int id_instructor) {
        this.id_instructor = id_instructor;
    }
    
       
}
