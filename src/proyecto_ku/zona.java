/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ku;

/**
 *
 * @author JHPAT
 */
public abstract class zona {
    
    //Declarar variables 
    private String nombre;
    private String informacion;
    private String datos_curiosos;
    
    public zona(String nombre, String informacion, String datos_curiosos){
        
        this.nombre =  nombre;
        this.informacion =  nombre;
        this.datos_curiosos =  datos_curiosos;
        
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
     public String getInfo(){
        return informacion;
    }
     
     public String getDatosCuriosos(){
        return datos_curiosos;
    }
    
    
}
