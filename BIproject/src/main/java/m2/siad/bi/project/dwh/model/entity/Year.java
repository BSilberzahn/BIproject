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
	@Column(name = "student_year",nullable=false,unique=true)
	private String studentYear;
	public String getStudentYear() {
		return studentYear;
	}
	public void setStudentYear(String studentYear) {
		this.studentYear = studentYear;
	}
	
}
