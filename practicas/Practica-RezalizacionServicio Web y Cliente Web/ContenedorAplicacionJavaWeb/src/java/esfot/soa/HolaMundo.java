/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfot.soa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Patricio
 */
@WebService(serviceName = "HolaMundo")
public class HolaMundo {
    /**
     * Web service operation
     */
    @WebMethod(operationName = "saluda")
    public String  saluda(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return " Realice Este Servicio Web y su nombre es:  "+nombre+ " Que tal Como estas?";
    }
}
