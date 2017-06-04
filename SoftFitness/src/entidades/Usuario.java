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
public class Usuario {
    
    private String id;
    private String rol;
    private String clave;
    private String estado;
    private Date fecha_Reg;

    public Usuario(String id, String rol, String clave, String estado, Date fecha_Reg) {
        this.id = id;
        this.rol = rol;
        this.clave = clave;
        this.estado = estado;
        this.fecha_Reg = fecha_Reg;
    }

    public Usuario(String id, String clave) {
        this.id = id;
        this.clave = clave;
    }
    
    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha_Reg() {
        return fecha_Reg;
    }

    public void setFecha_Reg(Date fecha_Reg) {
        this.fecha_Reg = fecha_Reg;
    }
    
    
}
