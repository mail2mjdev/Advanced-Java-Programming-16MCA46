package mdb12client;

import javax.naming.*;
import javax.jms.*;  


public class MdbClient {

	public static void main(String[] args) {
		
		try{  
			 
			InitialContext ctx=new InitialContext();  
			QueueConnectionFactory f=(QueueConnectionFactory)ctx.lookup("GFConnectionFactory");  
			QueueConnection con=f.createQueueConnection();  
			con.start();  
			QueueSession ses=con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);  
			Queue t=(Queue)ctx.lookup("Queue1");     
			QueueSender sender=ses.createSender(t);   
			TextMessage msg=ses.createTextMessage();  
			msg.setText("Hi from Client");
			sender.send(msg);
			con.close();  
			System.out.println("Message Sent");
			} 

		catch (Exception e){
			System.out.println(e);
			}

	}

}
