/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Team5163;

import java.io.IOException;
import java.io.PrintWriter;
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
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        String message = "01Hi, This is a test message sent by a client1234567890";
        out.println(message);
        socket.close();
    }
}
