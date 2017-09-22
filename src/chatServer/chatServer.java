package chatServer;

import java.net.*;
import java.io.*;
import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;



public class chatServer {
    public static void main(String[]args) {
        // ServerSocket being made:

        //ServerSocket ss;
        try {
            ServerSocket ss = new ServerSocket(8080);
            System.out.println("Server is running...");
            while(true) {
                Socket incoming = ss.accept();
                Runnable r = new chatClient(incoming);
                Thread t = new Thread(r);
                t.start();

            }

        } catch (IOException ex){
            ex.printStackTrace();
        }


}





















}

