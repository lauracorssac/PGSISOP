import javax.websocket.server.ServerEndpoint;
import javax.websocket.Session;
import javax.websocket.OnOpen;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

@ServerEndpoint("/chat")
public class ChatServer {

	private static ArrayList<Session> listOfSessions = new ArrayList<Session>();
	private static Logger logger = Logger.getLogger(ChatServer.class.getName());

	@OnOpen
	public void onOpen(Session session) throws IOException {
		this.logger.log(Level.INFO, "opening session with ID = ", session.getId());
	
		this.listOfSessions.add(session);
	}
	
	@OnClose
	public void onClose(Session session) throws IOException {
		//, session.getId()
		this.logger.log(Level.INFO, "closing session with ID = ");
		
		this.listOfSessions.remove(session);
	
	}
	
	@OnMessage
	public void onMessage(String message, Session session) throws IOException {
		//session.getId()
		this.logger.log(Level.INFO, "receiving message from session with ID = ");
		//message.getContent()
		this.logger.log(Level.INFO, "message content = ");
		
		for (Session sess : this.listOfSessions) {
		
			this.logger.log(Level.INFO, "sending to session with ID = ", sess.getId());
			sess.getBasicRemote().sendText(message);
		
		}
	
	
	}

}
