package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="tbl_energy_fact",
	uniqueConstraints=@UniqueConstraint(columnNames={"household_id"}))
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="energy_fact_id"))
		)
public class EnergyFact extends BaseEntities{

	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="household_location_id",nullable=false)
	private EnergyHouseholdLocation householdLocation;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="household_id",nullable=false)
	private EnergyHousehold household;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="city_id",nullable=false)
	private City city;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="year_id",nullable=false)
	private Year year;
	
	//measures
	@Column(name = "person_number",nullable=true)
	private int personNumber;
	@Column(name = "taux_d_effort_energetique",nullable=true)
	private int effortEnergetique;
	@Column(name = "revenus_annuels",nullable=true)
	private int revenusAnnuels;
	
	public EnergyHouseholdLocation getHouseholdLocation() {
		return householdLocation;
	}
	public void setHouseholdLocation(EnergyHouseholdLocation householdLocation) {
		this.householdLocation = householdLocation;
	}
	public EnergyHousehold getHousehold() {
		return household;
	}
	public void setHousehold(EnergyHousehold household) {
		this.household = household;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public int getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}
	public int getEffortEnergetique() {
		return effortEnergetique;
	}
	public void setEffortEnergetique(int effortEnergetique) {
		this.effortEnergetique = effortEnergetique;
	}
	public int getRevenusAnnuels() {
		return revenusAnnuels;
	}
	public void setRevenusAnnuels(int revenusAnnuels) {
		this.revenusAnnuels = revenusAnnuels;
	}
	
}
