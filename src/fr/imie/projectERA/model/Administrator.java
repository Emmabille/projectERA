/**
 * 
 */
package fr.imie.projectERA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Administrator entity
 * @author aureliadelaune
 */
@Entity
public class Administrator extends User {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int idAdmin;

	/**
	 * constructor by default for the Administrator entity
	 */
	public Administrator(){
		
	}
	
	/**
	 * full constructor for the Administrator entity, calling the User constructor, with:
	 * @param fname
	 * @param lname
	 * @param login
	 * @param password
	 * @param idAdmin
	 */
	public Administrator(String fname, String lname, String login, String password, int idAdmin) {
		super(fname, lname, login, password);
		this.setIdAdmin(idAdmin);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "idAdmin = " + idAdmin + ", " + super.toString();
	}
	

	/**
	 * @return the identifiantAdmin
	 */
	public int getIdAdmin() {
		return idAdmin;
	}

	/**
	 * @param identifiantAdmin the identifiantAdmin to set
	 */
	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	

}
