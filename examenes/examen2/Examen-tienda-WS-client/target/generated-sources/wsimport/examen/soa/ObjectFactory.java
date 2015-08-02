
package examen.soa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the examen.soa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscaDirector_QNAME = new QName("http://soa.examen/", "buscaDirector");
    private final static QName _BuscaDirectorResponse_QNAME = new QName("http://soa.examen/", "buscaDirectorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: examen.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscaDirector }
     * 
     */
    public BuscaDirector createBuscaDirector() {
        return new BuscaDirector();
    }

    /**
     * Create an instance of {@link BuscaDirectorResponse }
     * 
     */
    public BuscaDirectorResponse createBuscaDirectorResponse() {
        return new BuscaDirectorResponse();
    }

    /**
     * Create an instance of {@link PeliculaTO }
     * 
     */
    public PeliculaTO createPeliculaTO() {
        return new PeliculaTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaDirector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.examen/", name = "buscaDirector")
    public JAXBElement<BuscaDirector> createBuscaDirector(BuscaDirector value) {
        return new JAXBElement<BuscaDirector>(_BuscaDirector_QNAME, BuscaDirector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaDirectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.examen/", name = "buscaDirectorResponse")
    public JAXBElement<BuscaDirectorResponse> createBuscaDirectorResponse(BuscaDirectorResponse value) {
        return new JAXBElement<BuscaDirectorResponse>(_BuscaDirectorResponse_QNAME, BuscaDirectorResponse.class, null, value);
    }

}
