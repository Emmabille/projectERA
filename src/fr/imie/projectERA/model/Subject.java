package fr.imie.projectERA.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idSubject;
	@Column(nullable=false)
	private String title;
	@Column(nullable=false)
	private Date deadline;
	@Column(nullable=false)
	private int groupSize; 
	@Column(nullable=false)
	private String description;
	@Column(nullable=false)
	private int idPromo;
	@Column(nullable=false)
	private String specialty;
	@Column(nullable=false)
	private Date createAt;
	@Column(nullable=false)
	private ArrayList<Teacher> authors;
	@Column(nullable=false)
	private ArrayList<Homework> homework = new ArrayList<Homework>();
	
	public Subject(){
		
	}


	/**
	 * @param idSubject
	 * @param title
	 * @param deadline
	 * @param idgroupe
	 * @param description
	 * @param idPromo
	 */
	public Subject(int idSubject, String title, Date deadline, int groupSize, String description,
			int idPromo, String specialty, ArrayList<Teacher> Authors) {
		super();
		
		this.idSubject = idSubject;
		this.title = title;
		this.deadline = deadline;
		this.groupSize = groupSize;
		this.description = description;
		this.idPromo = idPromo;
		this.specialty= specialty;
		this.createAt= new Date();
		this.authors=Authors;
	}
	
	public void createSubject(){
		
	}
	
	public void consultSubject(){
		
	}
	
	public void updateSubject(){
		
	}
	
	public void AjouterAuteur(Teacher t){
		if (authors.size() < 2) {
			authors.add(t);
			System.out.println(t.getLastName() + " a �t� ajout� en tant qu'auteur");
		} else {
			System.out.println("err taille max d'auteurs");
		}		
	}
	
	public void RetirerAuteur(Teacher t){
		if (authors.size() > 1) {
			authors.remove(t);
			System.out.println(t.getLastName() + " a �t� retir� de la liste d'auteurs");
		} else {
			System.out.println("plus d'auteur pour le [" +  title + "]. Dernier enseignant : " + t.getLastName());
		}		
	}
	
	
	public void deleteSubject(){
		
	}


	/**
	 * @return the idSubject
	 */
	public int getIdSubject() {
		return idSubject;
	}


	/**
	 * @param idSubject the idSubject to set
	 */
	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
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
	 * @return the deadline
	 */
	public Date getDeadline() {
		return deadline;
	}


	/**
	 * @param deadline the deadline to set
	 */
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}


	/**
	 * @return the groupSize
	 */
	public int getGroupSize() {
		return groupSize;
	}


	/**
	 * @param groupSize the groupSize to set
	 */
	public void setGroupSize(int groupSize) {
		this.groupSize = groupSize;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the idPromo
	 */
	public int getIdPromo() {
		return idPromo;
	}


	/**
	 * @param idPromo the idPromo to set
	 */
	public void setIdPromo(int idPromo) {
		this.idPromo = idPromo;
	}


	/**
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}


	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Subject [idSubject=" + idSubject + ", title=" + title + ", deadline=" + deadline + ", groupSize="
				+ groupSize + ", description=" + description + ", idPromo=" + idPromo + ", specialty=" + specialty
				+", createAt=" +createAt+ "]";
		//Todo ajouter les auteurs associ�s
	}


	public void downloadHomework() {
		// TODO Auto-generated method stub
	//	task = new task 
	}


	
	
	
	
	
	
	
	

}
