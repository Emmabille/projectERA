/**
 * 
 */
package fr.imie.projectERA.model;

import java.util.Date;

/**
 * Archive entity
 * @author aureliadelaune
 *
 */
public class Archive {
	private int idArchive;
	private String title;
	private String grade;
	private String specialty;
	private String nameTeacher;
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
