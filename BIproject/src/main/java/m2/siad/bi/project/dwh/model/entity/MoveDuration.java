package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="move_duration")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="duration_id"))
		)
public class MoveDuration extends BaseEntities{
	@Column(name = "duration",nullable=true)
	private String duration;
	@Column(name = "duration_category",nullable=true)
	private String durationCategory;
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDurationCategory() {
		return durationCategory;
	}
	public void setDurationCategory(String durationCategory) {
		this.durationCategory = durationCategory;
	}

	
}
