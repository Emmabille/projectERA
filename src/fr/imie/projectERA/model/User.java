/**
 * 
 */
package fr.imie.projectERA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User entity
 * 
 * @author aureliadelaune
 *
 */
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idUser;
	@Column(nullable=false)
	protected String firstName;
	@Column(nullable=false)
	protected String lastName;
	@Column(nullable=false)
	protected String userName;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String email;
	/**
	 * default constructor for the User entity, no parameter
	 */
	public User() {
	}
	
	public User(String fname, String lname, String login, String email){
		this.lastName = lname;		
		this.firstName = fname;
		this.userName = login;
		this.setEmail(email);
	}
/**
 * full constructor for the User entity, with:
 * @param fname
 * @param lname
 * @param login
 * @param password
 */

	
	public User(String fname, String lname, String login, String password, String email){
		this.firstName = fname;
		this.lastName = lname;
		this.userName = login;
		this.password = password;
		this.setEmail(email);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * toString method for the User entity
	 */
	@Override
	public String toString() {
		return "First Name = " + firstName + ", Last Name = " + lastName + ", User Name = " + userName + ", Password = "
				+ password;
	}

	/**
	 * connect method
	 */
	public void connect() {

	}

	/**
	 * disconnect method
	 */
	public void disconnect() {

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return idUser;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.idUser = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		// PasswordEncoder crypto = new Md5PasswordEncoder();
		// this.password = crypto.encodePassword(password, null);
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}