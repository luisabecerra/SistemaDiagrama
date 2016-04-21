/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrador Juan = new Administrador();
        Juan.Administrador("8-5", "Cra 7", "Juan Andres Romero");
        Juan.setPuesto("Administrdor");
        Juan.Administrar();
        
        Profesor Pedro = new Profesor ();
        Pedro.Profesor("7-5", "Hayuelos", "Pedro Fontana Cruz");
        Pedro.Asistir();
        Pedro.Ensenar();
        Pedro.setCarrera("Ingenieria Agricola");
        
        Estudiante Laura= new Estudiante();
        Laura.Estudiante("11-7", "San Fernando", "Laura Camila Puertas Rojas");
        Laura.Asistir();
        Laura.setGrado(11);
        Laura.setGrupo("c");
        Laura.Estudiar();
        
        
       
    }
    
}
