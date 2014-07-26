/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Team5163;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Yiwen Dong
 */
public class TeamTrackerClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket = new Socket("localhost", 5163);
        
    }
}
