package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_city")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="city_id"))
		)
public class City extends BaseEntities{
	@Column(name = "city_name",nullable=true)
	private String name;
	@Column(name = "code_insee",nullable=true)
	private String inseeCode;
	@Column(name = "latitude",nullable=true)
	private Float latitude;
	@Column(name = "longitude",nullable=true)
	private Float longitude;
	@Column(name = "region",nullable=true)
	private String region;
	@Column(name = "departement",nullable=true)
	private String departement;
	@Column(name = "density_interval",nullable=true)
	private Integer populationDensity;
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
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
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
	public Integer getPopulationDensity() {
		return populationDensity;
	}
	public void setPopulationDensity(Integer populationDensity) {
		this.populationDensity = populationDensity;
	}
	
}