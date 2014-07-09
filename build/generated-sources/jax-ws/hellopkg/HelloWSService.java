
package hellopkg;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWSService", targetNamespace = "http://helloPkg/", wsdlLocation = "http://localhost:8084/Hello_WS/HelloWS?wsdl")
public class HelloWSService
    extends Service
{

    private final static URL HELLOWSSERVİCE_WSDL_LOCATION;
    private final static WebServiceException HELLOWSSERVİCE_EXCEPTION;
    private final static QName HELLOWSSERVİCE_QNAME = new QName("http://helloPkg/", "HelloWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/Hello_WS/HelloWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWSSERVİCE_WSDL_LOCATION = url;
        HELLOWSSERVİCE_EXCEPTION = e;
    }

    public HelloWSService() {
        super(__getWsdlLocation(), HELLOWSSERVİCE_QNAME);
    }

    public HelloWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWSSERVİCE_QNAME, features);
    }

    public HelloWSService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWSSERVİCE_QNAME);
    }

    public HelloWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWSSERVİCE_QNAME, features);
    }

    public HelloWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWS
     */
    @WebEndpoint(name = "HelloWSPort")
    public HelloWS getHelloWSPort() {
        return super.getPort(new QName("http://helloPkg/", "HelloWSPort"), HelloWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWS
     */
    @WebEndpoint(name = "HelloWSPort")
    public HelloWS getHelloWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://helloPkg/", "HelloWSPort"), HelloWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWSSERVİCE_EXCEPTION!= null) {
            throw HELLOWSSERVİCE_EXCEPTION;
        }
        return HELLOWSSERVİCE_WSDL_LOCATION;
    }

}
