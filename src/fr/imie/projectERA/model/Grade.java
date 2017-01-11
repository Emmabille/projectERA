package fr.imie.projectERA.model;

import java.time.Year;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Grade {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idGrade;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private Year year;
	
	
	public Grade(){
		
	}


	/**
	 * @param idPromo
	 * @param name
	 * @param year
	 */
	public Grade(int idGrade, String name, Year year) {
		super();
		this.idGrade = idGrade;
		this.name = name;
		this.year = year;
	}


	/**
	 * @return the idPromo
	 */
	public int getIdGrade() {
		return idGrade;
	}


	/**
	 * @param idPromo the idPromo to set
	 */
	public void setIdGrade(int idGrade) {
		this.idGrade = idGrade;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the year
	 */
	public Year getYear() {
		return year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(Year year) {
		this.year = year;
	}
	
	
	

}
