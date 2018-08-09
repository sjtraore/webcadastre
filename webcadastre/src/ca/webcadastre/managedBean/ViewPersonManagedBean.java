package ca.webcadastre.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ca.webcadastre.model.entity.Person;
import ca.webcadastre.model.entity.PersonHome;

@ManagedBean
@SessionScoped
public class ViewPersonManagedBean {
	private List<Person> persons = new ArrayList<Person>();
	@PostConstruct
	public void populateEmployeeList() {
		PersonHome ph = new PersonHome();
		persons = ph.findAll();
	}
	public List<Person> getPersons() {
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}


}
