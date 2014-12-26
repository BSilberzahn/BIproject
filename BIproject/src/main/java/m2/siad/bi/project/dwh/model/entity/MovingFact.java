package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
//@AttributeOverrides(
//        @AttributeOverride(name="id",column=@Column(name="person_id"))
//)
@Table(name="tbl_moving_fact",
	uniqueConstraints=@UniqueConstraint(columnNames={
			"person_id",
			"year_id",
			"age_dimension",
			"departure_city_id",
			"arrival_city_id",
			"contract_id",
			"indicator_id",
			"immigrant_dimension",
			"gender_dimension",
			"nationality_dimension",
			"economic_activity_dimension",
			"conveyance_dimension",
			"type_id",
			"duration_dimension",
			
			
			}))

public class MovingFact{

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "person_id",nullable=true)
	private Integer personId;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="contract_id",nullable=true)
	private MovingContract contract;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="departure_city_id",nullable=true)
	private City cityDeparture;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="arrival_city_id",nullable=true)
	private City cityArrival;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="type_id",nullable=true)
	private MovingType type;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="indicator_id",nullable=true)
	private MovingIndicator indicator;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="year_id",nullable=true)
	private Year year;
	@Column(name = "duration_dimension",nullable=true)
	private String durationDimension;
	@Column(name = "nationality_dimension",nullable=true)
	private String nationalityDimension;
	@Column(name = "age_dimension",nullable=true)
	private String ageIntervalDimension;
	@Column(name = "gender_dimension",nullable=true)
	private String genderDimension;
	@Column(name = "conveyance_dimension",nullable=true)
	private String meansLocomotionDimension;
	@Column(name = "immigrant_dimension",nullable=true)
	private String immigrantDimension;
	@Column(name = "economic_activity_dimension",nullable=true)
	private String economicActivityDimension;
	@Column(name = "vulnerability_duration_dimension",nullable=true)
	private Float vulnerabilityDurationDimension;
	
	
	
	//measure
	@Column(name = "duration_measure",nullable=true)
	private int durationMeasure;
	@Column(name = "estimated_wage_measure",nullable=true)
	private Float estimatedWageMeasure;
	
	
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
	public String getGenderDimension() {
		return genderDimension;
	}
	public void setGenderDimension(String genderDimension) {
		this.genderDimension = genderDimension;
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
	public Float getVulnerabilityDurationDimension() {
		return vulnerabilityDurationDimension;
	}
	public void setVulnerabilityDurationDimension(
			Float vulnerabilityDurationDimension) {
		this.vulnerabilityDurationDimension = vulnerabilityDurationDimension;
	}
	public Float getEstimatedWageMeasure() {
		return estimatedWageMeasure;
	}
	public void setEstimatedWageMeasure(Float estimatedWageMeasure) {
		this.estimatedWageMeasure = estimatedWageMeasure;
	}
	
	
	
}