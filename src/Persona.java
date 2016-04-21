/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Persona {
    private String  nombre;
    private String domicilio;
    private String horario;

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("El nombre completo es:"+ nombre);
    }

    public String getDomicilio() {
        return domicilio;
        
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
        System.out.println("Vive en "+ domicilio);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
        System.out.println("El horario es:"+ horario);
    }
    
    public void Asistir(){
        
    }
    
}
