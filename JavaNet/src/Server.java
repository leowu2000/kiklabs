import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class Server {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, Exception {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(9999);
		Socket s;
		while(true){
			s=server.accept();
			InputStream in= s.getInputStream();
			byte[] b = new byte[2];
			while((in.read(b))>0){
				System.out.print(new String(b).trim());
			}
			in.close();
			s.close();
		}
	}

}
