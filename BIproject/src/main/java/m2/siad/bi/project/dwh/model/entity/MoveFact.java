package m2.siad.bi.project.dwh.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(MovePK.class)
@Table(name="move_fact")

public class MoveFact implements Serializable {

	@Id
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_contract_id",nullable=false)
	private Contract contract;
	@Id
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_departure_city_id",nullable=false)
	private City cityDeparture;
	@Id
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_arrival_city_id",nullable=false)
	private City cityArrival;
	@Id
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_type_id",nullable=false)
	private MoveType type;
	@Id
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_indicator_id",nullable=false)
	private MoveIndicator indicator;
	@Id
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_year_id",nullable=false)
	private Year year;
	@Id
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="dimension_duration_id",nullable=false)
	private MoveDuration duration;
	@Id
	@Column(name = "dimension_nationality",nullable=false)
	private String nationalityDimension;
	@Id
	@Column(name = "dimension_age",nullable=false)
	private String ageIntervalDimension;
	@Id
	@Column(name = "dimension_gender",nullable=false)
	private String genderDimension;
	@Id
	@Column(name = "dimension_conveyance",nullable=false)
	private String meansLocomotionDimension;
	@Id
	@Column(name = "dimension_immigrant",nullable=false)
	private String immigrantDimension;
	@Id
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