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
@Table(name="tbl_moving_fact",
	uniqueConstraints=@UniqueConstraint(columnNames={"person_id"}))
@AttributeOverrides(
        @AttributeOverride(name="id",column=@Column(name="moving_fact_id"))
)
public class MovingFact extends BaseEntities{
	 
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="person_id",nullable=false)
	private MovingPerson person;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="city_id",nullable=false)
	private City city;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="type_id",nullable=false)
	private MovingType type;
	@ManyToOne(optional=true,fetch=FetchType.EAGER)
	@JoinColumn(name="year_id",nullable=true)
	private Year year;
	@Column(name = "duration",nullable=true)
	private int duration;
	@Column(name = "vulnerable_coefficient",nullable=true)
	private int vulnerableCoefficient;
	
	public MovingPerson getPerson() {
		return person;
	}
	public void setPerson(MovingPerson person) {
		this.person = person;
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
	public MovingType getType() {
		return type;
	}
	public void setType(MovingType type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getVulnerableCoefficient() {
		return vulnerableCoefficient;
	}
	public void setVulnerableCoefficient(int vulnerableCoefficient) {
		this.vulnerableCoefficient = vulnerableCoefficient;
	}
	
}