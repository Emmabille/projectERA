/**
 * 
 */
package fr.imie.projectERA.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Archive entity
 * @author aureliadelaune
 *
 */
@Entity
public class Archive {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idArchive;
	@Column(nullable=false)
	private String title;
	@Column(nullable=false)
	private String grade;
	@Column(nullable=false)
	private String specialty;
	@Column(nullable=false)
	private String nameTeacher;
	@Column(nullable=false)
	private Date createAt;
	
	/**
	 * Default constructor for the Archive entity.
	 */
	public Archive(){
		
	}

	/**
	 * Constructor for the Archive entity, with:
	 * @param idArchive
	 * @param title
	 * @param grade
	 * @param specialty
	 * @param nameTeacher
	 * @param createAt
	 */
	public Archive(int idArchive) {
		this.idArchive = idArchive;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * toString method for the Archive entity.
	 */
	@Override
	public String toString() {
		return "Archive [identifiant = " + idArchive + ", title = " + title + ", grade = " + grade
				+ ", specialty = " + specialty + ", teacher's name = " + nameTeacher + ", createAt =" + createAt + "]";
	}
	
	
}
