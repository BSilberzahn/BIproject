package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_year")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="year_id"))
		)
public class Year extends BaseEntities{

	@Column(name = "year",nullable=false)
	private String year;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
}
