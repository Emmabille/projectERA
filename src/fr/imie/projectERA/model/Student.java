package fr.imie.projectERA.model;

public class Student extends User{

	private int idStudent;
//groupID vraiment necessaire?
	private int idGroup;
	private int promo;	
	
	public Student(){ 
		super();
	}

	/**
	 * full constructor for the Student entity, with :
	 * @param fname
	 * @param lname
	 * @param login
	 * @param password
	 * @param identifiantStudent
	 * @param idGroup
	 * @param promo
	 */
	public Student(String fname, String lname, String login, String password, String email, 
			int idStudent, int idGroup, int promo) {
		super(fname, lname, login, password, email);
		this.idStudent = idStudent;
		this.idGroup = idGroup;
		this.promo = promo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student idStudent=" + idStudent + ", idGroup=" + idGroup + ", promo=" + promo + 
				super.toString()+"";				
	}


	/**
	 * @return the identifiantStudent
	 */
	public int getIdStudent() {
		return idStudent;
	}

	/**
	 * @param identifiantStudent the identifiantStudent to set
	 */
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	/**
	 * @return the idGroupe
	 */
	public int getIdGroup() {
		return idGroup;
	}

	/**
	 * @param idGroupe the idGroupe to set
	 */
	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	/**
	 * @return the promo
	 */
	public int getPromo() {
		return promo;
	}
	
	/**
	 * @param promo the promo to set
	 */
	public void setPromo(int promo) {
		this.promo = promo;
	}
}
	