package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="tbl_energy_household_location")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="household_location_id"))
		)
public class EnergyHouseholdLocation extends BaseEntities{
	@Column(name = "housing_rooms_number",nullable=false)
	private String housingoomsNumber;
	@Column(name = "housing_surface_area",nullable=false)
	private String housingSurfaceArea;
	// gaz / electricite ...
	@Column(name = "fuel_type",nullable=false)
	private String fuelType;
	//commun / individuel
	@Column(name = "heating_category",nullable=false)
	private String heatingCategory;
	
	
	public String getHousingoomsNumber() {
		return housingoomsNumber;
	}
	public void setHousingoomsNumber(String housingoomsNumber) {
		this.housingoomsNumber = housingoomsNumber;
	}
	public String getHousingSurfaceArea() {
		return housingSurfaceArea;
	}
	public void setHousingSurfaceArea(String housingSurfaceArea) {
		this.housingSurfaceArea = housingSurfaceArea;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getHeatingCategory() {
		return heatingCategory;
	}
	public void setHeatingCategory(String heatingCategory) {
		this.heatingCategory = heatingCategory;
	}
	
	

	
}
