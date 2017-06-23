package org.rf.test.main.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
	@JmsListener(destination = "queue1")
	public void receiveMessage(String msg) {
		System.out.println("Received Message from queue :" + msg);
	}

}
