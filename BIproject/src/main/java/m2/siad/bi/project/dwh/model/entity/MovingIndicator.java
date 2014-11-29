package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_moving_indicator")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="moving_indicator_id"))
		)
public class MovingIndicator extends BaseEntities{
	
	@Column(name = "indicator_type",nullable=false,unique=true)
	private String indicatorType;
	@Column(name = "indicator_category",nullable=false,unique=true)
	private String indicatorCategory;
	
	public String getIndicatorType() {
		return indicatorType;
	}
	public void setIndicatorType(String indicatorType) {
		this.indicatorType = indicatorType;
	}
	public String getIndicatorCategory() {
		return indicatorCategory;
	}
	public void setIndicatorCategory(String indicatorCategory) {
		this.indicatorCategory = indicatorCategory;
	}

}
