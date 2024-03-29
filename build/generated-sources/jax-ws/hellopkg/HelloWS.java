
package hellopkg;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWS", targetNamespace = "http://helloPkg/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWS {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHello", targetNamespace = "http://helloPkg/", className = "hellopkg.GetHello")
    @ResponseWrapper(localName = "getHelloResponse", targetNamespace = "http://helloPkg/", className = "hellopkg.GetHelloResponse")
    @Action(input = "http://helloPkg/HelloWS/getHelloRequest", output = "http://helloPkg/HelloWS/getHelloResponse")
    public String getHello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
