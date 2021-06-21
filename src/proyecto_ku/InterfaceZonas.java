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
    
    private String Nombre;
    private String Informacion;
    private String DatosExtra;
    private int NumeroImagen;
    private String urlMapa;
    private int NumeroImagenMapa;
   
    public InterfaceZonas(){
        
    }

    public InterfaceZonas(String Nombre, String Informacion, String DatosExtra, int NumeroImagen, String urlMapa, int NumeroImagenMapa) {
        this.Nombre = Nombre;
        this.Informacion = Informacion;
        this.DatosExtra = DatosExtra;
        this.NumeroImagen = NumeroImagen;
        this.urlMapa = urlMapa;
        this.NumeroImagenMapa = NumeroImagenMapa;
    }

    
    //Metodos get
    public String getNombre() {
        return Nombre;
    }

    public String getInformacion() {
        return Informacion;
    }

    public String getDatosExtra() {
        return DatosExtra;
    }

    public int getNumeroImagen() {
        return NumeroImagen;
    }

    public String getUrlMapa() {
        return urlMapa;
    }

    public int getNumeroImagenMapa() {
        return NumeroImagenMapa;
    }
    
    //Metodos set

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setInformacion(String Informacion) {
        this.Informacion = Informacion;
    }

    public void setDatosExtra(String DatosExtra) {
        this.DatosExtra = DatosExtra;
    }

    public void setNumeroImagen(int NumeroImagen) {
        this.NumeroImagen = NumeroImagen;
    }

    public void setUrlMapa(String urlMapa) {
        this.urlMapa = urlMapa;
    }

    public void setNumeroImagenMapa(int NumeroImagenMapa) {
        this.NumeroImagenMapa = NumeroImagenMapa;
    }
    
}
