import java.net.ServerSocket;
import java.net.Socket;

public class GameServer implements Runnable {
	
	ServerSocket ss=null;//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GameServer server=new GameServer();		        // 서버 가동
		 
		new Thread(server).start();
	}
	public GameServer(){
		try
		{
			ss=new ServerSocket(65535);
			System.out.println("NEW Server Start...");
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public void run()							// 1. 접속을 처리
    {
    	while(true){
	    	try{
	    		Socket s=ss.accept();		//s => client    		
	    	//	ClientThread ct=new ClientThread(s);
	    	//	ct.start();					// 통신 시작 	
	    	}catch(Exception ex){}
    	}	
    }

}
