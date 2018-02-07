/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echoserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Selvah
 */
public class Echoserver {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        Scanner scan = new Scanner(s.getInputStream());
        String str = scan.nextLine();
        while (!str.equals("bye")) {
            System.out.println(str);
            str=scan.nextLine();
        }
        System.out.println(str);
        scan.close();
        ss.close();
        s.close();
        
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
        
        
        
    }
    
}
