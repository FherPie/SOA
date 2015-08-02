/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.soa;

import esfot.clase.PeliculaTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Patricio
 */
@WebService(serviceName = "TiendaDvdWS")
public class TiendaDvdWS {
final static PeliculaTO[] peliculas={
new PeliculaTO("Mulholland Drive", "David Lynch", 26.96f),
new PeliculaTO("Carretera perdida", "David Lynch", 18.95f),
new PeliculaTO("Twin Peaks", "David Lynch", 46.95f),
new PeliculaTO("Telefono rojo", "Stanley Kubrick", 15.95f),
new PeliculaTO("Barry Lyndon", "Stanley Kubrick", 24.95f),
new PeliculaTO("La naranja mecánica", "Stanley Kubrick", 22.95f)

};
    /**
     * This is a sample web service operation
//     */
//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscaDirector")
    public List<PeliculaTO> buscaDirector(@WebParam(name = "director") String director) {
       
        
director= director.toUpperCase();

ArrayList<PeliculaTO> listas= new ArrayList<PeliculaTO>();



for(PeliculaTO peli:peliculas){

if(peli.getDirector().toUpperCase().indexOf(director)!=-1){


listas.add(peli);
}


}





//TODO write your implementation code here:
        return listas;
    }
    
    
    
    
    
}
