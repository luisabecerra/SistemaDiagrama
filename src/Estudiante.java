/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Estudiante extends Persona {
    private int grado;
    private String grupo;
    
    public void Estudiante(String horario,String domicilio,String nombre) {
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
 
    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
        System.out.println("El grado es: "+ grado);
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
        System.out.println("El grupo es:"+ grupo);
    }
    
    public void Estudiar(){
        System.out.println("Ha estado estudiando");
    }
}
