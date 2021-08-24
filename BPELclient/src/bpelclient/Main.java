/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bpelclient;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try { // Call Web Service Operation
            src.SinAplusBService service = new src.SinAplusBService();
            src.SinAplusBPortType port = service.getSinAplusBPort();
            // TODO initialize WS operation arguments here
            double partA = 15.0;
            double partB = 15.0;
            // TODO process result here
            double result = port.sinAplusBOperation(partA, partB);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }

}
