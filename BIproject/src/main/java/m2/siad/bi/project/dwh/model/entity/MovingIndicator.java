package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_moving_indicator")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="indicator_id"))
		)
public class MovingIndicator extends BaseEntities{
	
	@Column(name = "indicator_name",nullable=true)
	private String indicatorName;
	@Column(name = "indicator_category",nullable=true)
	private String indicatorCategory;
	
	
	public String getIndicatorName() {
		return indicatorName;
	}
	public void setIndicatorName(String indicatorName) {
		this.indicatorName = indicatorName;
	}
	public String getIndicatorCategory() {
		return indicatorCategory;
	}
	public void setIndicatorCategory(String indicatorCategory) {
		this.indicatorCategory = indicatorCategory;
	}

}
