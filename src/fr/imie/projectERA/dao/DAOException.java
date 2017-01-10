package fr.imie.projectERA.dao;

public class DAOException extends RuntimeException {

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DAOException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public DAOException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public DAOException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
}
