package ca.webcadastre.model.entity;

// default package
// Generated Aug 8, 2018 4:59:45 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Property generated by hbm2java
 */
public class Property implements java.io.Serializable {

	private int idProperty;
	private TypeProperty typeProperty;
	private String numLot;
	private String numParcel;
	private Integer address;
	private int active;
	private Set persons = new HashSet(0);

	public Property() {
	}

	public Property(int idProperty, int active) {
		this.idProperty = idProperty;
		this.active = active;
	}

	public Property(int idProperty, TypeProperty typeProperty, String numLot, String numParcel, Integer address,
			int active, Set persons) {
		this.idProperty = idProperty;
		this.typeProperty = typeProperty;
		this.numLot = numLot;
		this.numParcel = numParcel;
		this.address = address;
		this.active = active;
		this.persons = persons;
	}

	public int getIdProperty() {
		return this.idProperty;
	}

	public void setIdProperty(int idProperty) {
		this.idProperty = idProperty;
	}

	public TypeProperty getTypeProperty() {
		return this.typeProperty;
	}

	public void setTypeProperty(TypeProperty typeProperty) {
		this.typeProperty = typeProperty;
	}

	public String getNumLot() {
		return this.numLot;
	}

	public void setNumLot(String numLot) {
		this.numLot = numLot;
	}

	public String getNumParcel() {
		return this.numParcel;
	}

	public void setNumParcel(String numParcel) {
		this.numParcel = numParcel;
	}

	public Integer getAddress() {
		return this.address;
	}

	public void setAddress(Integer address) {
		this.address = address;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set getPersons() {
		return this.persons;
	}

	public void setPersons(Set persons) {
		this.persons = persons;
	}

}