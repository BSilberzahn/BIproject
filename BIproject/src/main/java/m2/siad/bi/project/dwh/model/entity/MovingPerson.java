package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_moving_person")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="moving_person_id"))
		)
public class MovingPerson extends BaseEntities{
	@Column(name = "city",nullable=false)
	private String city;
	@Column(name = "contract_type",nullable=false)
	private String contractType;
	@Column(name = "studies_place",nullable=false)
	private String studiesPlace;
	@Column(name = "job_place",nullable=false)
	private String jobPlace;
	@Column(name = "immigrant_situation",nullable=false)
	private String immigrantSituation;
	@Column(name = "person_type",nullable=false)
	private String personType;
	@Column(name = "nationality",nullable=false)
	private String nationality;
	@Column(name = "activity_type",nullable=false)
	private String activityType;
	@Column(name = "economic_activity",nullable=false)
	private String economicActivity;
	@Column(name = "means_locomotion",nullable=false)
	private String meansLocomotion;
	@Column(name = "decade_age",nullable=false)
	private String decadeAge;
	@Column(name = "quinquennial_age",nullable=false)
	private String quinquennialAge;
	@Column(name = "average_duration",nullable=false)
	private String averageDuration;
	
	
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public String getStudiesPlace() {
		return studiesPlace;
	}
	public void setStudiesPlace(String studiesPlace) {
		this.studiesPlace = studiesPlace;
	}
	public String getJobPlace() {
		return jobPlace;
	}
	public void setJobPlace(String jobPlace) {
		this.jobPlace = jobPlace;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getImmigrantSituation() {
		return immigrantSituation;
	}
	public void setImmigrantSituation(String immigrantSituation) {
		this.immigrantSituation = immigrantSituation;
	}
	public String getPersonType() {
		return personType;
	}
	public void setPersonType(String personType) {
		this.personType = personType;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getActivityType() {
		return activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public String getEconomicActivity() {
		return economicActivity;
	}
	public void setEconomicActivity(String economicActivity) {
		this.economicActivity = economicActivity;
	}
	public String getMeansLocomotion() {
		return meansLocomotion;
	}
	public void setMeansLocomotion(String meansLocomotion) {
		this.meansLocomotion = meansLocomotion;
	}
	public String getDecadeAge() {
		return decadeAge;
	}
	public void setDecadeAge(String decadeAge) {
		this.decadeAge = decadeAge;
	}
	public String getQuinquennialAge() {
		return quinquennialAge;
	}
	public void setQuinquennialAge(String quinquennialAge) {
		this.quinquennialAge = quinquennialAge;
	}
	public String getAverageDuration() {
		return averageDuration;
	}
	public void setAverageDuration(String averageDuration) {
		this.averageDuration = averageDuration;
	}
	
	

}
