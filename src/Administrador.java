/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */

public class Administrador extends Persona   {
    String puesto;

    public void Administrador(String horario,String domicilio,String nombre) {
        super.Asistir(); 
        super.setHorario(horario); 
        super.setDomicilio(domicilio);
        super.setNombre(nombre);
    }

    @Override
    public String getHorario() {
        return super.getHorario();
    }

    @Override
    public String getDomicilio() {
        return super.getDomicilio(); 
    }

    @Override
    public String getNombre() {
        return super.getNombre(); 
    }

    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
        System.out.println(" es "+ puesto);
    }

    public void Administrar(){
        System.out.println("Ha estado administrando");
    }
}