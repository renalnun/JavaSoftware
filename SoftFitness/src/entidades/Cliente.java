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
public class Cliente {
    
    private Integer id;
    private String doc_identidad;
    private String nombre;
    private String apellido;
    private String correo;
    private String sexo;
    private String edad;
    private double peso;
    private String telefono_Movil;
    private String telefono_Fijo;
    private String direccion;
    private Date fecha_Reg;
    private String estado;
    private Integer id_membresia;

    public Cliente(Integer id, String doc_identidad, String nombre, String apellido, String correo,String sexo, String edad, double peso, String telefono_Movil, String telefono_Fijo, String direccion, Date fecha_Reg, String estado, Integer id_membresia) {
        this.id = id;
        this.doc_identidad = doc_identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo= correo;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.telefono_Movil = telefono_Movil;
        this.telefono_Fijo = telefono_Fijo;
        this.direccion = direccion;
        this.fecha_Reg = fecha_Reg;
        this.estado = estado;
        this.id_membresia = id_membresia;
    }

    public Cliente() {
    }
        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoc_identidad() {
        return doc_identidad;
    }

    public void setDoc_identidad(String doc_identidad) {
        this.doc_identidad = doc_identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTelefono_Movil() {
        return telefono_Movil;
    }

    public void setTelefono_Movil(String telefono_Movil) {
        this.telefono_Movil = telefono_Movil;
    }

    public String getTelefono_Fijo() {
        return telefono_Fijo;
    }

    public void setTelefono_Fijo(String telefono_Fijo) {
        this.telefono_Fijo = telefono_Fijo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_Reg() {
        return fecha_Reg;
    }

    public void setFecha_Reg(Date fecha_Reg) {
        this.fecha_Reg = fecha_Reg;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(Integer id_membresia) {
        this.id_membresia = id_membresia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
