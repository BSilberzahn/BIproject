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
	@Column(name = "city",nullable=false,unique=true)
	private String city;
	@Column(name = "contract_type",nullable=false,unique=true)
	private String contractType;
	@Column(name = "studies_place",nullable=false,unique=true)
	private String studiesPlace;
	@Column(name = "job_place",nullable=false,unique=true)
	private String jobPlace;
	
	
	
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

}
