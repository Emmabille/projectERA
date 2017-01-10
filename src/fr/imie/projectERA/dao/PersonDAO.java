package fr.imie.projectERA.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.imie.projectERA.model.Person;

@Stateless
public class PersonDAO {
	
	@PersistenceContext(unitName="imiejpa_PU")
	private EntityManager em;
	
	public void create(Person person) throws DAOException {
		em.persist(person);
	}
	
	public void delete(Person person) throws DAOException {
		em.remove(person);
	}
	
	public Person get(String email) throws DAOException {
//requete JPQL. p.email:=email > permet de dire que c'est pas la chaine de caractere email mais un parametre
//p.email est en realité p.getEmail, donc bien faire ses getters/setters !
		String query = "SELECT p FROM Person p WHERE p.email:=email";
		Query q = em.createQuery(query);
		q.setParameter("email", email);
		
		Person person = (Person) q.getSingleResult();
		return person;
	}
	
	public Person get(int id) throws DAOException {
		Person person = em.find(Person.class, id);
		return person;
	}
	
	public List<Person> getAll() throws DAOException {
		String query = "SELECT p FROM Person p";
		Query q = em.createQuery(query);
		
		List<Person>persons = (List<Person>) q.getResultList();
		return persons;
	}
	
}
