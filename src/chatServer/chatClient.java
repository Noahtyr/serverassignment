package chatServer;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.IOException;
import java.net.SocketException;
import java.util.Scanner;

public class chatClient implements Runnable {

    private Socket s;

    public chatClient(Socket s) throws SocketException,IOException {

        this.s =s;

    }
    @Override
    public void run() {
        try {
            try {
                InputStream input = s.getInputStream();
                OutputStream output = s.getOutputStream();

                Scanner in = new Scanner(input);
                PrintWriter out = new PrintWriter(output,true);
                 out.println("Welcome!");

                 boolean done = false;
                 while(true){
                     if (!(!done && in.hasNextLine())) break;
                     String stream = in.nextLine();
                     if(stream.equals("close")){
                         done= true;

                     }else {
                         out.println(stream);
                     }
                 }

            }
            finally {
                s.close();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
