/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echoserver;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Selvah
 */
public class Echoclient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",3333);
            OutputStreamWriter dout = new OutputStreamWriter(s.getOutputStream());
            PrintWriter pw = new PrintWriter(dout);
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            while(!str.equals("bye")) {
                pw.println(str);
                pw.flush();
                str=scan.nextLine();
            }
            pw.println(str);
            dout.flush();
            dout.close();
            scan.close();
            s.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
