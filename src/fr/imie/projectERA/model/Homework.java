package fr.imie.projectERA.model;

import java.util.Date;

//HomeWork
public class Homework {
	private int idTask;
	private String title;
	private Date deposedAt;
	private String document;
	
	public Homework(){
		
	}
	
	public Homework(int idTask, String title, String document) {
		super();
		this.idTask = idTask;
		this.title = title;
		this.document = document;
		this.deposedAt = new Date();
	}
	
	
	public void addDocument(){
		
		
	}
	public void deleteDocument(){
		
	}
	public void consult(){
		
	}
	public void download(){
		
	}

	/**
	 * @return the idTask
	 */
	public int getIdTask() {
		return idTask;
	}

	/**
	 * @param idTask the idTask to set
	 */
	public void setIdTask(int idTask) {
		this.idTask = idTask;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the deposedAt
	 */
	public Date getDeposedAt() {
		return deposedAt;
	}

	/**
	 * @param deposedAt the deposedAt to set
	 */
	public void setDeposedAt(Date deposedAt) {
		this.deposedAt = deposedAt;
	}

	/**
	 * @return the documents
	 */
	public String getDocument() {
		return document;
	}

	/**
	 * @param documents the documents to set
	 */
	public void setDocument(String documents) {
		this.document = documents;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Task [idTask=" + idTask + ", title=" + title + ", deposedAt=" + deposedAt + ", document=" + document
				+ "]";
	}
	
	
	
	
	
	
	

}
