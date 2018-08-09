package ca.webcadastre.model.entity;

// default package
// Generated Aug 8, 2018 4:59:49 PM by Hibernate Tools 5.3.0.Beta2

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Person.
 * @see .Person
 * @author Hibernate Tools
 */
public class PersonHome {

	private static final Log log = LogFactory.getLog(PersonHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public Person findById(int id) {
		log.debug("getting Person instance with id: " + id);
		try {
			Person instance = (Person) sessionFactory.getCurrentSession().get("Person", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Person> findByExample(Person instance) {
		log.debug("finding Person instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("Person").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
	
	public List<Person> findAll() {
		log.debug("finding all the list of persons");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("Person").list();
			log.debug("find by all successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by all failed", re);
			throw re;
		}
	}
}
