package ca.webcadastre.model.entity;

// default package
// Generated Aug 8, 2018 4:59:45 PM by Hibernate Tools 5.3.0.Beta2

/**
 * City generated by hbm2java
 */
public class City implements java.io.Serializable {

	private Integer idCity;
	private String city;

	public City() {
	}

	public City(String city) {
		this.city = city;
	}

	public Integer getIdCity() {
		return this.idCity;
	}

	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
