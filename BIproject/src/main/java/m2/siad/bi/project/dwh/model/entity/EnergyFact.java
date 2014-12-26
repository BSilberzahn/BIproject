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
@Table(name="tbl_energy_fact")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="energy_fact_id"))
		)
public class EnergyFact extends BaseEntities{

//	@ManyToOne(optional=false,fetch=FetchType.EAGER)
//	@JoinColumn(name="household_location_id",nullable=true)
//	private EnergyHouseholdLocation householdLocation;
//	@ManyToOne(optional=false,fetch=FetchType.EAGER)
//	@JoinColumn(name="household_id",nullable=true)
//	private EnergyHousehold household;
//	@ManyToOne(optional=false,fetch=FetchType.EAGER)
//	@JoinColumn(name="city_id",nullable=true)
//	private City city;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="year_id",nullable=true)
	private Year year;
//	@ManyToOne(optional=false,fetch=FetchType.EAGER)
//	@JoinColumn(name="contract_id",nullable=true)
//	private Contract contract;
//	@Column(name = "nationality_dimension",nullable=true)
//	private String nationalityDimension;
//	@Column(name = "immigrant_dimension",nullable=true)
//	private String immigrantDimension;
//	@Column(name = "economic_activity_dimension",nullable=true)
//	private String economicActivityDimension;
	@Column(name = "heating_category_dimension",nullable=true)
	private String heatingCategoryDimension;
	@Column(name = "fuel_type_dimension",nullable=true)
	private String fuelTypeDimension;
	@Column(name = "housing_surface_area_dimension",nullable=true)
	private String housingSurfaceAreaDimension;
	@Column(name = "housing_rooms_number_dimension",nullable=true)
	private String housingRoomsNumberDimension;
	
	//measures
//	@Column(name = "person_count",nullable=true)
//	private int personCount;
//	@Column(name = "household_count",nullable=true)
//	private int householdCount;
//	@Column(name = "energy_effort_rate",nullable=true)
//	private int energyEffortRate;
//	@Column(name = "annual_incomes",nullable=true)
//	private int annualIncomes;
//	@Column(name = "estimation_annual_expenses",nullable=true)
//	private int estimationAnnualExpenses;
	
//	public EnergyHouseholdLocation getHouseholdLocation() {
//		return householdLocation;
//	}
//	public void setHouseholdLocation(EnergyHouseholdLocation householdLocation) {
//		this.householdLocation = householdLocation;
//	}
//	public EnergyHousehold getHousehold() {
//		return household;
//	}
//	public void setHousehold(EnergyHousehold household) {
//		this.household = household;
//	}
//	public City getCity() {
//		return city;
//	}
//	public void setCity(City city) {
//		this.city = city;
//	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	
//	public int getPersonCount() {
//		return personCount;
//	}
//	public void setPersonCount(int personCount) {
//		this.personCount = personCount;
//	}
//	public int getHouseholdCount() {
//		return householdCount;
//	}
//	public void setHouseholdCount(int householdCount) {
//		this.householdCount = householdCount;
//	}
//	public int getEnergyEffortRate() {
//		return energyEffortRate;
//	}
//	public void setEnergyEffortRate(int energyEffortRate) {
//		this.energyEffortRate = energyEffortRate;
//	}
//	public int getAnnualIncomes() {
//		return annualIncomes;
//	}
//	public void setAnnualIncomes(int annualIncomes) {
//		this.annualIncomes = annualIncomes;
//	}
//	public int getEstimationAnnualExpenses() {
//		return estimationAnnualExpenses;
//	}
//	public void setEstimationAnnualExpenses(int estimationAnnualExpenses) {
//		this.estimationAnnualExpenses = estimationAnnualExpenses;
//	}
	
}
