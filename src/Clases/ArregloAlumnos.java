/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Arrays;

/**
 *
 * @author cubas
 */
public class ArregloAlumnos {
    private Alumno AlumnoA[];
    private int indice;

    public ArregloAlumnos(int cantidadalumnos) {
      
        this.indice = 0;
        this.AlumnoA = new Alumno[cantidadalumnos];
    }

    public Alumno[] getAlumnoA() {
        return AlumnoA;
    }

    public int getIndice() {
        return indice;
    }
    
    public boolean agregarAlumno(Alumno alumno){
        boolean result=false;
        if(verificarrepetidos(alumno.getCodigo())==false){
            
                Alumno TempAlumnos[];
                TempAlumnos = new Alumno[this.indice+1];


                for(int i=0;i<this.indice;i++){
                    TempAlumnos[i]= this.AlumnoA[i];

                }

               this.AlumnoA = TempAlumnos;
        
               this.AlumnoA[this.indice] = alumno;  
               this.indice++;
               result= true;
               
               System.out.println("Alumno agregado con exito");
  
        }
        
        return result;
        
        /*
        */
    }
    public boolean verificaralumno(String contrasena,String codigo){ //Esto se usa para verificar si el alumno que intenta logearse ya esta en el sistema
        boolean result=false;
          for (int i=0;i<this.indice;i++){
            if (this.AlumnoA[i].getCodigo().equals(codigo)&&this.AlumnoA[i].getContraseña().equals(contrasena)){
                result = true;
                
                break;
            }               
        }
            return result;
    }
    
    public Alumno devolveralumno(String codigo){
        Alumno result=null; 
        for (int i=0;i<this.indice;i++){
            if (this.AlumnoA[i].getCodigo().equalsIgnoreCase(codigo)){
                result = AlumnoA[i];
                break;
            }               
        }
        return result;
    }
    
    public boolean verificarrepetidos(String codigo){
        boolean result=false;
        
        for (int i=0;i<this.indice;i++){
            if (this.AlumnoA[i].getCodigo().equals(codigo)){
                result = true;
                System.out.println("El alumno ya se encuentra registrado\n");
                break;
            }               
        }        
                
        
        return result;
    }
    
    public void incrementarTamañoArreglo(){
             Alumno aux[] = new Alumno[this.indice+1];
             
             for (int i = 0; i < this.indice; i++) {
                  aux[i] = AlumnoA[i];
        }
             AlumnoA = aux;
    }
    
    @Override
    public String toString() {
        return "ArregloAlumnos{" + "AlumnoA=" + Arrays.toString(AlumnoA) + ", indice=" + indice + '}';
    }
    
    
}
