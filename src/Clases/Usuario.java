/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author cubas
 */
public abstract class Usuario {
    protected String contrasena;
    protected String nombres;
    protected String apellidos;
    protected String codigo; 

    public Usuario(String contrasena, String nombres, String apellidos, String codigo) {
        this.contrasena = contrasena;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }

    public Usuario(String contrasena, String codigo) {//Para validar al usuario necesitaremos la contraseña y el codidgo
        this.contrasena = contrasena;
        this.codigo = codigo;
    }

    
    

    public String getContraseña() {
        return contrasena;
    }

    public String getNobmres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public boolean logearse(String contrasena,String codigo, ArregloAlumnos alumnosRegistrados){
     return alumnosRegistrados.verificaralumno(contrasena,codigo);
    }

    
    public Alumno mostrarAlumno(String codigo, ArregloAlumnos alumnosRegistrados){
     return alumnosRegistrados.devolveralumno(codigo);
    }
    
    
    
    @Override
    public String toString() {
        return "Usuario{" + "contrasena=" + contrasena + ", nombres=" + nombres + ", apellidos=" + apellidos + ", codigo=" + codigo + '}';
    }

    
    

}
