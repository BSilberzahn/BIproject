package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_city")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="moving_city_id"))
		)
public class City extends BaseEntities{
	@Column(name = "name",nullable=false,unique=true)
	private String name;
	@Column(name = "code_insee",nullable=false,unique=true)
	private String inseeCode;
	@Column(name = "latitude",nullable=false,unique=true)
	private String latitude;
	@Column(name = "longitude",nullable=false,unique=true)
	private String longitude;
	@Column(name = "region",nullable=false,unique=true)
	private String region;
	@Column(name = "departement",nullable=false,unique=true)
	private String departement;
	@Column(name = "population_density",nullable=false,unique=true)
	private String populationDensity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInseeCode() {
		return inseeCode;
	}
	public void setInseeCode(String inseeCode) {
		this.inseeCode = inseeCode;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getPopulationDensity() {
		return populationDensity;
	}
	public void setPopulationDensity(String populationDensity) {
		this.populationDensity = populationDensity;
	}
	
}