/**
 * 
 */
package fr.imie.projectERA.model;

/**
 * Teacher entity
 * @author aureliadelaune
 *
 */
public class Teacher extends User{
	private int idTeacher;

	/**
	 * constructor by default for the Teacher entity
	 */
	public Teacher(){
		
	}
	public Teacher(String lname, String fname, String login, String email){
		super(lname, fname, login, email);	
		}
	
	/**
	 * full constructor for the Teacher entity, calling for the User constructor, with:
	 * @param fname
	 * @param lname
	 * @param login
	 * @param password
	 * @param idTeacher
	 */
	public Teacher(int idTeacher, String fname, String lname, String login, String password) {
		super(fname, lname, login, password);
		this.setIdTeacher(idTeacher);
		
	}

/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "idTeacher = " + idTeacher + ", "+ super.toString();
	}

/**
 * downloadHomework method
 */
	public void downloadHomework(){
		
	}
	
	/**
	 * @return the idTeacher
	 */
	public int getIdTeacher() {
		return idTeacher;
	}

	/**
	 * @param idTeacher the idTeacher to set
	 */
	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}

}