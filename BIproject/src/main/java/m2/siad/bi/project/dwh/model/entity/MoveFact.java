package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@AttributeOverrides(
        @AttributeOverride(name="id",column=@Column(name="id"))
)
@Table(name="move_fact",
	uniqueConstraints=@UniqueConstraint(columnNames={
			"dimension_year_id",
			"dimension_age",
			"dimension_departure_city_id",
			"dimension_arrival_city_id",
			"dimension_contract_id",
			"dimension_indicator_id",
			"dimension_immigrant",
			"dimension_gender",
			"dimension_nationality",
			"dimension_economic_activity",
			"dimension_conveyance",
			"dimension_type_id",
			"dimension_duration_id",
			
			
			}))

public class MoveFact  extends BaseEntities{

	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_contract_id",nullable=false)
	private Contract contract;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_departure_city_id",nullable=false)
	private City cityDeparture;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_arrival_city_id",nullable=false)
	private City cityArrival;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_type_id",nullable=false)
	private MoveType type;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_indicator_id",nullable=false)
	private MoveIndicator indicator;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_year_id",nullable=false)
	private Year year;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_duration_id",nullable=false)
	private MoveDuration duration;
	@Column(name = "dimension_nationality",nullable=false)
	private String nationalityDimension;
	@Column(name = "dimension_age",nullable=false)
	private String ageIntervalDimension;
	@Column(name = "dimension_gender",nullable=false)
	private String genderDimension;
	@Column(name = "dimension_conveyance",nullable=false)
	private String meansLocomotionDimension;
	@Column(name = "dimension_immigrant",nullable=false)
	private String immigrantDimension;
	@Column(name = "dimension_economic_activity",nullable=false)
	private String economicActivityDimension;
	
	
	//measure
	@Column(name = "measure_duration",nullable=false)
	private int durationMeasure;
	@Column(name = "measure_estimated_wage",nullable=false)
	private Float estimatedWageMeasure;
	@Column(name = "measure_weight",nullable=false)
	private Float weightMeasure;
	
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
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
	public MoveType getType() {
		return type;
	}
	public void setType(MoveType type) {
		this.type = type;
	}
	public MoveIndicator getIndicator() {
		return indicator;
	}
	public void setIndicator(MoveIndicator indicator) {
		this.indicator = indicator;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public MoveDuration getDuration() {
		return duration;
	}
	public void setDuration(MoveDuration duration) {
		this.duration = duration;
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
	public Float getEstimatedWageMeasure() {
		return estimatedWageMeasure;
	}
	public void setEstimatedWageMeasure(Float estimatedWageMeasure) {
		this.estimatedWageMeasure = estimatedWageMeasure;
	}
	public Float getWeightMeasure() {
		return weightMeasure;
	}
	public void setWeightMeasure(Float weightMeasure) {
		this.weightMeasure = weightMeasure;
	}
	
	
	
}