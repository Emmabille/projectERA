package fr.imie.projectERA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notification {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int idNotification;
@Column(nullable=false)
 private String coreMessage;
@Column(nullable=false)
 private String titleMessage;
 
 public Notification(){
	 
 }
 
 /**
	 * @param idNotification
	 * @param coreMessage
	 * @param titleMessage
	 */
	public Notification(int idNotification, String coreMessage, String titleMessage) {
		super();
		this.idNotification = idNotification;
		this.coreMessage = coreMessage;
		this.titleMessage = titleMessage;
	}
    
	public void mailTo(){
		
	}
 
 

/**
 * @return the idNotification
 */
public int getIdNotification() {
	return idNotification;
}

/**
 * @param idNotification the idNotification to set
 */
public void setIdNotification(int idNotification) {
	this.idNotification = idNotification;
}

/**
 * @return the coreMessage
 */
public String getCoreMessage() {
	return coreMessage;
}

/**
 * @param coreMessage the coreMessage to set
 */
public void setCoreMessage(String coreMessage) {
	this.coreMessage = coreMessage;
}

/**
 * @return the titleMessage
 */
public String getTitleMessage() {
	return titleMessage;
}

/**
 * @param titleMessage the titleMessage to set
 */
public void setTitleMessage(String titleMessage) {
	this.titleMessage = titleMessage;
}
 
 
 
}
