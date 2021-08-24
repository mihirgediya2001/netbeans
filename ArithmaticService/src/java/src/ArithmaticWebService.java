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
public class ArithmaticWebService {

/**
     * Web service operation
     */
    @WebMethod(operationName = "addition")
    public double addition(@WebParam(name = "p1")
    double p1, @WebParam(name = "p2")
    double p2) {
        //TODO write your implementation code here:
        return p1+p2;
    }

}
