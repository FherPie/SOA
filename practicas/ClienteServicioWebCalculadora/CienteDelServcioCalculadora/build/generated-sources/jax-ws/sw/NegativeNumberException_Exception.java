
package sw;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NegativeNumberException", targetNamespace = "http://calculadora.jtech/")
public class NegativeNumberException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NegativeNumberException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public NegativeNumberException_Exception(String message, NegativeNumberException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public NegativeNumberException_Exception(String message, NegativeNumberException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: sw.NegativeNumberException
     */
    public NegativeNumberException getFaultInfo() {
        return faultInfo;
    }

}