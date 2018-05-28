package xyz;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: Mdb
 */
@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "Queue1"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Queue")
		}, 
		mappedName = "Queue1")
public class Mdb implements MessageListener {


    public void onMessage(Message message) {
        
    	try {
    		TextMessage msg=(TextMessage) message;  
        	System.out.println("MDB got msg: "+  msg.getText());
    	} catch(Exception e) {
    		System.out.println(e);
    	}
        
    }

}
