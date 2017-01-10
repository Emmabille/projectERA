package fr.imie.projectERA.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** Person bean. */
@Entity
public class Person {

	/** id of person. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	/** email of person. */
	@Column(name = "email", nullable = false, length = 60)
	private String email;

	/** password of person. */
	@Column(name = "password", nullable = false, length = 20)
	private String password;

	/** name of person. */
	@Column(name = "username", nullable = false, length = 20)
	private String name;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
