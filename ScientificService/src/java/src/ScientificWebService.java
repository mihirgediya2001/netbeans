/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author HP
 */
@WebService()
public class ScientificWebService {

/**
     * Web service operation
     */
    @WebMethod(operationName = "sin")
    public double sin(@WebParam(name = "Input")
    double Input) {
        //TODO write your implementation code here:
        return Math.sin((Input*Math.PI)/180);
    }

}
