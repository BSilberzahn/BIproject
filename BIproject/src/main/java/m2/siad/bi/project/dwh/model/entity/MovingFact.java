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
	private MovingCity city;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="surface_id",nullable=false)
	private MovingSurface surface;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="type_id",nullable=false)
	private MovingType type;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="duration_id",nullable=false)
	private MovingDuration durationInterval;
	@ManyToOne(optional=true,fetch=FetchType.EAGER)
	@JoinColumn(name="year_id",nullable=true)
	private Year year;
	public MovingPerson getPerson() {
		return person;
	}
	public void setPerson(MovingPerson person) {
		this.person = person;
	}
	public MovingCity getCity() {
		return city;
	}
	public void setCity(MovingCity city) {
		this.city = city;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public MovingSurface getSurface() {
		return surface;
	}
	public void setSurface(MovingSurface surface) {
		this.surface = surface;
	}
	public MovingType getType() {
		return type;
	}
	public void setType(MovingType type) {
		this.type = type;
	}
	public MovingDuration getDuration() {
		return durationInterval;
	}
	public void setDuration(MovingDuration durationInterval) {
		this.durationInterval = durationInterval;
	}
	
	
	
}