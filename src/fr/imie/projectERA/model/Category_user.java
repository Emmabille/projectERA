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
 * Category_user entity
 * @author aureliadelaune
 *
 */
@Entity
public class Category_user {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCategory;
	@Column(nullable=false)
	private String categoryUser;
	
	/**
	 * Default constructor for Category_use entity.
	 */
	public Category_user() {

	}

	/**
	 * Full constructor for the Category_user entity, with:
	 * @param id
	 * @param categoryUser
	 */
	public Category_user(int id, String categoryUser) {
		this.idCategory = id;
		this.categoryUser = categoryUser;
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return idCategory;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idCategory = id;
	}

	/**
	 * @return the categoryUser
	 */
	public String getCategoryUser() {
		return categoryUser;
	}

	/**
	 * @param categoryUser the categoryUser to set
	 */
	public void setCategoryUser(String categoryUser) {
		this.categoryUser = categoryUser;
	}
	
	
}
