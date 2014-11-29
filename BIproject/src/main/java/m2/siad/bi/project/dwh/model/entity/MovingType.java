package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_moving_type")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="moving_type_id"))
		)
public class MovingType extends BaseEntities{
	@Column(name = "service",nullable=false)
	private String service;
	@Column(name = "category",nullable=false)
	private String category;
	
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}