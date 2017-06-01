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
public class Instructor {
    
    private int id;
    private String doc_identidad;
    private String nombre;
    private String apellido;
    private String correo;
    private String sexo;
    private String edad;
    private String telefono_Movil;
    private String telefono_Fijo;
    private String direccion;
    private String descripcion;

    public Instructor(Integer id, String doc_identidad, String nombre, String apellido, String correo,String sexo, String edad, String telefono_Movil, String telefono_Fijo, String direccion, String descripcion) {
        this.id = id;
        this.doc_identidad = doc_identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo= correo;
        this.sexo = sexo;
        this.edad = edad;
        this.telefono_Movil = telefono_Movil;
        this.telefono_Fijo = telefono_Fijo;
        this.direccion = direccion;
        this.descripcion = descripcion;
    }

    public Instructor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
