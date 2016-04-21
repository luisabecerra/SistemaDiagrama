/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */


public class Empleado extends Persona{
    String jefe;
    
    public void Empleado(String horario,String domicilio,String nombre) {
        super.Asistir(); 
        super.setHorario(horario); 
        super.setDomicilio(domicilio);
        super.setNombre(nombre);
    }

    public String getHorario() {
        return super.getHorario(); 
    }

    public String getDomicilio() {
        return super.getDomicilio(); 
    }

    public String getNombre() {
        return super.getNombre(); 
    }
    
    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
        System.out.println("Su jefe es:"+ jefe);
    }
    
    
    public void Cobrar (){
        
    }
    
}