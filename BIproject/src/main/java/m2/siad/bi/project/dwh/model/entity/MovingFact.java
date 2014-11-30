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
@AttributeOverrides(
        @AttributeOverride(name="id",column=@Column(name="person_id"))
)
@Table(name="tbl_moving_fact",
	uniqueConstraints=@UniqueConstraint(columnNames={
			"person_id",
			"contract_id",
			"city_departure_id",
			"city_arrival_id",
			"type_id",
			"indicator_id",
			"year_id",
			"duration_dimension",
			"nationality_dimension",
			"age_interval_dimension",
			"sex_dimension",
			"means_locomotion_dimension",
			"immigrant_dimension",
			"economic_activity_dimension"}))

public class MovingFact extends BaseEntities{
	 
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="contract_id",nullable=false)
	private MovingContract contract;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="city_departure_id",nullable=false)
	private City cityDeparture;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="city_arrival_id",nullable=false)
	private City cityArrival;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="type_id",nullable=false)
	private MovingType type;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="indicator_id",nullable=false)
	private MovingIndicator indicator;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="year_id",nullable=false)
	private Year year;
	@Column(name = "duration_dimension",nullable=false)
	private String durationDimension;
	@Column(name = "nationality_dimension",nullable=false)
	private String nationalityDimension;
	@Column(name = "age_interval_dimension",nullable=false)
	private String ageIntervalDimension;
	@Column(name = "sex_dimension",nullable=false)
	private String sexDimension;
	@Column(name = "means_locomotion_dimension",nullable=false)
	private String meansLocomotionDimension;
	@Column(name = "immigrant_dimension",nullable=false)
	private String immigrantDimension;
	@Column(name = "economic_activity_dimension",nullable=false)
	private String economicActivityDimension;
	
	
	//measure
	@Column(name = "duration_measure",nullable=true)
	private int durationMeasure;
	@Column(name = "vulnerable_coefficient",nullable=true)
	private Float vulnerableCoefficient;
	
	
	public MovingContract getContract() {
		return contract;
	}
	public void setContract(MovingContract contract) {
		this.contract = contract;
	}
	public City getCityDeparture() {
		return cityDeparture;
	}
	public void setCityDeparture(City cityDeparture) {
		this.cityDeparture = cityDeparture;
	}
	public City getCityArrival() {
		return cityArrival;
	}
	public void setCityArrival(City cityArrival) {
		this.cityArrival = cityArrival;
	}
	public MovingType getType() {
		return type;
	}
	public void setType(MovingType type) {
		this.type = type;
	}
	public MovingIndicator getIndicator() {
		return indicator;
	}
	public void setIndicator(MovingIndicator indicator) {
		this.indicator = indicator;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public String getDurationDimension() {
		return durationDimension;
	}
	public void setDurationDimension(String durationDimension) {
		this.durationDimension = durationDimension;
	}
	public String getNationalityDimension() {
		return nationalityDimension;
	}
	public void setNationalityDimension(String nationalityDimension) {
		this.nationalityDimension = nationalityDimension;
	}
	public String getAgeIntervalDimension() {
		return ageIntervalDimension;
	}
	public void setAgeIntervalDimension(String ageIntervalDimension) {
		this.ageIntervalDimension = ageIntervalDimension;
	}
	public String getSexDimension() {
		return sexDimension;
	}
	public void setSexDimension(String sexDimension) {
		this.sexDimension = sexDimension;
	}
	public String getMeansLocomotionDimension() {
		return meansLocomotionDimension;
	}
	public void setMeansLocomotionDimension(String meansLocomotionDimension) {
		this.meansLocomotionDimension = meansLocomotionDimension;
	}
	public String getImmigrantDimension() {
		return immigrantDimension;
	}
	public void setImmigrantDimension(String immigrantDimension) {
		this.immigrantDimension = immigrantDimension;
	}
	public String getEconomicActivityDimension() {
		return economicActivityDimension;
	}
	public void setEconomicActivityDimension(String economicActivityDimension) {
		this.economicActivityDimension = economicActivityDimension;
	}
	public int getDurationMeasure() {
		return durationMeasure;
	}
	public void setDurationMeasure(int durationMeasure) {
		this.durationMeasure = durationMeasure;
	}
	public Float getVulnerableCoefficient() {
		return vulnerableCoefficient;
	}
	public void setVulnerableCoefficient(Float vulnerableCoefficient) {
		this.vulnerableCoefficient = vulnerableCoefficient;
	}
	
	
}