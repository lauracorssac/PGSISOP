package javax.websocket.server;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.server.Session;
import javax.websocket.onOpen;
import javax.websocket.onClose;
import javax.websocket.onMessage;
//import java.util.ArrayList;
//import java.util.logging.Logger;
//import java.util.logging.Level;

@ServerEndpoint("/chat")
public class ChatServer {

	//private static ArrayList<Session> listOfSessions = new ArrayList<Session>();
	//private static Logger logger = Logger.getLogger(ChatServer.class.getName());

	/*
	@onOpen
	public void onOpen(Session session) throws IOException {
		this.logger.log(LEVEL.INFO, "opening session with ID = ", session.getId());
	
		this.listOfSessions.add(session);
	}
	
	@onClose
	public void onClose(Session session) throws IOException {
		//, session.getId()
		this.logger.log(LEVEL.INFO, "closing session with ID = ");
		
		this.listOfSessions.remove(session);
	
	}
	
	@onMessage
	public void onMessage(Session session, Message message) throws IOException {
		//session.getId()
		this.logger.log(LEVEL.INFO, "receiving message from session with ID = ");
		//message.getContent()
		this.logger.log(LEVEL.INFO, "message content = ");
		
		for (Session session : this.listOfSessions) {
		
			this.logger.log(LEVEL.INFO, "sending to session with ID = ", session.getId());
			session.getBasicRemote().sendText(message);
		
		}
	
	
	}
	*/
	

}
