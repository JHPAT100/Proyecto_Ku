/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ku;

import javax.swing.JOptionPane;

/**
 *
 * @author JHPAT
 */
public class Zonas extends InterfaceZonas {
    
    private int posicion;
    
    public Zonas(){
   
}
     
    
    public Zonas(int pos){
    posicion = pos;
}
      

    @Override
    public void Interface() {
        switch(posicion){
         case 1:
           Nombre =  "CHICHÉN ITZÁ";
           Informacion = "La ciudad prehispánica Chichén Itzá, que fue la capital más sobresaliente del área Maya. "
                   + "\nActualmente esta es la más popular en México y una de las Nuevas Maravillas del Mundo.\n" 
                   + "\nSu nombre hace referencia al Cenote Sagrado, el gran pozo natural que los habitantes de la "
                   + "\nregión consideraban una de las entradas principales al inframundo, sede de importantes dioses,"
                   + "\ncomo los de la lluvia. Además, el nombre del sitio alude a los itzaes, poderosos señores "
                   + "\nmítico-históricos de la ciudad durante la época de su crecimiento y apogeo";
           DatosExtra = "Otros edificios importantes que hay en esta ciudad son el Observatorio, también conocido "
                   + "\ncomo el Caracol, el Templo de los Guerreros, el complejo de Juego de Pelota, entre otros";
           NombreEspanol = "”BOCA DEL POZO DE LOS ITZAES”";
         break;
         
         case 2:
           Nombre = "UXMAL";
           Informacion = "Es sin duda el asentamiento más representativo de la arquitectura de la Región Puuc. "
                   + "\nEn este las fachadas están decoradas con mascarones de Chac, el Dios de la Lluvia, grecas, "
                   + "\npaneles con jeroglíficos y altas cresterías. Entre los edificios más representativos están"
                   + "\nla Pirámide del Adivino, el Cuadrángulo de las Monjas y la Casa de las Palomas";
           DatosExtra = "Algo que diferenció el estilo de vida de los habitantes de Uxmal de los demás mayas,"
                   + "\nfue la falta de fuentes de agua permanentes a sus alrededores. Por tal razón, se vieron"
                   + "\nen la necesidad de construir Chultunes, o depósitos de agua, y un complejo "
                   + "\nsistema de aguadas y bukteoobob, para aprovechar el agua de lluvia.";
           NombreEspanol = "”TRES VECES CONSTRUIDA”";    
         break;
         
         case 3:
           Nombre = "COBÁ";
           Informacion = "La antigua ciudad maya de Cobá se desarrolló cerca de cinco lagos que fueron un factor "
                   + "\nfundamental para su desarrollo y subsistencia. La ciudad estaba comunicada sacbés, "
                   + "\nextensos caminos levantados de piedra, los cuales todavía se pueden observar al "
                   + "\nvisitar este sitio arqueológico maya."
                   + "\nEl más largo de ellos con 100 km., llega al sitio de Yaxuná, muy cerca de Chichén Itzá.";
           DatosExtra = "Al visitar Cobá, hay una cosa que no te puedes perder. "
                   + "\nObservar de cerca las estelas que se encontraron aquí. "
                   + "\nEn las inscripciones de la Estela 1 se puede leer la fecha 12 de "
                   + "\nDiciembre de 2012 que representa el comienzo de una nueva cuenta en el calendario maya.";
           NombreEspanol = "”AGUA PICADA”";  
         break;
         
         case 4:
           Nombre = "TULUM";
           Informacion = "El templo principal de Tulum es el Castillo, es el más alto y cuenta con tres accesos decorados "
                   + "\ncon columnas en forma de serpientes y dos mascarones zoomorfos en las esquinas. Frente al "
                   + "\nCastillo hay una plataforma grande que se cree se utilizaba para danzas y al suroeste "
                   + "\nencuentra el Templo de la Serie Inicial, donde se encontró la fecha más temprana "
                   + "\ndocumentada en Tulum: 564 d.C";
           DatosExtra = "Antes de llamarse Tulum, a este paradisíaco sitio se le conocía como “Zamá”, "
                   + "\nque en maya significa “mañana” o “amanecer”. El nombre de Tulum se traduce como "
                   + "\n“muralla” en alusión a la muralla que aquí se conserva.";
           NombreEspanol = "”AMANECER”";  
         break;
            
         
     }
    }
}
