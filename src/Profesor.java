/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Profesor extends Persona {
    private String carrera;
    
    public void Profesor(String horario,String domicilio,String nombre) {
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
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
        System.out.println("El profesor estudio "+ carrera);
    }
    
    public void Ensenar(){
        System.out.println("Ha estado ensenando");
    }
}
