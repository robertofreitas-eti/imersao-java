package br.eti.freitas.projetoanjo.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name="address")
@SQLDelete(sql = "UPDATE address SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class Address {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;

	@Column(name = "streetName", length = 50, nullable = false)
	private String streetName;

	@Column(name = "buildingNumber", length = 16)
	private String buildingNumber;

	@Column(name = "addressLine", length = 50, nullable = true)
	private String addressLine;

	@Column(name = "city", length = 40, nullable = true)
	private String city;

	@Column(name = "potal_code", length = 10, nullable = false)
	private String postalCode;

	@Column(name = "country", length = 2, nullable = false)
	private String country;

	@Column(name="deleted", nullable=false)
	private boolean deleted = Boolean.FALSE;

	/**
	 * Constructors
	 */
	public Address() {
	}

	public Address(UUID id, String streetName, String buildingNumber, String addressLine, String city,
			String postalCode, String country) {
		this.id = id;
		this.streetName = streetName;
		this.buildingNumber = buildingNumber;
		this.addressLine = addressLine;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
	}

	/** 
	 * Getters and Setters
	 */
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
