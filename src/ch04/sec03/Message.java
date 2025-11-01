package ch04.sec03;

import java.util.ArrayList;

public final class Message {
    private String sender;
    private ArrayList<String> recipients;
    private String text;
    
    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
        recipients = new ArrayList<>();
    }
    
    public String getSender() {
		return sender;
	}
    
    public String getRecipientList() {
		return recipients.toString();
	}
    
    public String getText() {
		return text;
	}

    public void addRecipient(String recipient) { 
        recipients.add(recipient);
    };
    
    public Message clone() {
        try {
            var cloned = (Message) super.clone();
            @SuppressWarnings("unchecked") var clonedRecipients 
                = (ArrayList<String>) recipients.clone();
            cloned.recipients = clonedRecipients; 
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
