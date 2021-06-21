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
public abstract class InterfaceZonas {
    
    //Instancio variables
    String Nombre,Informacion,DatosExtra,urlMapa,NombreEspanol;
    int NumeroImagen, NumeroImagenMapa,ObtenerPosicion;
   //

    public InterfaceZonas() {
        
    }
    
    public InterfaceZonas(String Nombre,String NombreEspanol , String Informacion, String DatosExtra, String urlMapa, int NumeroImagenMapa, int NumeroImagen, int ObtenerPosicion) {
        this.Nombre = Nombre;
        this.NombreEspanol = NombreEspanol;
        this.Informacion = Informacion;
        this.DatosExtra = DatosExtra;
        this.urlMapa = urlMapa;
        this.NumeroImagenMapa = NumeroImagenMapa;
        this.NumeroImagen = NumeroImagen;
        this.ObtenerPosicion = ObtenerPosicion;
    }
    
    public abstract void Interface();

    //Metodos get
    public int getObtenerPosicion() {
        return ObtenerPosicion;
    }
    
    public String getNombreEspanol() {
        return NombreEspanol;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public String getInformacion() {
        return Informacion;
    }

    public String getDatosExtra() {
        return DatosExtra;
    }

    public String getUrlMapa() {
        return urlMapa;
    }

    public int getNumeroImagenMapa() {
        return NumeroImagenMapa;
    }

    public int getNumeroImagen() {
        return NumeroImagen;
    }

    
    //Metodos set
    public void setObtenerPosicion(int ObtenerPosicion) {
        this.ObtenerPosicion = ObtenerPosicion;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setInformacion(String Informacion) {
        this.Informacion = Informacion;
    }

    public void setDatosExtra(String DatosExtra) {
        this.DatosExtra = DatosExtra;
    }

    public void setUrlMapa(String urlMapa) {
        this.urlMapa = urlMapa;
    }

    public void setNumeroImagenMapa(int NumeroImagenMapa) {
        this.NumeroImagenMapa = NumeroImagenMapa;
    }

    public void setNumeroImagen(int NumeroImagen) {
        this.NumeroImagen = NumeroImagen;
    }
    
    public String setNombreEspanol() {
        return NombreEspanol;
    }

    
    
 
}
