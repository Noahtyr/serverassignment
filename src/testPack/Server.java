package testPack;
import	java.io.IOException;
import	java.net.ServerSocket;
import	java.net.Socket;


  /*  public	class	Server
    {
        public	static	void	main(String[]	args)
        {

            ServerSocket	ss;
            try
            {
                ss	=	new	ServerSocket(8001);

                System.out.println("Server	kører...");
                while(true)
                {

                    Socket	incoming	=	ss.accept();

                    Runnable	r	=	new	ClientConnection(incoming);
                    Thread	t	=	new	Thread(r);
                    t.start();
                }
            }
            catch	(IOException	ex)
            {
                ex.printStackTrace();
            }
        }
    }
*/
