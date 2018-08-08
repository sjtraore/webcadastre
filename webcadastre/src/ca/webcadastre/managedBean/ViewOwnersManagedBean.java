package ca.webcadastre.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ca.webcadastre.entity.Owner;

@ManagedBean
@SessionScoped
public class ViewOwnersManagedBean {
	private List<Owner> owners = new ArrayList<Owner>();

	public ViewOwnersManagedBean() {

	}

	@PostConstruct
	public void populateEmployeeList() {
		for (int i = 1; i <= 10; i++) {
			Owner owner = new Owner();
			owner.setOwnerId(String.valueOf(i));
			owner.setFirstname("Firstname # " + i);
			owner.setLastname("Lastname # " + i);
			this.owners.add(owner);
		}
	}

	public List<Owner> getOwners() {
		return owners;
	}

	public void setOwners(List<Owner> employees) {
		this.owners = employees;
	}

}
