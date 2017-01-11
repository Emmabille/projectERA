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
 * Storage_entity
 * @author aureliadelaune
 *
 */
@Entity
public class Storage {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int idStorage;
    @Column(nullable=false)
	private String url;
    @Column(nullable=false)
	private int size;
	
	/**
	 * default constructor for the Storage entity.
	 */
	public Storage() {
		super();
	}
	
	/**
	 * full constructor for the Storage entity, with:
	 * @param idStorage
	 * @param url
	 * @param size
	 */
	public Storage(int idStorage, String url, int size) {
		super();
		this.idStorage = idStorage;
		this.url = url;
		this.size = size;
	}

	/**
	 * @return the idStorage
	 */
	public int getIdStorage() {
		return idStorage;
	}

	/**
	 * @param idStorage the idStorage to set
	 */
	public void setIdStorage(int idStorage) {
		this.idStorage = idStorage;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
