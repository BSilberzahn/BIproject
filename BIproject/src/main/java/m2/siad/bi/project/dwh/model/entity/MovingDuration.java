package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_moving_duration")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="moving_duration_id"))
		)
public class MovingDuration extends BaseEntities{
	@Column(name = "duration",nullable=false,unique=true)
	private String duration;
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

}